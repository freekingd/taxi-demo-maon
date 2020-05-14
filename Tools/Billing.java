package org.texiDemo.Tools;

import org.texiDemo.entity.Order;

import java.util.Date;

/**
 * @program: seckill
 * @description  费用计算
 * @author: Maon
 * @create: 2020-05-14 00:37
 **/
public interface Billing {

    /**
     * 计算费用-普通 (startTime,endTime]
     * @param order
     * @return
     */
    public double  calculate(Order order);

    /**
     * 计算费用-优惠券
     * @param order
     * @param coupons 优惠券折扣
     * @return
     */
    public double  calculateByCoupons(Order order,float coupons);

}
