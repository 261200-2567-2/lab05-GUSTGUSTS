public class Warrior implements RPGCharacter{
    private String name;
    private int health;
    private int attackPower;

    public Warrior(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
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
        System.out.println(name + " swings a sword with " + attackPower + " attack power!");
    }

    public void increaseAttack(int amount) {
        attackPower += amount;
    }

    public void decreaseAttack(int amount) {
        attackPower -= amount;
    }

    public void increaseHealth(int amount) {
        health += amount;
    }

    public void decreaseHealth(int amount) {
        health -= amount;
    }
}