public class Data {
    private boolean outOfSync;
    private int value;

    public void setOutOfSync(boolean outOfSync) {
        this.outOfSync = outOfSync;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public synchronized void sync() {
        System.out.println("Synchronizing data...");

        try {
            if (!outOfSync)
                this.wait();

            outOfSync = false;
            Thread.sleep(5000);
            System.out.println("Synchronized!");
            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void read() {
        System.out.println("Reading data...");

        try {
            if (outOfSync)
                this.wait();

            Thread.sleep(2000);
            System.out.println("Data: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

//    As you can see in the implementation above, the data is read if it is synchronized,
//    that’s achieved by the wait method. To prevent Deadlock, we use the notifyAll method to
//    resume the execution of the threads that have been waiting.
