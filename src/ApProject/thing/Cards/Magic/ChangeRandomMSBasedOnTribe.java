package src.ApProject.thing.Cards.Magic;

import src.ApProject.battle.battler.Battler;
import src.ApProject.thing.Cards.MonsterCards.InBattle.MonsterCardsInBattle;
import src.ApProject.thing.Cards.MonsterCards.Tribe;

public class ChangeRandomMSBasedOnTribe extends Magic {
    private Tribe tribe;
    private int changeAPAmount;
    private int changeHPAmount;

    public ChangeRandomMSBasedOnTribe(int changeAPAmount, int changeHPAmount, Tribe tribe){
        this.tribe =  tribe;
        this.changeAPAmount = changeAPAmount;
        this.changeHPAmount = changeHPAmount;
        this.magicType = MagicType.WITHOUTTARGET;
    }

    public void doMagic(Battler currentBattler, Battler enemyBattler) {
            MonsterCardsInBattle targetMonsterCard = currentBattler.getMonsterField().getRandomMonsterCardInBattleByType(tribe);
            if (targetMonsterCard != null) {
                targetMonsterCard.changeAttackPoint(changeAPAmount);
                targetMonsterCard.changeHealthPoint(changeHPAmount);
            }
    }
}
