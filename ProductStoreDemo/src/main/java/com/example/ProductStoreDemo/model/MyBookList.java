package com.example.ProductStoreDemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "MyBook")
public class MyBookList {
    @Id
    @Column(name = "bookID")
    private int id; 
    @Column(name = "book_name") // trong truong hop ten o database khac thi them @Column
    private String name;
    private String authory;
    private String prices;

    public MyBookList() {
    }
    
    public MyBookList(int id, String name, String authory, String prices) {
        this.id = id;
        this.name = name;
        this.authory = authory;
        this.prices = prices;
    }

}
