package org.texiDemo.entity;

/**
 * @program: seckill
 * @description
 * @author: Maon
 * @create: 2020-05-14 00:30
 **/
public class Texi {
    private long texi_id;

    //起步价
    private double price;

    //3~10公里单价
    private double unit_1;

    //10公里以上单价
    private double unit_2;

    private long order_id;

    public long getTexi_id() {
        return texi_id;
    }

    public void setTexi_id(long texi_id) {
        this.texi_id = texi_id;
    }

    public long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(long order_id) {
        this.order_id = order_id;
    }
}
