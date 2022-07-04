package functional.interfaces;

import functional.interfaces.data.Student;

import java.util.Arrays;
import java.util.function.Supplier;

public class SupplierExample {
    static Supplier<Student> studentSupplier = () -> {
        return new Student("Pranav",4,3.5,"Male", Arrays.asList("swimming", "basketball","volleyball"));
    };
    public static void main(String[] args) {
        System.out.println(studentSupplier.get());
    }
}
