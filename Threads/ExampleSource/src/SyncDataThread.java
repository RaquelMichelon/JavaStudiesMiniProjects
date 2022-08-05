public class SyncDataThread implements  Runnable {
    private Data data;

    public SyncDataThread(Data data) {
        super();
        this.data = data;
    }

    @Override
    public void run() {
        data.sync();
    }
}
