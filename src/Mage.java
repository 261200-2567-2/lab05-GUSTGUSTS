public class Mage implements RPGCharacter {
    private String name;
    private int health;
    private int magicPower;

    public Mage(String name, int health, int magicPower) {
        this.name = name;
        this.health = health;
        this.magicPower = magicPower;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void attack() {
        System.out.println(name + " casts a fireball with " + magicPower + " magic power!");
    }

    public void increaseAttack(int amount) {
        magicPower += amount;
    }

    public void decreaseAttack(int amount) {
        magicPower -= amount;
    }

    public void increaseHealth(int amount) {
        health += amount;
    }

    public void decreaseHealth(int amount) {
        health -= amount;
    }
}