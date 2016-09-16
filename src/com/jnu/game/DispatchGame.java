package com.jnu.game;

import com.jnu.poker.Poker;

import java.util.Random;


/**
 * 题意所给的玩法，发牌游戏
 * Created by wwt on 2016/9/14.
 */
public class DispatchGame extends AbstractPokerGame {

    @Override
    public void doRule() {
        //参数check
        if(pokers == null || pokers.isEmpty()){
            return ;
        }
        if(players == null || players.isEmpty()){
            return ;
        }
        Random random=new Random();
        for(Poker poker:pokers){
            int index=random.nextInt(playersNum);
            players.get(index).obtainPoker(poker);
        }
    }

}
