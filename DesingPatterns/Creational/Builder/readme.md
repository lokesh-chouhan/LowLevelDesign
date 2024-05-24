# Builder

## Steps to create builder

1. Create builder class (StudentBuilder)
2. Add same parameters like main class (Student)
3. Add setters in builder class
4. Add build method in builder class which return new object
5. Add constructor in main class which take builder as parameter
6. Set properties from builder to objects

## Class Diagram

```mermaid
classDiagram
  class Student{
    String:-name
    String:-fatherName
    String:-motherName
    String:-age
    String:-bloodGroup
    Student(StudentBuilder)

  }

  class StudentBuilder{
    String:-name
    String:-fatherName
    String:-motherName
    String:-age
    String:-bloodGroup

    StudentBuilder:+setName(String)
    StudentBuilder:+setFatherName(String)
    StudentBuilder:+setMotherName(String)
    StudentBuilder:+setAge(String)
    StudentBuilder:+setBloodGroup(String)
    Student:+build()
  
  }

  class IStudentBuilder{
    <<interface>>
    Student:+build()
  }

StudentBuilder --> Student
StudentBuilder --|> IStudentBuilder
  

```
