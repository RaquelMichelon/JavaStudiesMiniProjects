
public class Main {
    public static void main(String[] args) {
        //Compare two string

        String s1 = "hello";
        String s2 = "hello";
        String s3 = "Hello";

        System.out.println(s1.compareTo(s2)); //0
        System.out.println(s1.compareToIgnoreCase(s2)); //0
        System.out.println(s1.compareToIgnoreCase(s3)); //0

    }
}
