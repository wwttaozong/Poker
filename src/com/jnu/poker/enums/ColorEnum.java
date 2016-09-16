package com.jnu.poker.enums;

/**
 * 花色枚举
 * Created by wwt on 2016/9/14.
 */
public enum ColorEnum {

    SPADE("黑桃"),
    HEART("红桃"),
    CLUB("梅花"),
    DIAMOND("方片");

    private String desc;

    private ColorEnum(String desc){
        this.desc=desc;
    }

    public String getDesc() {
        return desc;
    }
}
