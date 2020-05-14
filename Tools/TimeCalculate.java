package org.texiDemo.Tools;

import java.util.Calendar;
import java.util.Date;

/**
 * @program: seckill
 * @description 时间区间计算  方便重复使用与重新定义
 * @author: Maon
 * @create: 2020-05-14 01:51
 **/
public class TimeCalculate {

    public int getTimeFlag(Date startTime){
        //获取上车时间为几点
        Calendar cal = Calendar.getInstance();
        cal.setTime(startTime);
        int hours = cal.get( Calendar.HOUR_OF_DAY );
        //白天
        if(hours > 6 && hours <= 18){
            return 1;
        }
        //晚上
        else if((hours > 18 && hours <= 24) || hours <= 6){
            return 2;
        }
        return 0;
    }

}
