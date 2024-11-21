package com.curd.curd_with_mongodb.Documents;

import java.util.ArrayList;
import java.util.List;

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
    private List<String> jobs;

    public User() {
    }

    public User(String id, String name, int age, ArrayList<String> jobs) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.jobs = jobs;
    }

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

    public List<String> getJobs() {
        return jobs;
    }

    public void setJobs(List<String> jobs) {
        this.jobs = jobs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("User{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", jobs=").append(jobs);
        sb.append('}');
        return sb.toString();
    }

}