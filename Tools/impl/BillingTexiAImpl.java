package org.texiDemo.Tools.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.texiDemo.Tools.Billing;
import org.texiDemo.Tools.DistanceCalculate;
import org.texiDemo.Tools.TimeCalculate;
import org.texiDemo.entity.Order;

import java.util.Date;

/**
 * @program: seckill
 * @description 出租车甲类型,通过订单信息计算费用
 * @author: Maon
 * @create: 2020-05-14 00:50
 **/
public class BillingTexiAImpl implements Billing{

    private Date startTime;
    private int distance;

    @Autowired
    private DistanceCalculate distanceCalculate;
    private TimeCalculate timeCalculate;


    /**
     * 计算费用-普通 (startTime,endTime]
     * @param order
     * @return
     */
    public double  calculate(Order order){
        startTime = order.getStartTime();
        distance = order.getdistance();
        double price = 0.00;
        //计费
        //白天，3公里内
        if(timeCalculate.getTimeFlag(startTime) == 1 && distanceCalculate.getDistanceFlag(distance) == 1){
            price = 14.00;
        }else if(timeCalculate.getTimeFlag(startTime) == 1 && distanceCalculate.getDistanceFlag(distance) == 2){  //白天， >3公里且 <=10公里
            price = 14.00 + (Math.round(distance-3) * 2.5);
        }else if(timeCalculate.getTimeFlag(startTime) == 1 && distanceCalculate.getDistanceFlag(distance) == 3){  //白天， >10公里
            price = 14.00 + (Math.round(distance-3) * 3.5);
        }else if(timeCalculate.getTimeFlag(startTime) == 2 && distanceCalculate.getDistanceFlag(distance) == 3){  //晚上， 3公里内
            price = 18.00;
        }else if(timeCalculate.getTimeFlag(startTime) == 2 && distanceCalculate.getDistanceFlag(distance) == 3){  //晚上， >3公里且 <=10公里
            price = 18.00 + (Math.round(distance-3) * 3);
        }else if(timeCalculate.getTimeFlag(startTime) == 2 && distanceCalculate.getDistanceFlag(distance) == 3){  //晚上， >10公里
            price = 18.00 + (Math.round(distance-3) * 4.7);
        }
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
