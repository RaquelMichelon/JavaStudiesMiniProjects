public class Runner implements Runnable {
    public Race race;
    public String runner;

    public Runner(Race race, String runner) {
        super();
        this.race = race;
        this.runner = runner;
    }

    @Override
    public void run() {
//        runners must check whether race has been finalized so they can stop running in that case.
//        Let’s add this check in the run method
        System.out.println(runner + " running...");
        while (!race.isFinished()) {
            race.setFinished(true);
            System.out.println("Winner: " + runner);
            return;
        }
        System.out.println(runner + " lost :(");
    }
}
