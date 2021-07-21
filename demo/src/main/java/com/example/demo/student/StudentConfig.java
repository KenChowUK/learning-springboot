package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            //Student testing1 = new Student("testing1","testing1@gmail.com", LocalDate.of(2000, Month.JANUARY, 5), 21);
            Student testing1 = new Student("testing1","testing1@gmail.com", LocalDate.of(2000, Month.JANUARY, 5));
            //Student testing2 = new Student("testing2","testing2@gmail.com", LocalDate.of(2001, Month.FEBRUARY, 6, 20));
            Student testing2 = new Student("testing2","testing2@gmail.com", LocalDate.of(2001, Month.FEBRUARY, 6));

            repository.saveAll(List.of(testing1, testing2));
        };
    }
}
