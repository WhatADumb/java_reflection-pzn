package self.java.reflection;

import org.junit.jupiter.api.Test;
import self.java.reflection.data.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class TypeParameterTest {
    @Test
    void testGenericField() throws NoSuchFieldException {
        Class<Person> personClass = Person.class;
        Field hobbies = personClass.getDeclaredField("hobbies");
        Type genericType = hobbies.getGenericType();
        System.out.println(genericType.getTypeName());

        if (genericType instanceof ParameterizedType){
            ParameterizedType type = (ParameterizedType) genericType;
            System.out.println(type.getRawType());
            System.out.println(Arrays.toString(type.getActualTypeArguments()));
        }
    }

    @Test
    void testGenericMethod() throws NoSuchMethodException {
        Class<Person> personClass = Person.class;
        Method getHobbies = personClass.getDeclaredMethod("getHobbies");
        Type genericReturnType = getHobbies.getGenericReturnType();
        System.out.println(genericReturnType.getClass());

        if (genericReturnType instanceof ParameterizedType){
            ParameterizedType type = (ParameterizedType) genericReturnType;
            System.out.println(type.getRawType());
            System.out.println(Arrays.toString(type.getActualTypeArguments()));
        }
    }

    @Test
    void testGenericMethodParameter() throws NoSuchMethodException {
        Class<Person> personClass = Person.class;
        Method setHobbies = personClass.getDeclaredMethod("setHobbies", List.class);
        for (Type genericParameterType : setHobbies.getGenericParameterTypes()) {
            System.out.println(genericParameterType.getClass());

            if (genericParameterType instanceof ParameterizedType){
                ParameterizedType type = (ParameterizedType) genericParameterType;
                System.out.println(type.getRawType());
                System.out.println(Arrays.toString(type.getActualTypeArguments()));
            }
        }

    }
}
