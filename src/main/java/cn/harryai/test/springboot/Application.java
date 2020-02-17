package cn.harryai.test.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
public class Application {
    @Scheduled
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
