package blackBoxInteger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IOException, NoSuchMethodException,
            InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        Class<BlackBoxInt> blackBoxIntClass = BlackBoxInt.class;
        Constructor<BlackBoxInt> ctor = blackBoxIntClass.getDeclaredConstructor();
        ctor.setAccessible(true);
        BlackBoxInt blackBoxInt = ctor.newInstance();

        Field field = blackBoxIntClass.getDeclaredField("innerValue");
        field.setAccessible(true);

        String line;
        while (!(line = reader.readLine()).equals("END")) {

            String[] tokens = line.split("_");
            String command = tokens[0];
            int number = Integer.parseInt(tokens[1]);
            Method method = blackBoxIntClass.getDeclaredMethod(command, int.class); //!
            method.setAccessible(true);
            method.invoke(blackBoxInt, number);
            System.out.println(field.get(blackBoxInt));
        }
    }

}