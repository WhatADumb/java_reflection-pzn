package self.java.reflection;

import org.junit.jupiter.api.Test;
import self.java.reflection.data.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ParameterTest {
    @Test
    void testParameters() {
        Class<Person> personClass = Person.class;
        for (Method declaredMethod : personClass.getDeclaredMethods()) {
            System.out.println(declaredMethod.getName());
            for (Parameter parameter : declaredMethod.getParameters()) {
                System.out.println("Name Parameter: " + parameter.getName());
                System.out.println("Type Parameter: " + parameter.getType());
            }
            System.out.println(declaredMethod.getModifiers());
            System.out.println(declaredMethod.getReturnType());
            System.out.println("======================================================");
        }
    }

    @Test
    void testInvokeParameter() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Method setLastName = personClass.getDeclaredMethod("setLastName", String.class);

        Person person = new Person("Alpha", "Beta");
        setLastName.invoke(person, "Celeron");

        System.out.println(person.getLastName());
    }
}
