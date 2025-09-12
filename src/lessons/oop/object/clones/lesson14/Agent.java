package lessons.oop.object.clones.lesson14;

public class Agent implements Cloneable{
    private String name;

    public Agent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
