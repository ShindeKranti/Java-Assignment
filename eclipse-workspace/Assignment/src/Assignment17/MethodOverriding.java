package Assignment17;

class Parent {
    void showMessage() {
        System.out.println("This is the parent class message.");
    }
}

class Child extends Parent {
    @Override
    void showMessage() {
        System.out.println("This is the child class message.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.showMessage(); // Calls parent method

        Child c = new Child();
        c.showMessage(); // Calls overridden child method

        Parent pc = new Child();
        pc.showMessage(); // Runtime polymorphism
    }
}