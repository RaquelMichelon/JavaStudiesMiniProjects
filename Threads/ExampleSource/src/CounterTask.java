public class CounterTask implements Runnable {
    private int counter;


    @Override
    public void run() {
        synchronized (this) { //The keyword synchronized ensures that everything inside the block will be executed only if there’s no thread executing this block
            counter++;
            System.out.println(Thread.currentThread().getName() + ": " + counter);
        }
    }
}

//    The key word synchronize ensures that everything inside the block will be executed only
//    if there’s no thread executing this block. To do this, it is used a mutex, which is a
//    key that locks the access to the delimited block (resource). In our example, the key is the
//    object itself because it contains the counter accessed by all the threads. The mutex synchronizes
//    the printing between all threads, therefore ensuring the counting order.
//    We also added the name of the thread in the message printed by CounterTask,
//    so we can see which thread printed each counter value
