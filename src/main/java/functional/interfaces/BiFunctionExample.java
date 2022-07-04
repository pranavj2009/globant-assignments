package functional.interfaces;

import functional.interfaces.data.Student;
import functional.interfaces.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction =
            (studentsList, studentsPredicate) -> {
                Map<String, Double> studentsMap = new HashMap<>();
                studentsList.forEach(student -> {
                    if(studentsPredicate.test(student)){
                        studentsMap.put(student.getName(), student.getGpa());
                    }
                });
                return  studentsMap;
            };
    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), PredicateExample.p1));
    }
}
