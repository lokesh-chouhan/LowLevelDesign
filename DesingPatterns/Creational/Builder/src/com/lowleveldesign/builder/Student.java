package com.lowleveldesign.builder;

public class Student {

    String name;
    String fatherName;
    String motherName;
    String age;
    String bloodGroup;

    public Student(StudentBuilder builder){
        this.name = builder.getName();
        this.fatherName = builder.getFatherName();
        this.motherName = builder.getMotherName();
        this.age = builder.getAge();
        this.bloodGroup = builder.getBloodGroup();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}
