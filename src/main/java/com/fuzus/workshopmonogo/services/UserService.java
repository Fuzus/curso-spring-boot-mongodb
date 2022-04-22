package com.fuzus.workshopmonogo.services;

import com.fuzus.workshopmonogo.domain.User;
import com.fuzus.workshopmonogo.repository.UserRepository;
import com.fuzus.workshopmonogo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User obj) {
        return repo.insert(obj);
    }

    public void delete(String id) {
        this.findById(id);
        repo.deleteById(id);
    }

    public User update(User obj) {
        User newObj = this.findById(obj.getId());
        updateData(newObj, obj);
        return repo.save(obj);
    }

    private void updateData(User newObj, User obj) {
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());
    }
}
