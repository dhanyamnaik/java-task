package studentexam;

public class Student {
 private String name;
 private int rollNumber;
 private int marks;

 public Student(String name, int rollNumber, int marks) {
     this.name = name;
     this.rollNumber = rollNumber;
     this.marks = marks;
 }

 @Override
 public String toString() {
     return name + "," + rollNumber + "," + marks;
 }
}

