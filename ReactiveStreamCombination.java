//problem
/*Create a Java program using Project Reactor to simulate the combination of two reactive streams. 
Assume a Person class with a name and an age. Implement a reactive pipeline to combine two streams of persons, 
filter those above a certain age, and print the names of the eligible persons.*/

package reactiveStreams;

import reactor.core.publisher.Flux;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ReactiveStreamCombination {

    public static void main(String[] args) {
        Flux<Person> stream1 = Flux.just(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 22)
        );

        Flux<Person> stream2 = Flux.just(
                new Person("David", 35),
                new Person("Eva", 28),
                new Person("Frank", 40)
        );

        int ageThreshold = 30;

        Flux.concat(stream1, stream2).filter(age->age.getAge()>ageThreshold).subscribe(name->System.out.println("Name of egligible: "+name));
    }
}
