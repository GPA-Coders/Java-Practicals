class Shape {
    static float area (float radius) {
        float pi = 3.1415f;
        return pi*radius*radius;
    }
    static float area (float length,float width) {
        return width * length;
    }
}
public class practical_11 {
    public static void main(String[] args) {
        Shape s = new Shape();
        System.out.println(s.area(5.5f));
        System.out.println(s.area(5.5f , 7.3f));
    }
}