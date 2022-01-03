package ro.fasttrackit.curs12.homework;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        Classroom classroom = new Classroom(
                List.of(
                        new StudentGrade("Matia", "Java", 9),
                        new StudentGrade("David", "Mate", 10),
                        new StudentGrade("Alex", "Java", 6)
                )
        );
        System.out.println(classroom.getGradesForDiscipline("Java"));
        System.out.println(classroom.getGradesForDiscipline("Romana"));
    }


}
