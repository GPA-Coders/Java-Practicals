abstract class Shape {
    abstract float area();
}
class Triangle extends Shape {
    float height, base;
    Triangle(float h,float b) {
        this.height = h;
        this.base = b;
    }
    public float area() {
        return (height * base) / 2;
    }
}
class Rectangle extends Shape {
    float width, length;
    Rectangle(float w,float l) {
        this.width = w;
        this.length = l;
    }
    public float area() {
        return width * length;
    }
}
class Circle extends Shape {
    int radius;
    Circle (int r) {
        this.radius = r;
    }
    public float area() {
        return 3.1415f * radius * radius;
    }
}
public class practical_20 {
    public static void main(String[] args) {
        Triangle obj1 = new Triangle(3.5f, 4.5f);
        Rectangle obj2 = new Rectangle(3.5f, 4.5f);
        Circle obj3 = new Circle(5);
        System.out.println("Area of Triangle : " + obj1.area());
        System.out.println("Area of Rectangle : " + obj2.area());
        System.out.println("Area of Circle : " + obj3.area());
    }
}
