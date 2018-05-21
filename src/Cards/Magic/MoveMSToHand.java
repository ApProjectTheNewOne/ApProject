package src.Cards.Magic;

import src.Cards.Cards;
import src.Cards.MonsterCards.InBattle.MonsterCardsInBattle;
import src.ToDoPackage.Battler;

public class MoveMSToHand extends Magic{
    {
        this.magicType  = MagicType.WITHTARGET;
    }

    public void doMagic(MonsterCardsInBattle monsterCardsInBattle, Battler currentBattler, Battler enemyBattler) {
            Cards tempCard = monsterCardsInBattle.getCard();
            currentBattler.getMonsterField().remove(monsterCardsInBattle);
            currentBattler.getHand().add(tempCard);
    }
}
