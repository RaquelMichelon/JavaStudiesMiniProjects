//Runnable has a run method that contains the task logic.
public class PrintHelloTask implements Runnable {
    private String name;

    public PrintHelloTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(60000); //one minute
        } catch (InterruptedException e) {
            System.out.println(name + "was interrupted!");
            e.printStackTrace();
        }

        System.out.println("Hello" + name + "! :)");
    }
}

//Run the program, open JConsole and connect to the JVM of the program. JVM names threads following the pattern Thread-Index.
//JConsole can be found inside the bin directory of your JDK. You may need to execute it with privileges (sudo or administrator)
