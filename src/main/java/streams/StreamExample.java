package streams;

import functional.interfaces.data.Student;
import functional.interfaces.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {
    static Predicate<Student> testGpa = student -> student.getGpa()>=3.9;
    public static void main(String[] args) {
        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream().
                filter(s -> s.getGradeLevel() > 3).filter(testGpa).collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(studentMap);
    }
}
