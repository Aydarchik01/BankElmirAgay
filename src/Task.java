import java.util.Map;
import java.util.Scanner;

public class Task {
    public static void f(Map<Person,Bank> map){
        while (true) {
            Scanner scan = new Scanner(System.in);
            String a2 = scan.next();
            for (Map.Entry <Person, Bank> name : map.entrySet()) {
                if (a2.equals(name.getValue().getOwnerName())) {
                    System.out.println(name.getValue());
                }
            }
            if (a2.equals("STOP")) {
                break;
            }
        }
    }
}
