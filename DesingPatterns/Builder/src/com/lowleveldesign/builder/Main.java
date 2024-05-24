package com.lowleveldesign.builder;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StudentBuilder builder = new StudentBuilder();
        Student s1 = builder.setName("Lokesh Chouhan")
                .setFatherName("Kishore")
                .setMotherName("Sunita")
                .setAge("35")
                .build();

        System.out.println("Name = "+s1.getName());
        System.out.println("Father Name = "+s1.getFatherName());
        System.out.println("Mother Name = "+s1.getMotherName());
        System.out.println("Age = "+s1.getAge());
        System.out.println("Blood = "+s1.getBloodGroup());

    }
}
