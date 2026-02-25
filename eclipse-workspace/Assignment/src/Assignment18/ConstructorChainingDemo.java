package Assignment18;

class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    Child() {
        super();   // constructor chaining
        System.out.println("Child Constructor");
    }
}

public class ConstructorChainingDemo {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}