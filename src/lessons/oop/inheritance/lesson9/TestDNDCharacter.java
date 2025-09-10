package lessons.oop.inheritance.lesson9;

public class TestDNDCharacter {
    public static void main(String[] args) {
        DNDCharacter ion = new DNDCharacter("Alex", "Elf", "Cleric");
        // ion.printCharacterDescription();
        ion.dndSay("Hello!");

        DNDEnemy ionEnemy = new DNDEnemy();
        ionEnemy.dndSay("I am ready to fight!");
    }
}
