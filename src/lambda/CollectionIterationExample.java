package lambda;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {
    public static void main(String []args){
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 60),
                new Person("Thomas", "Carlyle", 60),
                new Person("Charlotte", "Bronte", 60),
                new Person("Matthew", "Arnold", 60)
        );
        System.out.println("Using for loop");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

        System.out.println("Using foreach loop");
        for (Person p:people){
            System.out.println(p);
        }

        System.out.println("Using lambda expresions");
        people.forEach(System.out::println); //p -> System.out.println(p)
    }
}
