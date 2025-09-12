package lessons.oop.object.lesson13;

public class Runner {
    public static void main(String[] args) {
        Child child1 = new Child("Sergey", 21);
        Child child2 = new Child("Anton", 24);
        Child child3 = new Child("Max", 20);
        Child child4 = new Child("Vanya", 22);

        Child[] children = {child1, child2, child3, child4};

        ChildrenGarden childrenGarden = new ChildrenGarden(children);

        for (Child child : childrenGarden.getChildren()) {
            if (child.getName().equals("Sergey") && child.getAge() == 21) {
                System.out.println("Sergey is exist");
                break;
            }
        }

        Child sergey = new Child("Sergey", 21);

        for (Child child : childrenGarden.getChildren()) {
            if (child.equals(sergey)) {
                System.out.println("Sergey is exist");
                break;
            }
        }
    }
}
