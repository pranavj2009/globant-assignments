package streams;

import functional.interfaces.data.Student;
import functional.interfaces.data.StudentDataBase;

import java.util.Optional;

public class ReduceExample2 {

    public static Optional<Student> getHighestGPAStudent(){
        return StudentDataBase.getAllStudents().stream().
                reduce((student1, student2) ->
                student1.getGpa()>student2.getGpa()?student1:student2);
    }

    public static void main(String[] args) {
        System.out.println(getHighestGPAStudent().get());
    }
}
