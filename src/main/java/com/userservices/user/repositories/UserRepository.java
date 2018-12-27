package com.userservices.user.repositories;

import com.userservices.user.models.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findBy_id(ObjectId _id);
    localhost._8181.User findByName(String name);
}
