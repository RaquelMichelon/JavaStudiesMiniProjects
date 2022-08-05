public class ReadDataThread implements Runnable {
    private Data data;

    public ReadDataThread(Data data) {
        super();
        this.data = data;
    }

    @Override
    public void run() {
        data.read();
    }
}
