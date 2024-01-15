package com.example.ProductStoreDemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Book {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookID; 
    @Column(name = "book_name") // trong truong hop ten o database khac thi them @Column
    private String bookName;
    private String authory;
    private String prices;
    
}
