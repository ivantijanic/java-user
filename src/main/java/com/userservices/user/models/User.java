package com.userservices.user.models;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection="customers")
public class User {
    @Id
    public ObjectId _id;

    public String name;
    public String pwd;
    public Integer age;
    public String roles;
}
