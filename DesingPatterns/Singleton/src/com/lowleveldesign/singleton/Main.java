package com.lowleveldesign.singleton;

public class Main {

    public static void main(String[] args) {
	// write your code here

        MySingleton singleton1 = MySingleton.getMySingleton();
        MySingleton singleton2 = MySingleton.getMySingleton();

    }
}
