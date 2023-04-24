class Rectangle {
    private float height;
    private float weight;
    public Rectangle() {
        height = 7.3f;
        weight = 5.1f;
        System.out.println("Height : " + height);
        System.out.println("Weight : " + weight);
    }
}
public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
    }
}

// Height : 7.3
// Weight : 5.1
