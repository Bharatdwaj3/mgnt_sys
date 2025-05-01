package com.example.mgnt_sys.service;

import com.example.mgnt_sys.model.Form;
import com.example.mgnt_sys.repository.FormRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FormService {
    private final FormRepository formRepository;

    public FormService(FormRepository formRepository){
        this.formRepository=formRepository;
    }

    public List<User> getAllUsers(){
        return formRepository.findAll();
    }
    public Optional<User> getUserById(Long id){
        return formRepository.findById(id);
    }
    public User addUser(User user){
        return formRepository.save(user);
    }

    public Optional<Task> updateTaskStatus(Long id, boolean completed){
        return formRepository.findById(id).map(user -> {
            user.setCompleted(completed);
            return formRepository.save(user);
        });
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
