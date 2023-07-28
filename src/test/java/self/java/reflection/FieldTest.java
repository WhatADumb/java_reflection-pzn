package self.java.reflection;

import org.junit.jupiter.api.Test;
import self.java.reflection.data.Person;

import java.lang.reflect.Field;

public class FieldTest {
    @Test
    void testField() {
        Class<Person> personClass = Person.class;
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field field : declaredFields){
            System.out.println(field.getName() + ": " + field.getType().getName());
        }
    }

    @Test
    void testGetField() throws NoSuchFieldException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Field firstNames = personClass.getDeclaredField("firstName");
        firstNames.setAccessible(true);

        Person person1 = new Person("Fadhil", "Firmansyah");
        String result1 = (String) firstNames.get(person1);
        System.out.println(result1);

        Person person2 = new Person("Darto", "Darius");
        String result2 = (String) firstNames.get(person2);
        System.out.println(result2);
    }

    @Test
    void testSetField() throws NoSuchFieldException, IllegalAccessException {
        Class<Person> personClass1 = Person.class;
        Field lastName = personClass1.getDeclaredField("lastName");
        lastName.setAccessible(true);

        Person person1 = new Person("Fadhil", "Firmansyah");
        lastName.set(person1, "Daffa");
        System.out.println(person1.getLastName());

        Person person2 = new Person("Joko", "Bagui");
        lastName.set(person2, "Bagus");
        System.out.println(person2.getLastName());
    }
}
