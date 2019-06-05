package io.zipcoder;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores = new ArrayList<>();

    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getExamScores() {
        StringBuilder output = new StringBuilder();
        output.append("Exam Score:");
        for(int i = 0; i < examScores.size()-1; i++){
            output.append("\nExam " + (i+1) + "->" +examScores.get(i));
        }
        System.out.println(output);

        return output.toString();
    }

    public Integer getNumberOfExamsTaken(){
        return examScores.size();
    }

    public void addExamScores(Double score){
        examScores.add(score);
    }

    public void setExamScores(int examNumber, double newScore){
        examScores.set(examNumber-1, newScore);
    }

    public Double getAverageExamScore() {
        Double sum = 0.0;
        for(Double each: examScores){
            sum =+ each;
        }
        return sum/examScores.size();
    }

    @Override



}
