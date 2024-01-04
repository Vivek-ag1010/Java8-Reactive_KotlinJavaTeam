package rxjavaOperators;

import java.util.Arrays;
import java.util.List;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
    
}
public class PracticeEx2 {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("John", 25),
                new Person("Jane", 32),
                new Person("Bob", 28),
                new Person("Alice", 40)
        );
        // Map each Person to their age
        // Filter out ages below 30
        // Print the remaining ages
        personList.stream()
                .map(a->a.getAge())
                .filter(age -> age >= 30)
                .forEach(System.out::println);
    }
}

