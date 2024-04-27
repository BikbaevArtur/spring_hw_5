package ru.bikbaev.hw_4.spring_hw_5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    private TaskStatus taskStatus = TaskStatus.NOT_STARTED;
    private LocalDateTime localDateTime = LocalDateTime.now();

    public Task(String description) {
        this.description = description;
    }

}

