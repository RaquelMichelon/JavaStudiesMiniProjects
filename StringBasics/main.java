public class Main {
    public static void main(String[] args) {

        String str1 = new String("Java s2");
        String str2 = new String("Java s2");

        System.out.println(str1 == str2); //false because == compare the memory address that is different for each string that was instantiated using new

        String str3 = "Java s2"; //create a value on the pool
        String str4 = "Java s2"; //point to the same previous value created

        System.out.println(str3 == str4); //true because those values were add into the Strings pool

        //special characters
        System.out.println("\n Jump line \t Tab");

        //special operations with strings
        String name = "Raquel Michelon";

        //print first letter
        System.out.println(name.charAt(0));

        //position of one character
        System.out.println(name.indexOf("R"));

        //get Last name only
        int lastNamePosition = name.indexOf(" ") + 1;
        System.out.println(name.substring(lastNamePosition));

        //length
        System.out.println(name.length());

        //replace character
        //this method do not modify the name variable, because inside the pool of strings, strings are imutable
        System.out.println(name.replaceAll("e", "1"));
        System.out.println(name);

    }
}
