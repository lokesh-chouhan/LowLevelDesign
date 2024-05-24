package com.lowleveldesign.builder;

public class StudentBuilder {

    String name;
    String fatherName;
    String motherName;
    String age;
    String bloodGroup;

    public String getName() {
        return name;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public String getFatherName() {
        return fatherName;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public String getMotherName() {
        return motherName;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public String getAge() {
        return age;
    }

    public StudentBuilder setAge(String age) {
        this.age = age;
        return this;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public StudentBuilder setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
        return this;
    }

    public Student build(){
        return new Student(this);
    }
}
