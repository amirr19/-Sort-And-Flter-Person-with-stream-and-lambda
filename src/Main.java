import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(20, "amir", "haji", new Address("lavizan", "shiyan", 1, "tehran", 1232344)));
        people.add(new Person(24, "karim", "karimi", new Address("laviz", "tehranpars", 2, "mahshad", 12344)));
        people.add(new Person(32, "mohammad", "mohammdi", new Address("shemiran", "sdvdf", 6, "shiraz", 4552344)));
        people.add(new Person(18, "soltan", "soltani", new Address("hashtom", "narmack", 7, "yazd", 1238678)));
        people.add(new Person(26, "ali", "alavi", new Address("janatabad", "takhti", 3, "tehran", 3134344)));
        System.out.println("Before Sorting the people data:");
        people.forEach(System.out::println);
        System.out.println("After Sorting the people data by Age:");
        people.sort(Comparator.comparingInt(Person::getAge));
        //         people.sort((Person p1,Person p2)->p1.getAge()-p2.getAge());_____________?? ask it
        people.forEach(System.out::println);
        System.out.println("After Sorting the people data by Name:");
        //  people.sort(Comparator.comparing(Person::getLastName));
        people.sort(Comparator.comparingInt((Person p) -> p.getLastName().length()));
//        people.sort((Person p1, Person p2) -> Integer.compare(p1.getLastName().length(),p2.getLastName().length()));
        people.forEach(person -> System.out.println(person.getLastName()));
        List<Person> result = people.stream()
//                .map(s -> Integer.valueOf(s))                       // Convert to steam
                .filter((p) -> "tehran".equals(p.getAddress().getCity()) && 5 >= p.getAddress().getZone())
                .collect(Collectors.toList());
        System.out.println("in tehran and less tham 5____________________________");
        for (Person p: result
             ) {
            System.out.println(p.getFirstName());
        }

    }
}
