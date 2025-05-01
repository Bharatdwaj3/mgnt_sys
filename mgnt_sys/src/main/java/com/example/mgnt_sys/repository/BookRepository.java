package com.example.mgnt_sys.repository;

import com.example.mgnt_sys.model.Book;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;;

public interface BookRepository extends JpaRepository<Book,Long>{
    
}
