package com.fuzus.workshopmonogo.services;

import com.fuzus.workshopmonogo.domain.User;
import com.fuzus.workshopmonogo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }
}
