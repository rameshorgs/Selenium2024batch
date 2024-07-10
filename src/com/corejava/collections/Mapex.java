package com.corejava.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Mapex {

    public static void main(String[] args) {

        Map<Integer,String> map= new HashMap<Integer,String>();

        map.put(1,"ramesh");
        map.put(2,"anusha");
        map.put(3,"hussan");
        map.put(1,"ramesh");
        map.put(2,"anusha");
        map.put(3,"hussan");
        map.put(null,"hussan");
        map.put(null,"hussan1");
        map.put(4,null);
        map.put(5,null);
        map.put(6,null);

        System.out.println(map);

        if(map.containsKey(3)){
            System.out.println(map.get(3));
        }


        if(map.containsValue("anusha")){
            System.out.println(map.get(2));
        }

        Map<Integer,String> htable= new Hashtable<Integer,String>();

        htable.put(1,"ramesh");
        htable.put(2,"anusha");
        htable.put(3,"hussan");
        htable.put(1,"ramesh");
        htable.put(2,"anusha");
        htable.put(3,"hussan");

        System.out.println(htable);

    }

}
