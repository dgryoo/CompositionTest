package util;

public enum ThingValue {

    Ash("Ash", 100, 10, 10),
    Dragon("Dragon", 200, 20, 20);

    ThingValue(String tName, int maxHealth, int armor, int magicArmor) {
        this.tName = tName;
        this.maxHealth = maxHealth;
        this.armor = armor;
        this.magicArmor = magicArmor;
    }

    String tName;
    int maxHealth;
    int armor;
    int magicArmor;

}
