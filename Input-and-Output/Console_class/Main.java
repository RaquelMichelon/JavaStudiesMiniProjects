import java.io.Console;

public class Main {
    public static void main(String[] args) {

        Console console = System.console();
        System.out.println("Name?");
        String name = console.readLine();
        System.out.println("The name is: " + name);

        //running it from an IDE:
        // - open terminal, go to project directory
        // - execute: javac FileName.java
        // - execute: java FileName

    }
}
