package com.example.mgnt_sys.model;

import java.util.HashMap;
import java.util.Map;

public class Book {
    private String 
        book_name,
        book_genre,
        book_file_format,
        book_writer,
        book_publisher;
    private int 
        book_pages,
        book_isbn;

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
