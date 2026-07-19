package com.springboot.practice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data // For Getter and Setter.
public class Todo {
    @Id
    @GeneratedValue // For Id's auto generative.
    private Long id;
    private String title;
    private String description;
    Boolean isCompleted;
}