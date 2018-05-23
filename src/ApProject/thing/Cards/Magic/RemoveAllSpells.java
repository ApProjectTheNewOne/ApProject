package src.ApProject.thing.Cards.Magic;

import src.ApProject.battle.battler.Battler;
import src.ApProject.thing.Cards.Spells.Spells;

public class RemoveAllSpells extends Magic{
    {
        this.magicType = MagicType.WITHOUTTARGET;
    }
    RemoveAllSpells(String magicDetails){
        this.magicDetails = magicDetails;
    }
    public void doMagic(Battler currentBattler, Battler enemyBattler) {
        for(Spells spell : enemyBattler.getSpellField().getSpells()) {
            if (spell != null) {
                enemyBattler.getSpellField().remove(spell);
                currentBattler.getHand().add(spell);
            }
        }
    }
}
