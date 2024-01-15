package com.example.ProductStoreDemo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProductStoreDemo.model.MyBookList;
import com.example.ProductStoreDemo.responsitories.MyBookRepository;

@Service
public class MyBookService {
    
    @Autowired
    private MyBookRepository myBookRepository;

    public void saveMyBook(MyBookList myBook){
        myBookRepository.save(myBook);
    }

    public List<MyBookList> getAllMyBooks(){
        return myBookRepository.findAll();
    }

    public void deleteBook(int id){
        myBookRepository.deleteById(id);
    }
}
