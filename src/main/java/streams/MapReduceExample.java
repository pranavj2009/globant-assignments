package streams;

import functional.interfaces.data.Student;
import functional.interfaces.data.StudentDataBase;

public class MapReduceExample {
    public static int getTotalNumberOfNotebooks(){
        return StudentDataBase.getAllStudents().stream().map(Student::getNoteBooks)
                //.reduce(0,(a,b)-> a+b)
                .reduce(0,Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(getTotalNumberOfNotebooks());
    }
}
