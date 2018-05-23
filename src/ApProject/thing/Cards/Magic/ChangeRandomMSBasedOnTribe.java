package src.ApProject.thing.Cards.Magic;

import src.ApProject.thing.Cards.MonsterCards.InBattle.MonsterCardsInBattle;
import src.ApProject.thing.Cards.MonsterCards.Tribe;
import src.ToDoPackage.Battler;

public class ChangeRandomMSBasedOnTribe extends Magic {
    private Tribe tribe;
    private int changeAPAmount;
    private int changeHPAmount;

    public ChangeRandomMSBasedOnTribe(int changeAPAmount, int changeHPAmount, Tribe tribe, String magicDetails){
        this.tribe =  tribe;
        this.changeAPAmount = changeAPAmount;
        this.changeHPAmount = changeHPAmount;
        this.magicDetails = magicDetails;
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
