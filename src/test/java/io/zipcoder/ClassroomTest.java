package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;

public class ClassroomTest {
    @Test
    public void getStudents() {
        ArrayList<Student> myClass = new ArrayList<>();
        Classroom classRoom = new Classroom(myClass);

        ArrayList<Double> scores1 = new ArrayList<>();
        ArrayList<Double> scores2 = new ArrayList<>();
        ArrayList<Double> scores3 = new ArrayList<>();

        Student student1 = new Student ("Charles", "last", scores1);
        Student student2 = new Student ("Clyde", "heidi", scores2);
        Student student3 = new Student ("MozillaMyKeyStore", "big", scores2);
        Student student4 = new Student ("Earl", "hugh", scores3);
        scores1.add(98.0);
        scores1.add(93.0);
        scores2.add(90.0);
        scores3.add(55.0);

        classRoom.addStudent(student1);
        classRoom.addStudent(student2);
        classRoom.addStudent(student3);
        classRoom.addStudent(student4);

        String expected = "[Student Name: Charles last\n" +
                "Average Score: 95.5\n" +
                "Exam Score:\n" +
                "Exam 1->98.0\n" +
                "Exam 2->93.0\n" +
                ", Student Name: Clyde heidi\n" +
                "Average Score: 90.0\n" +
                "Exam Score:\n" +
                "Exam 1->90.0\n" +
                ", Student Name: MozillaMyKeyStore big\n" +
                "Average Score: 90.0\n" +
                "Exam Score:\n" +
                "Exam 1->90.0\n" +
                ", Student Name: Earl hugh\n" +
                "Average Score: 55.0\n" +
                "Exam Score:\n" +
                "Exam 1->55.0\n]";

        Assert.assertEquals(expected, classRoom.getStudents().toString());


    }

    @Test
    public void getAverageExamScore() {
        ArrayList<Student> myClass = new ArrayList<>();
        Classroom classRoom = new Classroom(myClass);

        ArrayList<Double> scores1 = new ArrayList<>();
        ArrayList<Double> scores2 = new ArrayList<>();
        ArrayList<Double> scores3 = new ArrayList<>();

        Student student1 = new Student ("Charles", "last", scores1);
        Student student2 = new Student ("Clyde", "heidi", scores2);
        Student student3 = new Student ("MozillaMyKeyStore", "big", scores2);
        Student student4 = new Student ("Earl", "hugh", scores3);
        scores1.add(98.0);
        scores1.add(93.0);
        scores2.add(90.0);
        scores3.add(55.0);

        classRoom.addStudent(student1);
        classRoom.addStudent(student2);
        classRoom.addStudent(student3);
        classRoom.addStudent(student4);
        Double expected = 82.625;


        Assert.assertEquals(expected, classRoom.getAverageExamScore());
    }

    @Test
    public void addStudent() {
        ArrayList<Student> myClass = new ArrayList<>();
        Classroom classRoom = new Classroom(myClass);

        ArrayList<Double> scores1 = new ArrayList<>();
        ArrayList<Double> scores2 = new ArrayList<>();
        ArrayList<Double> scores3 = new ArrayList<>();

        Student student1 = new Student ("Charles", "last", scores1);
        Student student2 = new Student ("Clyde", "heidi", scores2);
        Student student3 = new Student ("MozillaMyKeyStore", "big", scores2);
        Student student4 = new Student ("Earl", "hugh", scores3);
        scores1.add(98.0);
        scores1.add(93.0);
        scores2.add(90.0);
        scores3.add(55.0);

        String expected ="[]";

        Assert.assertEquals(expected, classRoom.getStudents().toString());

        classRoom.addStudent(student1);
        classRoom.addStudent(student2);
        classRoom.addStudent(student3);
        classRoom.addStudent(student4);



        String expectedAfterAdd = "[Student Name: Charles last\n" +
                "Average Score: 95.5\n" +
                "Exam Score:\n" +
                "Exam 1->98.0\n" +
                "Exam 2->93.0\n" +
                ", Student Name: Clyde heidi\n" +
                "Average Score: 90.0\n" +
                "Exam Score:\n" +
                "Exam 1->90.0\n" +
                ", Student Name: MozillaMyKeyStore big\n" +
                "Average Score: 90.0\n" +
                "Exam Score:\n" +
                "Exam 1->90.0\n" +
                ", Student Name: Earl hugh\n" +
                "Average Score: 55.0\n" +
                "Exam Score:\n" +
                "Exam 1->55.0\n]";

        Assert.assertEquals(expectedAfterAdd, classRoom.getStudents().toString());

    }

    @Test
    public void removeStudent() {
        ArrayList<Student> myClass = new ArrayList<>();
        Classroom classRoom = new Classroom(myClass);

        ArrayList<Double> scores1 = new ArrayList<>();
        ArrayList<Double> scores2 = new ArrayList<>();
        ArrayList<Double> scores3 = new ArrayList<>();

        Student student1 = new Student ("Charles", "last", scores1);
        Student student2 = new Student ("Clyde", "heidi", scores2);
        Student student3 = new Student ("MozillaMyKeyStore", "big", scores2);
        Student student4 = new Student ("Earl", "hugh", scores3);
        Student student5 = new Student ("Clyde", "heidi", scores2);

        scores1.add(98.0);
        scores1.add(93.0);
        scores2.add(90.0);
        scores3.add(55.0);

        classRoom.addStudent(student1);
        classRoom.addStudent(student2);
        classRoom.addStudent(student3);
        classRoom.addStudent(student4);
        classRoom.addStudent(student5);


        Assert.assertEquals(5, myClass.size());



        classRoom.removeStudent("Clyde", "heidi");

        Assert.assertEquals(4, myClass.size());



    }

    @Test
    public void getStudentsByScore() {
        ArrayList<Student> myClass = new ArrayList<>();
        Classroom classRoom = new Classroom(myClass);

        ArrayList<Double> scores1 = new ArrayList<>();
        ArrayList<Double> scores2 = new ArrayList<>();
        ArrayList<Double> scores3 = new ArrayList<>();

        Student student1 = new Student ("Charles", "last", scores1);
        Student student2 = new Student ("Clyde", "heidi", scores2);
        Student student3 = new Student ("MozillaMyKeyStore", "big", scores2);
        Student student4 = new Student ("Earl", "hugh", scores3);
        scores1.add(98.0);
        scores1.add(93.0);
        scores2.add(90.0);
        scores3.add(55.0);

        classRoom.addStudent(student1);
        classRoom.addStudent(student2);
        classRoom.addStudent(student3);
        classRoom.addStudent(student4);

        String expected = "[Student Name: Charles last\n" +
                "Average Score: 95.5\n" +
                "Exam Score:\n" +
                "Exam 1->98.0\n" +
                "Exam 2->93.0\n" +
                ", Student Name: MozillaMyKeyStore big\n" +
                "Average Score: 90.0\n" +
                "Exam Score:\n" +
                "Exam 1->90.0\n" +
                ", Student Name: Clyde heidi\n" +
                "Average Score: 90.0\n" +
                "Exam Score:\n" +
                "Exam 1->90.0\n" +
                ", Student Name: Earl hugh\n" +
                "Average Score: 55.0\n" +
                "Exam Score:\n" +
                "Exam 1->55.0\n" +
                "]";

        Assert.assertEquals(expected, classRoom.getStudentsByScore().toString());


    }



    @Test
    public void getGradeBookTest() {
        ArrayList<Student> myClass = new ArrayList<>();
        Classroom classRoom = new Classroom(myClass);


        ArrayList<Double> scores1 = new ArrayList<>();
        ArrayList<Double> scores2 = new ArrayList<>();
        ArrayList<Double> scores3 = new ArrayList<>();

        Student student1 = new Student("Charles", "last", scores1);
        Student student2 = new Student("Clyde", "heidi", scores2);
        Student student3 = new Student("MozillaMyKeyStore", "big", scores2);
        Student student4 = new Student("Earl", "hugh", scores3);
        scores1.add(98.0);
        scores1.add(93.0);
        scores2.add(90.0);
        scores3.add(55.0);

        classRoom.addStudent(student1);
        classRoom.addStudent(student2);
        classRoom.addStudent(student3);
        classRoom.addStudent(student4);

        String expected = "D";

        Assert.assertEquals(expected, classRoom.getGradeBook(classRoom.getStudentsByScore()).get(student4));


        System.out.println(classRoom.getGradeBook(classRoom.getStudentsByScore()).get(student4));


    }





}
