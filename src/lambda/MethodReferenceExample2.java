package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 60),
                new Person("Thomas", "Carlyle", 60),
                new Person("Charlotte", "Bronte", 60),
                new Person("Matthew", "Arnold", 60)
        );

        //Step 1: Sort list by last name

        people.sort((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        //Step 2: Create a method that prints all elements in the list
        System.out.println("Print all person");
        performConditionally(people, p -> true, System.out::println);

        //Step 3: Create a method that prints all people that have last name beginning with C
        System.out.println("Print all person beginning with C");
        performConditionally(people, p -> p.getLastName().startsWith("C"), System.out::println); //p-> System.out.println(p)

        System.out.println("Print all person beginning first name with C");
        performConditionally(people, p -> p.getFirstName().startsWith("C"), p-> System.out.println(p.getFirstName()));
    }

    private static void performConditionally(List<Person> people, Predicate<Person> condition, Consumer<Person> consumer) {
        for (Person p : people) {
            if (condition.test(p)) {
                consumer.accept(p);
            }
        }
    }
}

