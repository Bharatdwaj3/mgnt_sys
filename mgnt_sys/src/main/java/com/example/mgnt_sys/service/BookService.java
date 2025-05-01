package com.example.mgnt_sys.service;

import com.example.mgnt_sys.model.Form;
import com.example.mgnt_sys.repository.BookRepository;

import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.formRepository=formRepository;
    }

    public List<Booku> getAllBookus(){
        return bookRepository.findAll();
    }
    public Optional<Booku> getBookuById(Long id){
        return bookRepository.findById(id);
    }
    public Booku addBooku(Booku Booku){
        return bookRepository.save(Booku);
    }

    public Optional<Task> updateTaskStatus(Long id, boolean completed){
        return bookRepository.findById(id).map(Booku -> {
            Booku.setCompleted(completed);
            return bookRepository.save(Booku);
        });
    }

    public void deleteBooku(Long id){
        BookuRepository.deleteById(id);
    }
}
