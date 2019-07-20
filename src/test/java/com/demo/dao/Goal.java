package com.demo.dao;

import java.util.HashSet;
import java.util.concurrent.ThreadLocalRandom;

public class Goal {
    public static void main(String[] args) {
        HashSet redBallSet=new HashSet();
        while (true){
            int i=ThreadLocalRandom.current().nextInt(1,33+1);
            redBallSet.add(i);
            if(redBallSet.size()==6){
                break;
            }
        }
        System.out.println("红球："+redBallSet.toString());
        System.out.println("篮球："+ThreadLocalRandom.current().nextInt(1,16+1));
    }
}
