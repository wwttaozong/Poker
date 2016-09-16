package com.jnu.game;

import com.jnu.player.PokerPlayer;
import com.jnu.poker.Poker;
import com.jnu.poker.enums.ColorEnum;
import com.jnu.poker.enums.ValueEnum;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by wwt on 2016/9/14.
 */
public abstract class AbstractPokerGame implements Game{

    /**
     * 玩家数量，默认是4
     */
    protected int playersNum=4;

    /**
     * 扑克牌副数，默认是1
     */
    protected int setsNum=1;

    /**
     * 游戏牌的集合
     */
    protected ArrayList<Poker> pokers;

    /**
     * 玩家的集合
     */
    protected ArrayList<PokerPlayer> players;

    /**
     * 是否算上大小王，默认为false
     */
    private boolean isContainGhosts=false;

    /**
     * 单线程环境无须同步，多线程应该考虑初始化的原子性
     */
    public AbstractPokerGame(){
        init();
    }

    /**
     * 各种玩法的规则
     */
    public abstract void doRule();

    /**
     * 启动任一种游戏玩法，此处使用模板方法模式便于扩展。
     */
    public void play(){
        // TODO: 2016/9/14
        doRule();
        // TODO: 2016/9/14
    }

    /**
     * 展示各个玩家手中的扑克牌
     */
    public void displayAllPokers(){
        if(playersNum <= 0 || players == null || players.isEmpty()){
            return ;
        }
        for(PokerPlayer player:players){
            if(player.getPokers() == null || player.getPokers().isEmpty()){
               return ;
            }
            System.out.println(player.getPokers());
        }
    }

    /**
     * 初始化扑克牌和玩家
     */
    private void init(){
        //初始化扑克牌
        pokers=new ArrayList<Poker>();
        for(int i=0;i<setsNum;i++){
            for(ColorEnum color:ColorEnum.values()){
                for(ValueEnum value:ValueEnum.values()){
                    if(value == ValueEnum.FOURTEEN && !isContainGhosts){
                        break;
                    }
                    pokers.add(new Poker(color,value));
                }
            }
        }
        Collections.shuffle(pokers);

        //初始化玩家
        players=new ArrayList<PokerPlayer>();
        for(int i=0;i<playersNum;i++){
            players.add(new PokerPlayer());
        }
    }

    public int getPlayersNum() {
        return playersNum;
    }

    public void setPlayersNum(int playersNum) {
        this.playersNum = playersNum;
    }

    public int getSetsNum() {
        return setsNum;
    }

    public void setSetsNum(int setsNum) {
        this.setsNum = setsNum;
    }

    public boolean isContainGhosts() {
        return isContainGhosts;
    }

    public void setContainGhosts(boolean containGhosts) {
        isContainGhosts = containGhosts;
    }

    public ArrayList<Poker> getPokers() {
        return pokers;
    }

    public void setPokers(ArrayList<Poker> pokers) {
        this.pokers = pokers;
    }

    public ArrayList<PokerPlayer> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<PokerPlayer> players) {
        this.players = players;
    }
}
