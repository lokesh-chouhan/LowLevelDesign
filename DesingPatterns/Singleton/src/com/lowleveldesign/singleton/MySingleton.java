package com.lowleveldesign.singleton;

public class MySingleton {


    // 1.Created private constructor
    private MySingleton(){

    }

    // 2.Created static singleton reference
    private static MySingleton mySingleton = null;

    // 3.Created static method (synchronized for thread safe)
    synchronized public static MySingleton getMySingleton(){
        if(mySingleton == null){
            System.out.println("Creating singleton first time !!");
            mySingleton = new MySingleton();
        }
        System.out.println("Returning singleton !!");
        return mySingleton;
    }




}
