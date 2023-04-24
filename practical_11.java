class Shape {
    float area (float radius) {
        float pi = 3.1415f;
        return pi*radius*radius;
    }
    float area (float length, float width) {
        return width * length;
    }
}
public class Main {
    public static void main(String[] args) {
        Shape s = new Shape();
        System.out.println("Circle : " + s.area(5.5f));
        System.out.println("Rectangle : " + s.area(5.5f , 7.3f));
    }
}

// Circle : 95.03037
// Rectangle : 40.15
