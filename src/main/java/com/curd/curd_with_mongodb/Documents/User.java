package com.curd.curd_with_mongodb.Documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

@Document(collection = "user_collection")
public class User {

    @Id
    @NonNull
    private String id;
    private String name;
    private int age;
    private String message;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User() {
    }

    public User(String message) {
        this.message = message;
    }

    public User(String id, String name, int age, String message) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.message = message;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

}