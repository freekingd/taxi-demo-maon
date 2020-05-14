package org.texiDemo.Tools;

/**
 * @program: seckill
 * @description  里程区间  方便重复使用与重新定义
 * @author: Maon
 * @create: 2020-05-14 01:55
 **/
public class DistanceCalculate {

    public int getDistanceFlag(int distance){
        //3公里内
        if(distance <= 3 ){
            return 1;
        }
        //3~10公里
        else if(distance > 3 && distance <= 10){
            return 2;
        }
        //>10公里
        else if(distance > 10){
            return 3;
        }
        return 0;
    }
}
