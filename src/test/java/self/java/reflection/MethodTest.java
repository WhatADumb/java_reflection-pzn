package self.java.reflection;

import org.junit.jupiter.api.Test;
import self.java.reflection.data.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MethodTest {
    @Test
    void testMethod() {
        Class<Person> personClass = Person.class;
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for(Method method : declaredMethods){
            System.out.println(method.getName());
            System.out.println(method.getModifiers());
            System.out.println(Arrays.toString(method.getGenericParameterTypes()));
            System.out.println(method.getReturnType());
            System.out.println(Arrays.toString(method.getExceptionTypes()));
            System.out.println("================================================");
        }
    }

    @Test
    void testInvokeMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Method method = personClass.getDeclaredMethod("getFirstName");

        Person person = new Person("Fadhil", "Firmansyah");
        String result = (String) method.invoke(person);
        System.out.println(result);
    }
}
