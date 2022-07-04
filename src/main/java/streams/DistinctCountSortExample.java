package streams;

import functional.interfaces.data.Student;
import functional.interfaces.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctCountSortExample {
    public static List<String> getDistinctStudentActivities() {
        return StudentDataBase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).distinct().collect(Collectors.toList());
    }

    public static long getTotalActivitiesCount() {
        return StudentDataBase.getAllStudents().stream().
                map(Student::getActivities).
                flatMap(List::stream).distinct().count();
    }

    public static List<Student> getGpaSortedStudentList(){
        return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa).reversed()).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(getDistinctStudentActivities());
        System.out.println(getTotalActivitiesCount());
        System.out.println(getGpaSortedStudentList());

    }
}
