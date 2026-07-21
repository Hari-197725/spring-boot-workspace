package com.springboot.practice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Entity
@Data // For both Getter and Setter. You can also @Getters only or @Setters as per your need. And it has constructor
//like argument or non argument constructors.  These things are comes under lombok.

public class Todo {
    @Id
    @GeneratedValue // For Id's auto generative.
    private Long id;
    @NotNull
    @NotBlank
    private String title;
    @NotNull
    @NotBlank
    private String description;

    @Email
    String email;
    Boolean isCompleted; // Here using Boolean's wrapper class 'cause a primitive boolean is always either true or false.
    // It can never be null.


}