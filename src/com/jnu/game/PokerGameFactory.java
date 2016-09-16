package com.jnu.game;

import com.jnu.game.enums.PokerGameModeEnum;

/**
 * 游戏模式工厂，这里暂且用简单工厂
 * Created by wwt on 2016/9/14.
 */
public class PokerGameFactory {

    public static AbstractPokerGame initGameByMode(PokerGameModeEnum mode){
        AbstractPokerGame game=null;
        switch(mode){
            case DISPATCH_GAME:
                game=new DispatchGame();
                break;
            default:
                break;
        }
        return game;
    }

}
