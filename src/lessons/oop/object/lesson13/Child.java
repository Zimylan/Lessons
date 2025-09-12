package lessons.oop.object.lesson13;

public class Child extends Object{
    private String name;
    private int age;

    public Child(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Child) {
            Child childObj = (Child) obj;
            return this.getName().equals(childObj.getName()) && this.getAge() == childObj.getAge();
        }
        return false;
    }
}
