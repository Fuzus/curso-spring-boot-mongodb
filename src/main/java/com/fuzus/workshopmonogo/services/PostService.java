package com.fuzus.workshopmonogo.services;

import com.fuzus.workshopmonogo.domain.Post;
import com.fuzus.workshopmonogo.repository.PostRepository;
import com.fuzus.workshopmonogo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
