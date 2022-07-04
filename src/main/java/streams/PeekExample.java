package streams;

import functional.interfaces.data.Student;
import functional.interfaces.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PeekExample {
    static Predicate<Student> testGpa = student -> student.getGpa()>=3.9;
    public static void main(String[] args) {
        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream().
                peek(student -> {
                    System.out.println("Student streamed: "+student);
                }).
                filter(s -> s.getGradeLevel() > 3).
                peek(s->{
                    System.out.println("Student filtered for grade level:"+s);
                }).
                filter(testGpa).
                peek(s->{
                    System.out.println("Student filtered for gpa:"+s);
                }).
                collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(studentMap);
    }
}
