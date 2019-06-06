package io.zipcoder;

import com.sun.deploy.security.MozillaMyKeyStore;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ClassroomTest {
    @Test
    public void getStudents() {
    }

    @Test
    public void getAverageExamScore() {
    }

    @Test
    public void addStudent() {
    }

    @Test
    public void removeStudent() {
    }

    @Test
    public void getStudentsByScore() {
        Classroom myClassRoom = new Classroom();

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

        myClassRoom.addStudent(student1);
        myClassRoom.addStudent(student2);
        myClassRoom.addStudent(student3);
        myClassRoom.addStudent(student4);


        //System.out.println(myClassRoom.getStudents());
        //myClassRoom.getStudents();
        myClassRoom.getStudentsByScore();



    }
}
