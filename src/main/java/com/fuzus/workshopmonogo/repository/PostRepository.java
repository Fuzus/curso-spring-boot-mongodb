package com.fuzus.workshopmonogo.repository;

import com.fuzus.workshopmonogo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    //query method para automatico do spring para encontrar posts que contenham texto no titulo
    List<Post> findByTitleContainingIgnoreCase(String text);
}
