package streams;

import functional.interfaces.data.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static functional.interfaces.data.StudentDataBase.getAllStudents;

public class FlatMapExample {
    public static Set<String> getActivitiesSet() {
        return getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        System.out.println(getActivitiesSet());
    }

}
