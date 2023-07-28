package self.java.reflection;

import org.junit.jupiter.api.Test;
import self.java.reflection.data.Person;

public class SuperClassTest {
    @Test
    void testSuperClass() {
        Class<Person> personClass = Person.class;
        System.out.println(personClass);

        Class<? super Person> superclass1 = personClass.getSuperclass();
        System.out.println(superclass1);

        Class<? super Person> superclass2 = superclass1.getSuperclass();
        System.out.println(superclass2);
    }
}
