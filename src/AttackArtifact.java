public class AttackArtifact implements Equipable {
    private String name;
    private String description;
    private int attackBoost;

    public AttackArtifact(String name, String description, int attackBoost) {
        this.name = name;
        this.description = description;
        this.attackBoost = attackBoost;
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
        System.out.println(character.getName() + " equips " + name + " and gains +" + attackBoost + " attack power!");
        if (character instanceof Warrior) {
            ((Warrior) character).increaseAttack(attackBoost);
        } else if (character instanceof Mage) {
            ((Mage) character).increaseAttack(attackBoost);
        }
    }

    @Override
    public void unequip(RPGCharacter character) {
        System.out.println(character.getName() + " unequips " + name + " and loses -" + attackBoost + " attack power!");
        if (character instanceof Warrior) {
            ((Warrior) character).decreaseAttack(attackBoost);
        } else if (character instanceof Mage) {
            ((Mage) character).decreaseAttack(attackBoost);
        }
    }
}