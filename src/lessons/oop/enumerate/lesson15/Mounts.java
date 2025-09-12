package lessons.oop.enumerate.lesson15;

public enum Mounts {
    HORSE ("Horse", 25),
    RABBIT ("Rabbit", 15);

    private String mountTypeName;
    private int mountSpeed;

    Mounts(String mountTypeName, int mountSpeed) {
        this.mountTypeName = mountTypeName;
        this.mountSpeed = mountSpeed;
    }

    @Override
    public String toString() {
        return this.mountTypeName;
    }

    public String getMountTypeName() {
        return mountTypeName;
    }

    public int getMountSpeed() {
        return mountSpeed;
    }


}
