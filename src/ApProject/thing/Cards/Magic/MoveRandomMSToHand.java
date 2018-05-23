package src.ApProject.thing.Cards.Magic;

import src.ApProject.battle.battler.Battler;
import src.ApProject.thing.Cards.MonsterCards.InBattle.MonsterCardsInBattle;

public class MoveRandomMSToHand extends Magic {
    {
        this.magicType = MagicType.WITHOUTTARGET;
    }

    public void doMagic(Battler currentBattler, Battler enemyBattler) {
            MonsterCardsInBattle monsterCardsInBattle = enemyBattler.getMonsterField().getRandomMonsterCardInBattle();
            enemyBattler.getMonsterField().remove(monsterCardsInBattle);
            currentBattler.getHand().add(monsterCardsInBattle.getCard());
    }
}
