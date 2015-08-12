package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppInitializer {

    // Public API
    // ------------------------------------------------------------------------
    public static void main(String[] args) {
        SpringApplication.run(AppInitializer.class, args);
    }

}