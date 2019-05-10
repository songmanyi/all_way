package com.my.mongodb.test;

import com.mongodb.*;

public class MongoCrudTest {

    public static void main(String[] args) {
        Mongo mongo = new Mongo("192.168.11.205", 27017);

        DB db = new DB(mongo, "my");

        DBCollection collection = db.getCollection("member");

        DBObject dbObject = new BasicDBObject();
        dbObject.put("name", "TOM");
        dbObject.put("age", 18);
        dbObject.put("addr", "Hunan");

        collection.insert(dbObject);

        DBCursor dbCursor = collection.find();

        for (DBObject object : dbCursor) {
            System.out.println(object);
        }
    }

}
