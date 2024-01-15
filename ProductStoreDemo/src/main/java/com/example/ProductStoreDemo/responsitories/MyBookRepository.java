package com.example.ProductStoreDemo.responsitories;

import org.springframework.stereotype.Repository;

import com.example.ProductStoreDemo.model.MyBookList;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MyBookRepository extends JpaRepository<MyBookList, Integer>{

}
