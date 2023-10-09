package lotr;
import lotr.Character;

public class GameManager {
    public static void fight(Character c1, Character c2) {
        System.out.println(c1 + "fights with " + c2);
        System.out.println("##############################");
        System.out.println(c1 + ":");
        System.out.println("hp = " + c1.getHp());
        System.out.println("power = " + c1.getPower());
        System.out.println("##############################");
        System.out.println(c2 + ":");
        System.out.println("hp = " + c2.getHp());
        System.out.println("power = " + c2.getPower());
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            System.out.println(c1 + ":");
            System.out.println("hp = " + c1.getHp());
            System.out.println("power = " + c1.getPower());
            System.out.println("##############################");
            System.out.println(c2 + ":");
            System.out.println("hp = " + c2.getHp());
            System.out.println("power = " + c2.getPower());
        }
        if (c1.isAlive()) {
            System.out.println(c1 + " wins!");
        } else if (c2.isAlive()) {
            System.out.println(c2 + " wins!");
        }
    }

    public static void main(String[] args) {
        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();
        fight(c1, c2);
    }
}
