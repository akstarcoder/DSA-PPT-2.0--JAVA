// Abstract class Shape
interface Shape {
    abstract double calculateArea();
}

// Circle
// Subclass Circle
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

}
// Triangle
// Subclass Triangle
class Triangle implements Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2; // Semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

}

//Rectangle Subclass
class Rectangle implements Shape {
    private double len;
    private double bre;

    public Rectangle(double len, double bre) {
        this.len = len;
        this.bre = bre;
    }

    public  double calculateArea() {
        return len * bre;
    }

}

//ShapeCalculator Class
class ShapeCalculator {
  public void printArea(Shape shape){
  System.out.println("Area: " + shape.calculateArea());
  }
}

// class Main

public class ShapeMain {
    public static void main(String[] args) {
		double r = 4.0;
		double ts1 = 3.0, ts2 = 4.0, ts3 = 5.0;
		Shape cir = new Circle(r);
		Shape rec = new Rectangle(ts1,ts2);
		Shape tri = new Triangle(ts1,ts2,ts3);
		ShapeCalculator sp = new ShapeCalculator();
		sp.printArea(rec);
		sp.printArea(cir);
		sp.printArea(tri);
        
    }
}

