package com.jnu.poker;

import com.jnu.poker.enums.ColorEnum;
import com.jnu.poker.enums.ValueEnum;

/**
 * 单张扑克牌
 * Created by wwt on 2016/9/14.
 */
public class Poker {

    /**
     * 花色
     */
    private ColorEnum color;

    /**
     * 数值
     */
    private ValueEnum value;

    public Poker(){

    }

    public Poker(ColorEnum color,ValueEnum value){
        this.color=color;
        this.value=value;
    }

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public ValueEnum getValue() {
        return value;
    }

    public void setValue(ValueEnum value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Poker{" +
                "color=" + color +
                ", value=" + value +
                '}';
    }
}
