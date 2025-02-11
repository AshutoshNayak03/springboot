package com.example.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class ScheduledTask {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    // Runs every 10 seconds
    @Scheduled(fixedRate = 10000)
    public void runTask() {
        System.out.println("Task executed at: " + LocalDateTime.now().format(FORMATTER));
    }
}
