
class Center {
    double x, y;

    public Center() { this(0, 0); }
    public Center(double x, double y) { this.x = x; this.y = y; }

    @Override
    public String toString() { return "(" + x + ", " + y + ")"; }
}

class Circle {
    Center center;
    double r;

    // Constructor overloading
    public Circle() { this(new Center(), 1); }
    public Circle(double r) { this(new Center(), r); }
    public Circle(Center center, double r) { this.center = center; this.r = r; }
    public Circle(double x, double y, double r) { this(new Center(x, y), r); }

    // Method overloading
    public double area() { return area(r); }
    public static double area(double r) { return Math.PI * r * r; }

    public double circumference() { return circumference(r); }
    public static double circumference(double r) { return 2 * Math.PI * r; }

    public void display() {
        System.out.printf("Circle center=%s r=%.1f -> Area=%.2f, Circumference=%.2f%n",
            center, r, area(), circumference());
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);
        Circle c3 = new Circle(new Center(2, 3), 4);
        Circle c4 = new Circle(1, 1, 6);

        c1.display();
        c2.display();
        c3.display();
        c4.display();

        System.out.println("External area for r=10: " + Circle.area(10));
    }
}
    

