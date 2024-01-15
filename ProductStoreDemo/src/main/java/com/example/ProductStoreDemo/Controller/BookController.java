package com.example.ProductStoreDemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.ProductStoreDemo.model.Book;
import com.example.ProductStoreDemo.model.MyBookList;
import com.example.ProductStoreDemo.services.BookService;
import com.example.ProductStoreDemo.services.MyBookService;

@Controller
@RequestMapping(path = "")
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private MyBookService myBookService;
    
    @GetMapping("/home")
    public String Home(){
        return "home";
    }

    @GetMapping("/book_Store")
    public String bookStore(){
        return "bookStore";
    }

    @GetMapping("/book_register")
    public String BookRegister(){
        return "bookRegister";
    }

    @GetMapping("/available_books")
    public ModelAndView getAllBook(){
        List<Book> list = bookService.getAllBook();
        //ModelAndView m = new ModelAndView();
        //m.setViewName("BookList");
        //m.addObject("book", list);
        //return m;
        return new ModelAndView("availableBooks", "book", list); // ten cua html - ten cua bien dung goi gia tri trong html - danh sach
    }

    // dia chi luu sach
    @PostMapping("/save")
    public String addBook(@ModelAttribute Book book){
        bookService.SaveBook(book);
        return "redirect:/available_books"; // redirect: tai lai va den trang do
    }
    
    @GetMapping("/my_Books")
    public String myBook(Model model){
        List<MyBookList> list = myBookService.getAllMyBooks();
        model.addAttribute("book", list); // day list len html
        return "my_Books";
    }

    @RequestMapping("/mylist/{id}")
    public String getMyList(@PathVariable("id") int id){
        Book b = bookService.getBookById(id);
        MyBookList myBooks = new MyBookList(b.getBookID(), b.getBookName(),b.getAuthory(),b.getPrices());
        myBookService.saveMyBook(myBooks);
        return "redirect:/my_Books";
    }

    @RequestMapping("/deleteList/{id}")
    public String deleteList(@PathVariable("id") int id){
        bookService.deleteBook(id);
        return "redirect:/available_books";
    }

    @RequestMapping("/editList/{id}")
    public String editList(@PathVariable("id") int id, Model model){
        Book a = bookService.getBookById(id);
        model.addAttribute("book", a);
        return "editbook";
    }

}
