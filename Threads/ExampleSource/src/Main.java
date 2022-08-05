//First step - creating tasks
public class Main {
    public static void main(String[] args) {
        Thread task1 = new Thread(new PrintHelloTask("Task 1"));
        Thread task2 = new Thread(new PrintHelloTask("Task 2"));
        Thread task3 = new Thread(new PrintHelloTask("Task 3"));
        Thread task4 = new Thread(new PrintHelloTask("Task 4"));

        task1.start();
        task2.start();
        task3.start();
        task4.start();

        //Counter example
        CounterTask counterTask = new CounterTask();
        Thread counter1 = new Thread(counterTask);
        Thread counter2 = new Thread(counterTask);
        Thread counter3 = new Thread(counterTask);
        Thread counter4 = new Thread(counterTask);

        counter1.start();
        counter2.start();
        counter3.start();
        counter4.start();

        //OnlineOfflineSystem example
        Data data = new Data();
        //comment the line bellow and add syncData.setDaemon(true); to the JVM terminates the sync daemon thread when no other threads are active
        //data.setOutOfSync(true);
        Thread readData = new Thread(new ReadDataThread(data));
        Thread syncData = new Thread(new SyncDataThread(data));
        syncData.setDaemon(true);
        readData.start();
        syncData.start();


        //race system exemple
        Race race = new Race();
        Thread runner1 = new Thread(new Runner(race, "runner 1"));
        Thread runner2 = new Thread(new Runner(race, "runner 2"));
        System.out.println("Starting...");
        runner1.start();
        runner2.start();
    }
}

//the thread constructor gets a Runnable argument, so it is necessary to create the task by implementing the Runnable interface
//Step 2 - it will be done in PrintHelloTask.java
//Step 3 - add the task created to our threads -> new PrintHelloTask("Hello");
//Step 4 - Running the tasks calling the start method
//Attention! Threads don’t execute sequentially
//When we need to track threads execution: 1. increase the execution time using Thread.sleep(60000)
//
//When one thread affects another:
//Step 1: implement a counter creating a CounterTask that will just print the counter.
// This class will count numbers in ascending order.
//
//when one thread needs to run after a task
//A synchronized block only ensures that an operation executes atomically, but it doesn’t manage task execution order.
// For that, we can use the wait method, which is implemented by all java objects.
//This method returns the key used inside the syncronized block to unlock the access to a resource,
// so that other threads don’t have to wait for a resource they don’t need. When the resource is ready,
// we notify the waiting threads to continue their execution avoiding the famous Deadlock.
//Example:
//First - create ReadDataThread class
//Second - create SyncDataThread class
//Third - create Data class
//
// if I need to terminate a thread:
//for example, when we close a program, all related tasks should be closed.
//A common way to do this is by monitoring an volatile attribute to end thread execution in the run method
//race system example:
//First - create Runner class
//Second - create Race class
//Third - create main method
