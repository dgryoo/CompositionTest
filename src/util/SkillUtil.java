package util;

public enum SkillUtil {

    Ash("PowerArrow","p", "t", 50, 2),
    Dragon("DragonBreath", "m", "t", 50, 2 );

    String skillName;
    String damageType;
    String skillType;
    int skillRange;
    int skillPower;

    SkillUtil(String skillName, String damageType, String skillType, int skillRange, int skillPower) {
        this.skillName = skillName;
        this.damageType = damageType;
        this.skillType = skillType;
        this.skillRange = skillRange;
        this.skillPower = skillPower;
    }

    public String getSkillName() {
        return skillName;
    }

    public String getDamageType() {
        return damageType;
    }

    public String getSkillType() {
        return skillType;
    }

    public int getSkillRange() {
        return skillRange;
    }

    public int getSkillPower() {
        return skillPower;
    }
}
