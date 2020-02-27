package com.tianyou.JDBC.test;


import com.mysql.jdbc.Driver;
import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;
import com.tianyou.JDBC.entity.OrderItem;
import org.junit.Test;

import javax.persistence.Column;
import javax.persistence.Table;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

/**
 * Created by tianyou on 2020/2/27.
 */
public class ResultSetTest {

    @Test
    public void TestResultSet(){

        OrderItem orderItem=new OrderItem();
        List<?> result=select(orderItem);
        System.out.println(Arrays.toString(result.toArray()));
    }


    /**
     * 返回关系型数据库查询结果集
     * @param condition 实体类对象
     * @return
     */
    private List<?> select(Object condition){
        List<Object> result=new ArrayList<Object>();
        Class<?> entityclass=condition.getClass();
        try {
            //1.加载驱动类
            Class<?> driver=Class.forName("com.mysql.jdbc.Driver");
            //2.建立连接
            Connection connection= DriverManager.getConnection("jdbc:mysql://192.168.199.112:3306/ezseller","root","ezbuyisthebest");
            //3.准备语句集
            Table table=entityclass.getAnnotation(Table.class);
            String sql="select * from "+table.name()+" Limit 3";
            PreparedStatement pstm=connection.prepareStatement(sql);
            //4.执行语句集，得到查询结果
            ResultSet resultSet=pstm.executeQuery();
            Field[] fields=entityclass.getDeclaredFields();
            //5.遍历结果集，将其转为实体类对象
            while (resultSet.next()){
                Object instance=entityclass.newInstance();
                for(Field field:fields){
                    //对private 修饰的字段进行强制访问
                    field.setAccessible(true);
                    //默认字段名就是列名，后期会根据表字段自动生成实体类字段
                    String columnname=field.getName();
                    //获取列名对应的值
                    Object resultvalue=resultSet.getObject(columnname);
                    //BigInteger强转int类型
                    if(resultvalue instanceof BigInteger){
                        resultvalue=((BigInteger) resultvalue).intValue();
                    }
                    field.set(instance,resultvalue);
                }
                //6.将转换成实体类的resultSet加入list中
                result.add(instance);
            }
            //6、关闭结果集、关闭语句集、关闭连接
            resultSet.close();
            pstm.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
