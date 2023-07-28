package self.java.reflection.validation;

import self.java.reflection.annotation.NotBlank;

import java.lang.reflect.Field;

public class Validator {

    public static void validateNotBlank(Object object) throws IllegalAccessException {
        Class<?> aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (Field field : fields) {
            NotBlank notBlank = field.getAnnotation(NotBlank.class);

            if (notBlank != null) {
                field.setAccessible(true);
                String value = (String) field.get(object);

                if(notBlank.allowEmptyString()) {
                } else {
                    value = value.trim();
                }

                if ("".equals(value)) {
                    throw new RuntimeException(field.getName() + " must not blank");
                }
            }
        }
    }
}
