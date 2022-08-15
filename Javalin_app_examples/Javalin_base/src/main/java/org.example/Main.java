package org.example;

import io.javalin.Javalin;

public class Main {
    Javalin app;

    public static void main(String[] args) {
        new Main().start();
    }

    public void start(){
        app = Javalin.create();
        new RestEndpoints().initRestEndpoints(app);
        app.start(8080);
    }

    public void stop(){
        app.stop();
    }
}
