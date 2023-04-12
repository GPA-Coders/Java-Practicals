public class practical_13 {
    public static void main(String[] args) {
        String str = "He is Coder";
        System.out.println("charAt : " + str.charAt(3));
        System.out.println("Contains : " + str.contains("Code"));
        System.out.println(str.format("Format : " + "%S",str));
        System.out.println("Length : " + str.length());

        String st = "for@kudos";
        String [] result = st.split("@");
        for (String a : result) {
            System.out.println(a);
        }
    }
}
