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


    public HashMap getGradeBook(){
        HashMap grade = new HashMap();
        ArrayList<Student> gradeOrder = getStudentsByScore();
        for(int i = 0; i < gradeOrder.size(); i++){
            if(gradeOrder.get(i).getAverageExamScore() >= 0.1 ){
                grade.put(gradeOrder.get(i), "A");
                break;
            }
            else if(gradeOrder.get(i).getAverageExamScore() > 0.3){
                grade.put(gradeOrder.get(i), "B");
                break;
            }
            else if(gradeOrder.get(i).getAverageExamScore() > 0.51){
                grade.put(gradeOrder.get(i), "C");
                break;
            }
            else if(gradeOrder.get(i).getAverageExamScore() > 0.9){
                grade.put(gradeOrder.get(i), "D");
                break;
            }
            else {
                grade.put(gradeOrder.get(i), "F");
                break;
            }
        }

        return grade;

    }



}
