package com.my.mongodb.morphia;

import com.mongodb.MongoClient;
import com.my.mongodb.morphia.entity.Member;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.Morphia;

public class MorphiaTest {

    public static void main(String[] args) {
        final Morphia morphia = new Morphia();
        Datastore ds = morphia.createDatastore(new MongoClient("192.168.11.205", 27017), "gupaoedu-demo");

        Member member = new Member();
        member.setName("Tom");
        member.setAge(12);
        member.setAddr("Hunan");

        Key<Member> key = ds.save(member);

        System.out.println(key.getId());

    }

}
