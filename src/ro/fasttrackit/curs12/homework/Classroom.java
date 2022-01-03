package ro.fasttrackit.curs12.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Classroom {
    private final List<StudentGrade> students = new ArrayList<>();

    public Classroom(List<StudentGrade> students){
        this.students.addAll(students != null ? students:Collections.emptyList());
    }

    List<Integer> getGradesForDiscipline(String discipline){
        List<Integer> result = new ArrayList<>();

        for(StudentGrade student : students){
            if(discipline == null || discipline.equalsIgnoreCase(student.discipline() )){
                result.add(student.grade());
            }
        }
        return result;
    }
}
