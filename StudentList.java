package com.ttn.java.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentList
{
    public static void main(String[] args) {
        List<Student> List = new ArrayList<>();
        List.add(new Student("Swati", 90.3, 30));
        List.add(new Student("Ashish", 87.5, 33));
        List.add(new Student("Saanvi", 99.9, 25));
        List.add(new Student("Mishka", 99.9, 20));
        Collections.sort(List, new ScoreComparator());

        for (Student stud : List)
            System.out.println("Student Name:" + stud.fName + " Age : " + stud.age + " has scored " + stud.score);
    }
}

class Student {
    String fName;
    double score;
    double age;

    public Student(String firstName, double score, double age) {
        this.fName = firstName;
        this.score = score;
        this.age = age;
    }
}

class FirstNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.fName.compareTo(s2.fName);
    }
}
class ScoreComparator implements Comparator<Student> {

 //   @Override
    public int compare(Student s1, Student s2) {
        if (s1.score == s2.score)
            return new FirstNameComparator().compare(s1, s2);
        else
            return -(int) (s1.score - s2.score);
    }
}

