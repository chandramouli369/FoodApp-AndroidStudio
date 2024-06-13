package com.example.foodapp.Models;

public class OrdersModel {
    int orderimage;
    String ordername, orderprice, ordernumber;

    public OrdersModel(int orderimage, String ordername, String orderprice, String ordernumber) {
        this.orderimage = orderimage;
        this.ordername = ordername;
        this.orderprice = orderprice;
        this.ordernumber = ordernumber;
    }

    public int getOrderimage() {
        return orderimage;
    }

    public String getOrdername() {
        return ordername;
    }

    public String getOrderprice() {
        return orderprice;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrderimage(int orderimage) {
        this.orderimage = orderimage;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername;
    }

    public void setOrderprice(String orderprice) {
        this.orderprice = orderprice;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }
}