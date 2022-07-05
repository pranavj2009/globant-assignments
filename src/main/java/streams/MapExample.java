package streams;

import functional.interfaces.data.Student;
import functional.interfaces.data.StudentDataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static functional.interfaces.data.StudentDataBase.*;

public class MapExample {
    public static List<String> getNamesList() {
        return getAllStudents().stream().map(Student::getName).map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static Set<String> getNamesSet() {
        return getAllStudents().stream().map(Student::getName).map(String::toUpperCase)
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        System.out.println(getNamesList());
        System.out.println(getNamesSet());
        System.out.println(getNamesListAngatKide());
    }

    /**
     *  I think getNamesListAngatKide would be discouraged only coz its imperative and not declarative.
     */

    public static List<String> getNamesListAngatKide() {
        List<String> namesList = new ArrayList<>();
        getAllStudents().stream().forEach(student -> namesList.add(student.getName().toUpperCase()));
        return namesList;
    }
}
