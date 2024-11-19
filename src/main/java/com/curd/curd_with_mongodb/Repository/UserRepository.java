package com.curd.curd_with_mongodb.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.curd.curd_with_mongodb.Documents.User;

public interface UserRepository extends MongoRepository<User, String> {

}
