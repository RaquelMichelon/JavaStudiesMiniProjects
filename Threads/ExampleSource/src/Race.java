public class Race {
    //private boolean finished;
    private volatile boolean finished; //The finished attribute of the race has been made volatile to ensure that threads read this value consistently

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
}
