package functional.interfaces;

import functional.interfaces.data.Student;
import functional.interfaces.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;


public class ConsumerExample {
    static String line = "----------------------------------------------------------------";
    static Consumer<Student> c1 = (Student student) -> System.out.println("Name: "+student.getName());
    static Consumer<Student> c2 = (Student student) -> System.out.println("Activities: "+student.getActivities());

    public static void main(String[] args) {
        printStudents();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }

    public static void printStudents(){
        System.out.println(line);
        System.out.println("printStudents");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c1);
    }

    public static void printNameAndActivities(){
        System.out.println(line);
        System.out.println("printNameAndActivities");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c1.andThen(c2));
    }

    static void printNameAndActivitiesUsingCondition(){
        System.out.println(line);
        System.out.println("printNameAndActivitiesUsingCondition");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(student.getGradeLevel()>=3 && student.getGpa()>=3.9){
                c1.andThen(c2).accept(student);
            }
        });
    }
}
