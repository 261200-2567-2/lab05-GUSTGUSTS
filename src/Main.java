// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // สร้างตัวละคร RPG
        Warrior warrior = new Warrior("Arthur", 120, 25);
        Mage mage = new Mage("Morgana", 90, 40);

        // แสดงสถานะเริ่มต้น
        System.out.println("--- Initial Status ---");
        System.out.println(warrior.getName() + " has " + warrior.getHealth() + " health.");
        System.out.println(mage.getName() + " has " + mage.getHealth() + " health.");

        // เริ่มการต่อสู้
        System.out.println("\n--- Battle Begins ---");
// Mage โจมตี Warrior
        System.out.println(mage.getName() + " attacks " + warrior.getName());
        warrior.decreaseHealth(mage.getMagicPower());
        System.out.println(warrior.getName() + " now has " + warrior.getHealth() + " health.");

        // สวมใส่อุปกรณ์เพื่อเพิ่มพลัง
        Equipable swordArtifact = new AttackArtifact("Blade of Fury", "Increases attack power significantly.", 15);
        Equipable magicAmulet = new HealthAccessory("Amulet of Protection", "Increases health for better durability.", 20);

        System.out.println("\n--- Equipping Accessories ---");
        swordArtifact.equip(warrior);
        magicAmulet.equip(mage);

        // โจมตีรอบใหม่หลังสวมใส่อุปกรณ์
        System.out.println("\n--- Second Round of Battle ---");

        // Warrior โจมตี Mage
        System.out.println(warrior.getName() + " attacks " + mage.getName() + " again!");
        mage.decreaseHealth(warrior.getAttackPower());
        System.out.println(mage.getName() + " now has " + mage.getHealth() + " health.");

        // Mage โจมตี Warrior
        System.out.println(mage.getName() + " attacks " + warrior.getName() + " again!");
        warrior.decreaseHealth(mage.getMagicPower());
        System.out.println(warrior.getName() + " now has " + warrior.getHealth() + " health.");

        // แสดงผลการต่อสู้
        System.out.println("\n--- Final Status ---");
        System.out.println(warrior.getName() + " has " + warrior.getHealth() + " health.");
        System.out.println(mage.getName() + " has " + mage.getHealth() + " health.");

        if (warrior.getHealth() > mage.getHealth()) {
            System.out.println(warrior.getName() + " wins the battle!");
        } else if (mage.getHealth() > warrior.getHealth()) {
            System.out.println(mage.getName() + " wins the battle!");
        } else {
            System.out.println("The battle ends in a draw!");
        }

    }
}