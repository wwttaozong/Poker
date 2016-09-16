package com.jnu.game.enums;

/**
 * Created by wwt on 2016/9/14.
 */
public enum PokerGameModeEnum {

    DISPATCH_GAME(1,"发牌游戏");

    /**
     * 游戏模式
     */
    private int mode;

    private String desc;

    private PokerGameModeEnum(int mode, String desc){
        this.mode=mode;
        this.desc=desc;
    }

    public int getMode() {
        return mode;
    }

    public String getDesc() {
        return desc;
    }
}
