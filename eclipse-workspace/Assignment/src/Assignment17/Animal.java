package Assignment17;

interface Fly {
    void fly();
}

interface Swim {
    void swim();
}

class Duck implements Fly, Swim {
    public void fly() {
        System.out.println("Duck can fly");
    }

    public void swim() {
        System.out.println("Duck can swim");
    }
}

public class Animal {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();
        d.swim();
    }
}