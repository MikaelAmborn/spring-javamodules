package com.hivestreaming;

import com.hivestreaming.interfaces.Config;
import com.hivestreaming.interfaces.Restarter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication(scanBasePackages = "com.hivestreaming.config")
public class App implements CommandLineRunner, Restarter {
    private Config config;

    @Autowired
    public void CommandLineRunner(Config config) {
        this.config = config;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("App: Getting config value -> " + config.getValue("my-key"));
        System.out.println("App: Calling restart");
        config.restart();
    }

    @Override
    public boolean niceRestart() {
        System.out.println("App: niceRestart...");
        return true;
    }
}
