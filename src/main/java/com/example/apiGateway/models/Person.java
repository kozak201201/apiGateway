package com.example.apiGateway.models;

public class Person {

    private Long id;
    private String name;

    // Конструкторы, геттеры и сеттеры
    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public Person(Long id, String name)
    {
        this(name);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}