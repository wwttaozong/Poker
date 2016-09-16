package com.jnu.poker.enums;

/**
 * Created by wwt on 2016/9/14.
 */
public enum ValueEnum {

    ONE("A"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    ELEVEN("J"),
    TWELVE("Q"),
    THIRTEEN("K"),
    FOURTEEN("小王"),
    FIFTEEN("大王");

    private String desc;

    private ValueEnum(String desc){
        this.desc=desc;
    }

    public String getDesc() {
        return desc;
    }
}
