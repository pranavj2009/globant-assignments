package methodReference;

import functional.interfaces.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReference {
    static Supplier<Student> s1 = Student::new;
    static Function<String, Student> f1 = Student::new;
    public static void main(String[] args) {
        System.out.println(s1.get());
        System.out.println(f1.apply("Pranav"));
    }
}
