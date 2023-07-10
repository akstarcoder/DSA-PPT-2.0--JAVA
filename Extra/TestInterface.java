//Interface   
interface Drawable {
    void draw();
}

// Implementation by Rectangle
class Rectangle implements Drawable {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}
// Implementation by Circle
class Circle implements Drawable {
    public void draw() {
        System.out.println("drawing circle");
    }
}

// main() method
class TestInterface {
    public static void main(String args[]) {
        Drawable d1 = new Circle();
        Drawable d2 = new Rectangle();
        d1.draw();
        d2.draw();
    }
}
