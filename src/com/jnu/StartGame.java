package com.jnu;

import com.jnu.game.BaseGame;
import com.jnu.game.GameFactory;
import com.jnu.game.enums.GameModeEnum;

/**
 * Created by wwt on 2016/9/14.
 */
public class StartGame {

    public static void main(String args[]){

        //程序启动参数解析，实际应用中此处应该优化UI、交互等
        checkAndParseArgs(args);
        
        BaseGame game=GameFactory.initGameByMode(GameModeEnum.DISPATCH_GAME);
        if(game != null) {
            game.play();
        }
        game.displayAllPokers();

    }

    private static void checkAndParseArgs(String args[]){
        if(args.length > 0){
            // TODO: 2016/9/14
        }else{
            System.out.println("游戏以默认参数启动");
        }
    }

}
