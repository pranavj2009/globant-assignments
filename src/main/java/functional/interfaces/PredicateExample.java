package functional.interfaces;

import functional.interfaces.data.Student;
import functional.interfaces.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Student> p1 = student -> student.getGradeLevel()>=3;
    static Predicate<Student> p2 = student -> student.getGpa()>=3.9;
    static BiPredicate<Integer, Double> p3 = (grade, gpa) -> grade>=3 && gpa>=3.9;

    static BiConsumer<String, List<String>> studentBiConsumer = (name, activities) ->
        System.out.println(name + " : " + activities);

    static Consumer<Student> studentConsumer = student -> {
        if(p1.and(p2).test(student)){
            studentBiConsumer.accept(student.getName(),student.getActivities());
        }
    };

    static Consumer<Student> studentConsumerBiPredicate = student -> {
        if(p3.test(student.getGradeLevel(), student.getGpa())){
            studentBiConsumer.accept(student.getName(),student.getActivities());
        }
    };

    public static void printStudentDetails(){
        System.out.println("printStudentDetails");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(studentConsumer);
        studentList.forEach(studentConsumerBiPredicate);
    }

    static void filterStudentsByGradeLevel(){
        System.out.println("filterStudentsByGradeLevel");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p1.test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterStudents() {
        System.out.println("filterStudents");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p1.and(p2).test(student)){
                System.out.println(student);
            }
        });
    }

        public static void main(String[] args) {

        //filterStudentsByGradeLevel();
        //    filterStudents();
            printStudentDetails();
    }
}
