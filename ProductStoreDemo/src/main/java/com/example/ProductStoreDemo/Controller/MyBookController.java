package com.example.ProductStoreDemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ProductStoreDemo.services.MyBookService;

@Controller
public class MyBookController {

    @Autowired
    private MyBookService myBookService;
    
    @RequestMapping("/deleteMyList/{id}")
    public String deleteMyList(@PathVariable("id") int id){
        myBookService.deleteBook(id);
        return "redirect:/my_Books";
    }
}
