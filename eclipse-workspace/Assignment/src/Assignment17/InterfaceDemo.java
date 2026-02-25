package Assignment17;

interface Drawable {
    void draw();
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Draw");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.draw();
    }
}