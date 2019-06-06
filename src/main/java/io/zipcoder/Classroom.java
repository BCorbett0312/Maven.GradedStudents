package io.zipcoder;

import java.util.*;

public class Classroom {
    ArrayList<Student> students;
    HashMap grade = new HashMap();

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


    public HashMap getGradeBook(ArrayList<Student> myClass){

        ArrayList<Student> gradeOrder = myClass;



        int studentsInClass = myClass.size()+1;
        for(int i = 0; i < myClass.size(); i++){




            int rank10 = (int) Math.ceil(10.0/100.0*studentsInClass);
            int rank29 = (int) Math.ceil(29.0/100.0*studentsInClass);
            int rank50 = (int) Math.ceil(50.0/100.0*studentsInClass);
            int rank89 = (int) Math.ceil(89.0/100.0*studentsInClass);




            if(i+1 <= rank10){
                grade.put(gradeOrder.get(i), "A");

            }
            else if(i+1  <= rank29){
                grade.put(gradeOrder.get(i), "B");

            }
            else if(i+1  <= rank50){
                grade.put(gradeOrder.get(i), "C");

            }
            else if(i+1  <= rank89){
                grade.put(gradeOrder.get(i), "D");

            }
            else {
                grade.put(gradeOrder.get(i), "F");

            }
        }

        return grade;

    }



}
