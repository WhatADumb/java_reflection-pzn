package self.java.reflection;

import org.junit.jupiter.api.Test;
import self.java.reflection.data.Person;

import java.util.Arrays;

public class PackageTest {
    @Test
    void testPackage() {
        Class<Person> personClass = Person.class;
        Package aPackage = personClass.getPackage();

        System.out.println(aPackage.getName());
        System.out.println(Arrays.toString(aPackage.getAnnotations()));

    }
}
