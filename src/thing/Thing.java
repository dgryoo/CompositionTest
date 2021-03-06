package thing;

public abstract class Thing {
    private String tName;
    private int maxHealth;
    private int health;
    private int armor;
    private int magicArmor;
    private int x;
    private int y;
    private boolean state = true;

    Thing(String tName, int maxHealth,int armor, int magicArmor) {
        this.tName = tName;
        this.health = maxHealth;
        this.armor = armor;
        this.magicArmor = magicArmor;
        this.maxHealth = maxHealth;


    }

    public void attacked(int power) {

        health = health - (power-armor);

        if (this.health <= 0) {
            System.out.println(tName + "이(가)" + (power - armor) + " 의 피해를 받았습니다.");
            dead();
        } else {
            System.out.println(tName + "이(가)" + (power - armor) + " 의 피해를 받았습니다.");
            System.out.println(tName + "의 체력은 " + health + " 남았습니다.");
        }
    }

    public void status() {

        System.out.println("name : " + tName);
        System.out.println("health : " + health);
        System.out.println("armor : " + armor);
        System.out.println("magicArmor : " + magicArmor);

    }

    public void dead() {
        System.out.println(tName + "이(가)" + " 죽었습니다");
        state = false;
    }

    public String gettName() {
        return tName;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getArmor() {
        return armor;
    }

    public int getMagicArmor() {
        return magicArmor;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void defaultLocation() {
    }

    @Override
    public String toString() {
        return "etc.Thing{" +
                "tName='" + tName + '\'' +
                ", health=" + health +
                ", armor=" + armor +
                ", magicArmor=" + magicArmor +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public boolean isAlive() {
        return state;
    }

    protected void alive() {
        state = true;
        System.out.println(this + "살아남");
        health = maxHealth;
    }

}
