package io.zipcoder;

import java.util.*;

public class Classroom {
    ArrayList<Student> students;

    public Classroom(ArrayList<Student> students) {
        this.students = students;
    }

    public Classroom(int maxNumberOfStudents){
        students = new ArrayList<>(maxNumberOfStudents);
    }

    public Classroom(){
        students = new ArrayList<>(30);
    }


    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public Double getAverageExamScore(){
        Double sumOfAllScores=0.0;
        for(Student each: students){
            sumOfAllScores+= each.getAverageExamScore();
        }
        return sumOfAllScores/students.size();
    }

    public void addStudent(Student student){
        students.add(student);

    }

    public void removeStudent(String firstName, String lastName){
        for(Student each: students){
            if(firstName.contains(each.getFirstName()) && lastName.contains(each.getLastName())) {
                students.remove(each);
                break;
            }

        }

    }

    public ArrayList<Student> getStudentsByScore(){
        Comparator<Student> avgTestScoreComparator = Comparator.comparing(Student::getAverageExamScore).reversed().thenComparing(Student::getLastName);
        Collections.sort(students, avgTestScoreComparator);
        return students;
    }




}
