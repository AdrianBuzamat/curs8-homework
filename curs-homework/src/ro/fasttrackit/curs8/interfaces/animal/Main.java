package ro.fasttrackit.curs8.interfaces.animal;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.talk();
        System.out.println(cat.walk());
    }
}
