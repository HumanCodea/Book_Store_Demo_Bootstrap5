package com.example.ProductStoreDemo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProductStoreDemo.model.Book;
import com.example.ProductStoreDemo.responsitories.BookResponsitory;

@Service
public class BookService {
    
    @Autowired
    private BookResponsitory bookResponsitory;

    public void SaveBook(Book b){
        bookResponsitory.save(b);
    }

    public List<Book> getAllBook(){
        return bookResponsitory.findAll();
    }

    public Book getBookById(int id){
        return bookResponsitory.findById(id).get();
    }

    public void deleteBook(int id){
        bookResponsitory.deleteById(id);
    }

}
