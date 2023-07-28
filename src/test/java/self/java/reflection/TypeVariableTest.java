package self.java.reflection;

import org.junit.jupiter.api.Test;
import self.java.reflection.data.Data;

import java.lang.reflect.TypeVariable;
import java.util.Arrays;

public class TypeVariableTest {
    @Test
    void testGetTypeVariable() {
        Class<Data> dataClass = Data.class;
        for (TypeVariable<Class<Data>> typeParameter : dataClass.getTypeParameters()) {
            System.out.println(typeParameter.getName());
            System.out.println(typeParameter.getGenericDeclaration());
            System.out.println(Arrays.toString(typeParameter.getBounds()));
        }

    }
}
