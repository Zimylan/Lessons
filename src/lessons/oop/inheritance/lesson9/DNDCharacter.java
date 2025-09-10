package lessons.oop.inheritance.lesson9;

public class DNDCharacter {
    public static final String[] dndRaceList = {"Human", "Elf", "Dwarf", "Orc"};
    public static final String[] dndClassList = {"Warrior", "Hunter", "Cleric", "Wizard", "Barbarian", "Artificer"};

    //Stats

    private String dndCharacterName = "Bob";
    private String dndCharacterRace = "Human";
    private String dndCharacterClass = "Warrior";
    private int dndHitPoints = 1;

    //Class init
    static {
        System.out.print("Available races: ");
        for (String dndRace : dndRaceList) {
            if (dndRace.equals(dndRaceList[dndRaceList.length - 1])) {
                System.out.printf("%s.\n", dndRace);
            } else {
                System.out.printf("%s, ", dndRace);
            }
        }

        System.out.print("Available classes: ");
        for (String dndClass : dndClassList) {
            if (dndClass.equals(dndClassList[dndClassList.length - 1])) {
                System.out.printf("%s.\n", dndClass);
            } else {
                System.out.printf("%s, ", dndClass);
            }
        }
    }

    //Init default
    public DNDCharacter() {

    }

    //Init
    public DNDCharacter(String dndCharacterNameTag, String dndRaceTag, String dndClassTag) {

        this.dndCharacterName = dndCharacterNameTag;
        this.dndCharacterRace = dndRaceTag;
        this.dndCharacterClass = dndClassTag;
        this.printCharacterDescription();
    }

    public void printCharacterDescription() {
        String characterDescription = String.format(
                "Your character named %s has the race %s and class %s",
                this.dndCharacterName,
                this.dndCharacterRace,
                this.dndCharacterClass
        );
        System.out.println(characterDescription);
    }

    public void dndSay (String whatCharacterSay) {
        String dndCharacterSay = String.format("%s says: \"%s\" ", this.dndCharacterName, whatCharacterSay);
        System.out.println(dndCharacterSay);
    }

    //Setters

    public void setDndCharacterName(String dndCharacterName) {
        this.dndCharacterName = dndCharacterName;
    }

    public void setDndCharacterRace(String dndCharacterRace) {
        this.dndCharacterRace = dndCharacterRace;
    }

    public void setDndCharacterClass(String dndCharacterClass) {
        this.dndCharacterClass = dndCharacterClass;
    }

    public void setDndHitPoints(int dndHitPoints) {
        this.dndHitPoints = dndHitPoints;
    }
}
