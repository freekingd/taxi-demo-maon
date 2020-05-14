package org.texiDemo.enums;

/**
 * @program: seckill
 * @description Time and Util Pirce  时间段和单价类型
 * @author: Maon
 * @create: 2020-05-14 01:44
 **/
public enum TandU {
    WHITEANDIN(1,"白天，3公里内"),
    WHITEANDOUT(2,"白天，3~10公里"),
    WHITEANDOVER(3,"白天，10公里以上"),
    NIGHTANDIN(4,"晚上，3公里内"),
    NIGHTANDOUT(5,"晚上，3~10公里"),
    NIGHTANDOVER(6,"晚上，10公里以上");


    //计费类型
    private int state;

    private String info;

    public int getState() {
        return state;
    }

    public String getInfo() {
        return info;
    }

    TandU(int state, String info) {
        this.state = state;
        this.info = info;
    }

    public static TandU stateOf(int index){
        for(TandU state:values()){
            if(state.getState() == index){
                return state;
            }
        }
        return null;
    }

}
