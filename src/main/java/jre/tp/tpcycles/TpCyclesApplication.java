package jre.tp.tpcycles;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TpCyclesApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpCyclesApplication.class, args);
    }


    @Bean
    public CommandLineRunner start() {
        return (args) -> {

            System.out.println("Hello!");

        };
    }

}
