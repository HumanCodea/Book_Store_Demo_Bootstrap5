package com.example.ProductStoreDemo.responsitories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ProductStoreDemo.model.Book;

@Repository
public interface BookResponsitory extends JpaRepository<Book, Integer>{
    
}
