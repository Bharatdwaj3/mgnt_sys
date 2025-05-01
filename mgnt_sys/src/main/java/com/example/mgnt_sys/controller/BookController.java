package com.example.mgnt_sys.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
/*import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;*/
import org.springframework.stereotype.Controller;

import com.example.mgnt_sys.model.Book;

import java.util.Map;

@Controller
public class BookController {
    @GetMapping("/book")
    public String getBook(){
        return "book";
    }
    @PostMapping("/sumbit_book")
    @ResponseBody
    public String handleBookSumbmission(
        @RequestBody Map<String, Object> bookData){
            String book_name=(String) bookData.get("book_name");
            String book_genre=(String) bookData.get("book_genre");
            String book_file_format=(String) bookData.get("book_fileformat");
            String book_writer=(String) bookData.get("book_writer");
            String book_publisher=(String) bookData.get("book_publisher");
            Integer book_pages=(Integer) bookData.get("book_book_pages");
            Integer book_isbn=(Integer) bookData.get("isbn");

            Book book = new Book();
            book.setBookDetails(bookData);

            return "Book sumbitted: " + book.getBook_Details().toString();
    } 
}
