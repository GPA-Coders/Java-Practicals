import java.util.*;
public class practical_29 {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<String>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Indigo");
        colors.add("Violet");
        for(String color : colors) {
            System.out.println(color);
        }
    }
}
// Red
// Violet
// Blue  
// Yellow
// Indigo
// Orange
// Green
