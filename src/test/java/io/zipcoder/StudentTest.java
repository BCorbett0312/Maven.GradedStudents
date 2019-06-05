package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {


    @Test
    public void getFirstName() {
        String firstName = "Testy";
        Student student = new Student (firstName, null, null);

        Assert.assertEquals(firstName, student.getFirstName());



    }

    @Test
    public void setFirstName() {
        Student student = new Student (null, null, null);
        String firstName = "McTesterFace";
        student.setFirstName("McTesterFace");
        Assert.assertEquals(firstName, student.getFirstName());

    }

    @Test
    public void getLastName() {
        String lastName = "TheLastNameToEndAllLastNames";
        Student student = new Student (null, lastName, null);
        Assert.assertEquals(lastName, student.getLastName());
    }

    @Test
    public void setLastName() {
        Student student = new Student (null, null, null);
        String lastName = "Corbett";
        student.setLastName(lastName);
        Assert.assertEquals(lastName, student.getLastName());
    }

    @Test
    public void getExamScores() {
        ArrayList<Double> scores = new ArrayList<>();
        scores.add(99.0);
        scores.add(60.0);
        scores.add(51.0);
        Student student = new Student (null, null, scores);

        String expected = "Exam Score:" +"\nExam 1->99.0" + "\nExam 2->60.0" + "\nExam 3->51.0";

        Assert.assertEquals(expected, student.getExamScores());




    }

    @Test
    public void getNumberOfExamsTaken() {
        ArrayList<Double> scores = new ArrayList<>();
        scores.add(99.0);
        scores.add(60.0);
        scores.add(51.0);
        Student student = new Student (null, null, scores);

        Integer expected = 3;

        Assert.assertEquals(expected, student.getNumberOfExamsTaken());
    }

    @Test
    public void addExamScores() {
        ArrayList<Double> scores = new ArrayList<>();
        scores.add(99.0);
        scores.add(60.0);
        scores.add(51.0);
        Student student = new Student (null, null, scores);
        Integer expectedEarly = 3;
        Assert.assertEquals(expectedEarly, student.getNumberOfExamsTaken());


        student.addExamScores(90.00);
        Integer expected = 4;

        Assert.assertEquals(expected, student.getNumberOfExamsTaken());
    }

    @Test
    public void setExamScores() {
        ArrayList<Double> scores = new ArrayList<>();
        scores.add(99.0);
        scores.add(60.0);
        scores.add(51.0);
        Student student = new Student (null, null, scores);
        student.getExamScores();
        student.setExamScores(1, 50.0);


        String expected = "Exam Score:" +"\nExam 1->50.0" + "\nExam 2->60.0" + "\nExam 3->51.0";

        Assert.assertEquals(expected, student.getExamScores());
    }

    @Test
    public void getAverageExamScore() {
        ArrayList<Double> scores = new ArrayList<>();
        scores.add(99.0);
        scores.add(60.0);
        scores.add(51.0);
        Student student = new Student (null, null, scores);
        Double expected = 70.0;

        System.out.println(student.getAverageExamScore());

        Assert.assertEquals(expected, student.getAverageExamScore(), 0.0);


    }

    @Test
    public void toString1() {
        String firstName = "Testy";
        String lastName = "McTesterFace";
        ArrayList<Double> scores = new ArrayList<>();
        scores.add(99.0);
        scores.add(60.0);
        scores.add(51.0);
        Student myStudent = new Student (firstName, lastName, scores);

        System.out.println(myStudent);

        String expected = "Student Name: Testy McTesterFace\n" +
                "Average Score: 70.0\n" +
                "Exam Score:\n" +
                "Exam 1->99.0\n" +
                "Exam 2->60.0\n" +
                "Exam 3->51.0";

        Assert.assertEquals(expected, myStudent.toString());

    }
}