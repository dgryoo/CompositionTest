package thing;

import action.attack.Attackable;
import action.attack.attacks.AshAttack;
import action.attack.attacks.AttackBehavior;
import action.move.Movable;
import action.move.moves.MoveBehavior;
import action.skill.Skill;
import action.skill.Skillable;
import util.BasicAbility;
import util.SkillUtil;


public class Ash extends Thing implements Attackable, Movable, Skillable {
    int power = 10;
    Skill skill = new Skill(SkillUtil.Ash.getSkillName(),SkillUtil.Ash.getDamageType(),SkillUtil.Ash.getSkillType(),SkillUtil.Ash.getSkillRange(),SkillUtil.Ash.getSkillPower());
    AttackBehavior attackBehavior = new AshAttack();
    MoveBehavior moveBehavior = new MoveBehavior();

    public Ash() {
        super(BasicAbility.Ash.gettName(), BasicAbility.Ash.getMaxHealth(), BasicAbility.Ash.getArmor(), BasicAbility.Ash.getMagicArmor());
    }


    @Override
    public void attackinit(Thing thing) {
        attackBehavior.attack(power, thing);
    }

    @Override
    public boolean isAttack() {
        return false;
    }

    @Override
    public void move(int direction) {
        moveBehavior.moveUnit(this, direction);
    }

    @Override
    public void skillInit(Thing thing) {

    }
}
