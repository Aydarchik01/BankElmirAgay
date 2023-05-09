import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Person, Bank> map = new HashMap<>();

        map.put(new Person("Person1", 20),
                new Bank(2000000, "Person1"));
        map.put(new Person("Person2", 21),
                new Bank(3000000, "Person2"));
        map.put(new Person("Person3", 22),
                new Bank(4000000, "Person3"));
        map.put(new Person("Person4", 23),
                new Bank(5000000, "Person4"));
        map.put(new Person("Person5", 24),
                new Bank(6000000, "Person5"));

        Task.f(map);
    }
}
