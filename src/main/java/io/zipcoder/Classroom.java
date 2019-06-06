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

//        for(int i = 0; i < students.length;i++){
//            if(students == null){
//                students[i] = student;
//                break;
//            }
//
//        }

    }

    public void removeStudent(String firstName, String lastName){
        for(Student each: students){
            if(firstName.equals(each.getFirstName()) && lastName.equals(each.getLastName())) {
                students.remove(each);
            }

        }

    }

    public ArrayList<Student> getStudentsByScore(){
        Comparator<Student> avgTestScoreComparator = Comparator.comparing(Student::getAverageExamScore).thenComparing(Student::getLastName);



        //Comparator<Student> nameComp = Comparator.comparing(Student::getLastName);


        //Arrays.sort(students, avgTestScoreComparator);
        //Arrays.sort(students, nameComp);

//
//        for (int i = 1; i < students.length-1; i++){
//            if (students[i].getAverageExamScore() > students[i-1].getAverageExamScore()){
//                Student temp = students[i-1];
//                students[i-1] = students[i];
//                students[i]= temp;
//                i =1 ;
//            }
//        }
        System.out.println(students);
        return students;
    }




}
