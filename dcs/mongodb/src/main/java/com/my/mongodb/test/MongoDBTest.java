package com.my.mongodb.test;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Arrays;

public class MongoDBTest {

    public static void main(String[] args) {
        MongoClient mongoClient = MongoClients.create("mongodb://192.168.11.123:27017");
        MongoDatabase db = mongoClient.getDatabase("gupaoedu-demo");

        MongoCollection coll = db.getCollection("t_member");

        Document doc = new Document("name", "songmy")
                .append("type", "database")
                .append("count", 1)
                .append("version", Arrays.asList("v3.2","v3.1","v3.0"))
                .append("info", new Document("x", 203).append("y", 102));

        coll.insertOne(doc);


    }

}
