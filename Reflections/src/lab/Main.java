package lab;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Class<Reflection> clazz = Reflection.class;

        Field[] fields = clazz.getFields();
        

        Method[] methods = clazz.getDeclaredMethods();

        List<Method> getters = new ArrayList<>();
        List<Method> setters = new ArrayList<>();

        for (Method method : methods) {
            if (method.getName().startsWith("get")) {
                getters.add(method);
            } else if (method.getName().startsWith("set")) {
                setters.add(method);
            }

        }

        getters.sort(Comparator.comparing(Method::getName));
        setters.sort(Comparator.comparing(Method::getName));

        for (Method getter : getters) {
            System.out.printf("%s will return %s %s%n",getter.getName(),
                    getter.getReturnType() == int.class ? "class" : "",
                    getter.getReturnType());
        }

        for (Method setter : setters) {
            System.out.printf("%s and will set field of %s %s%n", setter.getName(),
                    setter.getReturnType() == int.class ? "class" : "",
                    setter.getParameterTypes()[0]);
        }

    }
}
