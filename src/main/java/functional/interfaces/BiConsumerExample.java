package functional.interfaces;

import functional.interfaces.data.Student;
import functional.interfaces.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities(){
        BiConsumer<String, List<String>> nameAndActivities = (a,b) -> System.out.println("Name: "+a+", Activities"+b);
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {nameAndActivities.accept(student.getName(), student.getActivities());});
    }

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> multiply = (a,b) -> System.out.println("Multiply: "+(a*b));
        BiConsumer<Integer, Integer> divide = (a,b) -> System.out.println("Multiply: "+(a/b));

        multiply.andThen(divide).accept(10,5);

        nameAndActivities();
    }
}
