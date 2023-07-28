package self.java.reflection;

import org.junit.jupiter.api.Test;
import self.java.reflection.data.Person;
import self.java.reflection.validation.Validator;

public class AnnotationTest {
    @Test
    void testAnnotation() throws IllegalAccessException {
        Person person = new Person("", "Xondala");

        Validator.validateNotBlank(person);
    }
}
