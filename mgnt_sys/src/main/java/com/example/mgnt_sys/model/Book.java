package com.example.mgnt_sys.model;

import java.util.HashMap;
import java.util.Map;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
     @Id 
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
    private String 
        book_name,
        book_genre,
        book_file_format,
        book_writer,
        book_publisher;
    private int 
        book_pages,
        book_isbn;

    private boolean completed;
    
    public boolean isCompleted(){
        return completed;
    }

    public void setCompleted(boolean completed){
        this.completed=completed;
    }



    public Map<String, Object> getBook_Details(){
        Map<String, Object> details = new HashMap<>();
        details.put("Name", book_name);
        details.put("Genre", book_genre);
        details.put("File Format", book_file_format);
        details.put("Writer", book_writer);
        details.put("Publisher", book_publisher);
        details.put("Pages", book_pages);
        details.put("ISBN", book_isbn);
        return details;
    }

    public void setBookDetails(Map<String, Object> details){
        if(details.containsKey("Name"))book_name=(String) details.get("Name");
        if(details.containsKey("Genre"))book_genre=(String) details.get("Genre");
        if(details.containsKey("File_Format"))book_file_format=(String) details.get("File_Format");
        if(details.containsKey("Writer"))book_writer=(String) details.get("Writer");
        if(details.containsKey("Publisher"))book_publisher=(String) details.get("Publisher");
        if(details.containsKey("Pages"))book_pages=(Integer) details.get("Pages");
        if(details.containsKey("ISBN"))book_isbn=(Integer) details.get("ISBN");
    }
}
