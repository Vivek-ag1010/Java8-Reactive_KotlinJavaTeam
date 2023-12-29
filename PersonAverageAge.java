package streams;

import java.util.List;
class Person {
    private String name;
    private double age;

    public Person(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public double getAge() {
        return age;
    }
}
public class PersonAverageAge {

    public static double calculateAverageAge(List<Person> persons) {
       double sum= persons.stream()
                .map(Person::getAge).reduce(0.0,Double::sum);
       return sum/persons.size();
    }

    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("Alice", 25.0),
                new Person("Bob", 30.0),
                new Person("Charlie", 22.0),
                new Person("David", 28.0)
        );

        double averageAge = calculateAverageAge(personList);

        System.out.println("Average Age: " + averageAge);
    }
}