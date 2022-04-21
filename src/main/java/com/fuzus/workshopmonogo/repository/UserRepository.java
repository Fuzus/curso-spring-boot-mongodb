package com.fuzus.workshopmonogo.repository;

import com.fuzus.workshopmonogo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    
}
