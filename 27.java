import java.io.*;

public class practical_27 {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("MyFile.txt");
            String s = "I Love Java!";
            byte[] b = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Writing Completed!");
        }
        catch(IOException e) {
            System.out.println(e);
        }
        try {
            FileInputStream fin = new FileInputStream("MyFile.txt");
            int data;
            while((data = fin.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
            fin.close();
            System.out.println("Reading Completed!");
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
}
// Writing Completed!
// I Love Java!
// Reading Completed!
