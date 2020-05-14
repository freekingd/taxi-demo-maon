package org.texiDemo.Tools.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.texiDemo.Tools.Billing;
import org.texiDemo.entity.Order;

/**
 * @program: seckill
 * @description  假设增加了私家车类型
 * @author: Maon
 * @create: 2020-05-14 01:15
 **/
public class BillingCarsImpl implements Billing {
    @Autowired
    private Order order;

    /**
     * 计算费用-普通 (startTime,endTime]
     * @param order
     * @return
     */
    public double  calculate(Order order){
        double price = 0.00;
        return price;
    }

    /**
     * 计算费用-优惠券
     * @param order
     * @param coupons 优惠券折扣
     * @return
     */
    public double  calculateByCoupons(Order order,float coupons){
        double price = 0.00;

        return price;
    }
}
