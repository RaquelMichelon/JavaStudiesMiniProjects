package com.michelon.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

    public static void main(String[] args) {

        //Set the counter to 4 being 4 applications
        CountDownLatch cdl = new CountDownLatch(4);

        Thread app1 = new Thread(new Application("APP 1", cdl));
        Thread app2 = new Thread(new Application("APP 2", cdl));
        Thread app3 = new Thread(new Application("APP 3", cdl));
        Thread app4 = new Thread(new Application("APP 4", cdl));

        //initialize applications
        app1.start();
        app2.start();
        app3.start();
        app4.start();


        try {
            //wait until countDownLatch reduces to 0.
            cdl.await();
            System.out.println("All applications are up and running.");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }


    }

}

class Application implements Runnable {
    private String name;
    private CountDownLatch cdl;

    public Application(String name, CountDownLatch cdl) {
        this.name = name;
        this.cdl = cdl;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " started!");
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            System.err.println(ie.getMessage());
        }
        System.out.println(name + " is UP and RUNNING!");
        //to reduce count by one
        cdl.countDown();
    }
}
