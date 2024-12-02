public class HealthAccessory implements Equipable {
    private String name;
    private String description;
    private int healthBoost;

    public HealthAccessory(String name, String description, int healthBoost) {
        this.name = name;
        this.description = description;
        this.healthBoost = healthBoost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void equip(RPGCharacter character) {
        System.out.println(character.getName() + " equips " + name + " and gains +" + healthBoost + " health!");
        if (character instanceof Warrior) {
            ((Warrior) character).increaseHealth(healthBoost);
        } else if (character instanceof Mage) {
            ((Mage) character).increaseHealth(healthBoost);
        }
    }

    @Override
    public void unequip(RPGCharacter character) {
        System.out.println(character.getName() + " unequips " + name + " and loses -" + healthBoost + " health!");
        if (character instanceof Warrior) {
            ((Warrior) character).decreaseHealth(healthBoost);
        } else if (character instanceof Mage) {
            ((Mage) character).decreaseHealth(healthBoost);
        }
    }
}