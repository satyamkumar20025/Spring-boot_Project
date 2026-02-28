package com.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "library")
public class LibraryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private Integer price;
    private boolean available = true;

    // Default Constructor (Important)
    public LibraryModel() {}
  
    public LibraryModel(Long id, String title, String author, Integer price, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    // Getters & Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }

    public void setAuthor(String author) { this.author = author; }

    public Integer getPrice() { return price; }

    public void setPrice(Integer price) { this.price = price; }

    public boolean isAvailable() { return available; }

    public void setAvailable(boolean available) { this.available = available; }
}