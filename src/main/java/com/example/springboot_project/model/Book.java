package com.example.springboot_project.model;
import com.example.springboot_project.model.Publisher;
import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "imageurl")
    private String imageUrl;
    @ManyToOne
    @JoinColumn(name = "publisherid")
    private Publisher publisher;
    public Book() {}

    public Book(int id, String name, String imageUrl, Publisher publisher) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.publisher = publisher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public Publisher getPublisher() {
        return publisher;
    }
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}