package src.ApProject.battle.battler;


import src.ApProject.thing.Cards.Cards;


public class AI_Battler extends Battler {
    public AI_Battler(String name, Cards[] cards) {
        super(name, cards);
        type = "ENEMY";
    }


    @Override
    protected boolean turnOrders() {
        System.out.println("Enemy played!");
        //while (canPlay()){

        //}
        return false;
    }

}