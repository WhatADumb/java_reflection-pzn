package self.java.reflection;

import org.junit.jupiter.api.Test;
import self.java.reflection.data.Person;

import java.lang.reflect.Modifier;

public class ModifierTest {
    @Test
    void testModify() {
        Class<Person> personClass = Person.class;

        System.out.println(Modifier.isPublic(personClass.getModifiers()));
        System.out.println(Modifier.isFinal(personClass.getModifiers()));
        System.out.println(Modifier.isStatic(personClass.getModifiers()));
    }
}
