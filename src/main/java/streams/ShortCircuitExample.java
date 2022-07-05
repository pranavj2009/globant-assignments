package streams;

import functional.interfaces.data.Student;
import functional.interfaces.data.StudentDataBase;

import java.util.Optional;

public class ShortCircuitExample {
    public static boolean isAnyMatchForGPA(double gpa){
        return StudentDataBase.getAllStudents().stream().anyMatch(student -> student.getGpa()>gpa);
    }

    public static boolean isAllMatchForGPA(double gpa){
        return StudentDataBase.getAllStudents().stream().allMatch(student -> student.getGpa()>gpa);
    }

    public static boolean isNoneMatchForGPA(double gpa){
        return StudentDataBase.getAllStudents().stream().noneMatch(student -> student.getGpa()>gpa);
    }

    public static Optional<Student> getFirstStudentForGrade(int grade){
        return StudentDataBase.getAllStudents().stream().filter(student -> student.getGradeLevel()>3).findFirst();
    }

    public static Optional<Student> getAnyStudentForGrade(int grade){
        return StudentDataBase.getAllStudents().stream().filter(student -> student.getGradeLevel()>3).findAny();
    }
    public static void main(String[] args) {
        System.out.println(isAnyMatchForGPA(4));
        System.out.println(isNoneMatchForGPA(5));
        System.out.println(isAllMatchForGPA(1));

        System.out.println(getFirstStudentForGrade(3).get());
    }
}
