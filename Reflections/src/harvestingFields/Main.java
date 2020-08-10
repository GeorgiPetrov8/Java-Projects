package harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Class<RichSoilLand> soilLandClass = RichSoilLand.class;

        String input;
        while (!(input = scan.nextLine()).equals("HARVEST")) {
            Field[] fields = soilLandClass.getDeclaredFields();
            if (!input.equals("all")) {
                for (Field field : fields) {
                    String mod = Modifier.toString(field.getModifiers());
                    if (mod.equals(input)) {
                        System.out.printf("%s %s %s%n", mod, field.getType().getSimpleName(),
								field.getName().split(" ")[0]);
                    }
                }
            } else {
                for (Field field : fields) {
                    String mod = Modifier.toString(field.getModifiers());
                    System.out.printf("%s %s %s%n", mod, field.getType().getSimpleName(),
							field.getName().split(" ")[0]);
                }
            }
        }

    }
}
