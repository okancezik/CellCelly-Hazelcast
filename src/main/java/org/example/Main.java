package org.example;

import org.example.hazelcast_operations.HazelcastDGWOperation;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        //String result = HazelcastDGWOperation.getPartitionIdByKey("Second");
        //System.out.println(result);

        Collection<Object> all = HazelcastDGWOperation.getAllPartitionId();
        //System.out.println(all.toArray()[0]);
        System.out.println(all);
       //String result = HazelcastPutOperation.put("Third","Rıfkı");
       //System.out.println(result);

        //String result = HazelcastPutOperation.remove("Firstasada");
        //System.out.println(result);
    }
}