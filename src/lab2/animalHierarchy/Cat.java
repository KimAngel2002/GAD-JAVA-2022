package lab2.animalHierarchy;

public class Cat extends Animal implements Pet {
    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        this("Miti");
    }
    @Override
    public void eat() {
        System.out.println("Mananca peste");
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String nume) {

    }

    @Override
    public String play() {
        return null;
    }
}
