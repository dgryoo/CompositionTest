package util;

public enum BasicAbility {
    //TODO 건물, 기본 별 Value를 정의한 Enum클래스 활용
    Ash("Ash", 100, 10, 10),
    Dragon("Dragon", 200, 20, 20);

    BasicAbility(String tName, int maxHealth, int armor, int magicArmor) {
        this.tName = tName;
        this.maxHealth = maxHealth;
        this.armor = armor;
        this.magicArmor = magicArmor;
    }

    String tName;
    int maxHealth;
    int armor;
    int magicArmor;

    public String gettName() {
        return tName;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getArmor() {
        return armor;
    }

    public int getMagicArmor() {
        return magicArmor;
    }
}
