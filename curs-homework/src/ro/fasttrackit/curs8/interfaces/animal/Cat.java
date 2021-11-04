package ro.fasttrackit.curs8.interfaces.animal;

public class Cat implements Animal {
    public String eat() {
        return "Cat eating mouse";
    }
    public String talk() {
        return "Meow-meow!";
    }
    public String walk() {
        return "Cat-walking";
    }
}
