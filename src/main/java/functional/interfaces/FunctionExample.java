package functional.interfaces;

import functional.interfaces.data.Student;
import functional.interfaces.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionExample {
    static Function<List<Student>, Map<String, Double>> studentFunction = studentsList -> {
        Map<String, Double> studentGradeMap = new HashMap<>();
        studentsList.forEach(student -> {
            if(PredicateExample.p1.test(student)){
                studentGradeMap.put(student.getName(), student.getGpa());
            }
        });
        return  studentGradeMap;
    };

    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
