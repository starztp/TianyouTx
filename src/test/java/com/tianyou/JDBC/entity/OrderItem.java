package com.tianyou.JDBC.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by tianyou on 2020/2/27.
 */
@Table(name="order_item")
@Entity
public class OrderItem {

    private int id;
    private String num;
    private int type;
    private int style;
    private int status;
    private int parent_order_item_id;
    private int shop_id;
    private int prod_region;
    private int cus_region;
    private int product_id;
    private String product_name;
    private int sku_id;
    private String sku_name;
    private String seller_sku;
    private int warehouse;
    private int pay_type_id;
    private int source_type;
    private int ez_shipment_type_id;
    private int ez_customer_id;
    private int ez_order_id;
    private int ez_order_item_id;
    private int ez_package_id;
    private boolean is_active;
    private int delivery_method;
    private long create_date;
    private long update_date;
    private long cancel_date;
    private long payment_date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStyle() {
        return style;
    }

    public void setStyle(int style) {
        this.style = style;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getParent_order_item_id() {
        return parent_order_item_id;
    }

    public void setParent_order_item_id(int parent_order_item_id) {
        this.parent_order_item_id = parent_order_item_id;
    }

    public int getShop_id() {
        return shop_id;
    }

    public void setShop_id(int shop_id) {
        this.shop_id = shop_id;
    }

    public int getProd_region() {
        return prod_region;
    }

    public void setProd_region(int prod_region) {
        this.prod_region = prod_region;
    }

    public int getCus_region() {
        return cus_region;
    }

    public void setCus_region(int cus_region) {
        this.cus_region = cus_region;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getSku_id() {
        return sku_id;
    }

    public void setSku_id(int sku_id) {
        this.sku_id = sku_id;
    }

    public String getSku_name() {
        return sku_name;
    }

    public void setSku_name(String sku_name) {
        this.sku_name = sku_name;
    }

    public String getSeller_sku() {
        return seller_sku;
    }

    public void setSeller_sku(String seller_sku) {
        this.seller_sku = seller_sku;
    }

    public int getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(int warehouse) {
        this.warehouse = warehouse;
    }

    public int getPay_type_id() {
        return pay_type_id;
    }

    public void setPay_type_id(int pay_type_id) {
        this.pay_type_id = pay_type_id;
    }

    public int getSource_type() {
        return source_type;
    }

    public void setSource_type(int source_type) {
        this.source_type = source_type;
    }

    public int getEz_shipment_type_id() {
        return ez_shipment_type_id;
    }

    public void setEz_shipment_type_id(int ez_shipment_type_id) {
        this.ez_shipment_type_id = ez_shipment_type_id;
    }

    public int getEz_customer_id() {
        return ez_customer_id;
    }

    public void setEz_customer_id(int ez_customer_id) {
        this.ez_customer_id = ez_customer_id;
    }

    public int getEz_order_id() {
        return ez_order_id;
    }

    public void setEz_order_id(int ez_order_id) {
        this.ez_order_id = ez_order_id;
    }

    public int getEz_order_item_id() {
        return ez_order_item_id;
    }

    public void setEz_order_item_id(int ez_order_item_id) {
        this.ez_order_item_id = ez_order_item_id;
    }

    public int getEz_package_id() {
        return ez_package_id;
    }

    public void setEz_package_id(int ez_package_id) {
        this.ez_package_id = ez_package_id;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public int getDelivery_method() {
        return delivery_method;
    }

    public void setDelivery_method(int delivery_method) {
        this.delivery_method = delivery_method;
    }

    public long getCreate_date() {
        return create_date;
    }

    public void setCreate_date(long create_date) {
        this.create_date = create_date;
    }

    public long getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(long update_date) {
        this.update_date = update_date;
    }

    public long getCancel_date() {
        return cancel_date;
    }

    public void setCancel_date(long cancel_date) {
        this.cancel_date = cancel_date;
    }

    public long getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(long payment_date) {
        this.payment_date = payment_date;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", num='" + num + '\'' +
                ", type=" + type +
                ", style=" + style +
                ", status=" + status +
                ", parent_order_item_id=" + parent_order_item_id +
                ", shop_id=" + shop_id +
                ", prod_region=" + prod_region +
                ", cus_region=" + cus_region +
                ", product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", sku_id=" + sku_id +
                ", sku_name='" + sku_name + '\'' +
                ", seller_sku='" + seller_sku + '\'' +
                ", warehouse=" + warehouse +
                ", pay_type_id=" + pay_type_id +
                ", source_type=" + source_type +
                ", ez_shipment_type_id=" + ez_shipment_type_id +
                ", ez_customer_id=" + ez_customer_id +
                ", ez_order_id=" + ez_order_id +
                ", ez_order_item_id=" + ez_order_item_id +
                ", ez_package_id=" + ez_package_id +
                ", is_active=" + is_active +
                ", delivery_method=" + delivery_method +
                ", create_date=" + create_date +
                ", update_date=" + update_date +
                ", cancel_date=" + cancel_date +
                ", payment_date=" + payment_date +
                '}';
    }
}
