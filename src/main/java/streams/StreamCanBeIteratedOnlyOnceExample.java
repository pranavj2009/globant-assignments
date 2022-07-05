package streams;

import functional.interfaces.data.Student;
import functional.interfaces.data.StudentDataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCanBeIteratedOnlyOnceExample {
    static List<String> namesList = new ArrayList<>();
    public static void main(String[] args) {
        namesList.add("Pranav1");
        namesList.add("Pranav2");
        namesList.add("Pranav3");
        namesList.add("Pranav4");

        Stream<String> namesListStream = namesList.stream();
        namesListStream.forEach(System.out::println);
        namesListStream.forEach(System.out::println); //java.lang.IllegalStateException: stream has already been operated upon or closed
    }
}
