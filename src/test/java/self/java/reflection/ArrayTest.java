package self.java.reflection;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {
    @Test
    void testArray() {
        Class<String[]> stringArray = String[].class;
        Class<int[][]> intClass = int[][].class;

        System.out.println(stringArray.isArray());
        System.out.println(intClass.isArray());
    }

    @Test
    void testMemberArray() {
        Class<String[]> stringClass = String[].class;

        System.out.println(Arrays.toString(stringClass.getDeclaredConstructors()));
        System.out.println(Arrays.toString(stringClass.getDeclaredMethods()));
        System.out.println(Arrays.toString(stringClass.getDeclaredFields()));
        System.out.println(stringClass.getComponentType());
    }

    @Test
    void testManipulationArray() {
        Class<String[]> stringArray = String[].class;
        String[] arrayString = (String[]) Array.newInstance(stringArray.getComponentType(), 5);

        System.out.println(Arrays.toString(arrayString));

        Array.set(arrayString, 0, "Alpha");
        Array.set(arrayString, 1, "Beta");
        Array.set(arrayString, 2, "Celeron");
        Array.set(arrayString, 3, "Delta");
        System.out.println(Arrays.toString(arrayString));

        System.out.println(Array.get(arrayString, 0));
    }
}
