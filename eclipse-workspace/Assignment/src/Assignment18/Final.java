package Assignment18;

class FinalDemo {

    final int x = 100;

    void display() {
        System.out.println("Final value: " + x);
    }

    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
        obj.display();
    }
}