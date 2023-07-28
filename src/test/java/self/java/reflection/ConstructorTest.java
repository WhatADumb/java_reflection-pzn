package self.java.reflection;

import org.junit.jupiter.api.Test;
import self.java.reflection.data.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ConstructorTest {
    @Test
    void testConstructor() {
        Class<Person> personClass = Person.class;
        for (Constructor<?> declaredConstructor : personClass.getDeclaredConstructors()) {
            System.out.println(declaredConstructor.getName());
            System.out.println(Arrays.toString(declaredConstructor.getParameters()));
            System.out.println(declaredConstructor.getModifiers());
            System.out.println("==============================================");
        }
    }

    @Test
    void testUsingConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Constructor<Person> nullConstructor = personClass.getDeclaredConstructor();
        Constructor<Person> valueConstructor = personClass.getDeclaredConstructor(String.class, String.class);

        Person person1 = nullConstructor.newInstance();
        Person person2 = valueConstructor.newInstance("Daffa", "Hakim");

        System.out.println(person1);
        System.out.println(person2);
    }
}
