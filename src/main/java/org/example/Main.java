package org.example;

import org.example.hazelcast_operations.HazelcastDGWOperation;
import org.example.hazelcast_operations.HazelcastMWOperation;
import org.example.hazelcast_operations.HazelcastSimulatorOperation;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        //String result = HazelcastDGWOperation.getPartitionIdByKey("Fourht");
        //System.out.println(result);

        Collection<Object> all = HazelcastSimulatorOperation.getAllPartitionId();
        //System.out.println(all.toArray()[0]);
        System.out.println(all);
        //String result = HazelcastMWOperation.put("First","Okan");
        //System.out.println(result);

        //String result = HazelcastMWOperation.remove("Second");
        //System.out.println(result);


    }
}