public class Main {
    public static void main(String[] args) {
        String str = "He is Hacker";
        System.out.println("charAt : " + str.charAt(3));
        System.out.println("Contains : " + str.contains("Code"));
        System.out.println(str.format("Format : " + "%S", str));
        System.out.println("Length : " + str.length());

        String st = "for@hacker";
        String [] result = st.split("@");
        for (String a : result) {
            System.out.print(a + " ");
        }
    }
}

// charAt : i
// Contains : false
// Format : HE IS HACKER
// Length : 12
// for hacker
