package s07compare;

import java.util.Objects;
import java.util.TreeSet;
import java.util.function.Consumer;

public class S01_Comparable {

    static class Person implements Comparable<Person> {

        private String name;

        Person(String name) {
            this.name = name;
        }

        String getName() {
            return name;
        }

        public int compareTo(Person p) {
            return Integer.compare(name.length(), p.getName().length());
            //return name.compareTo(p.getName());
        }
    }

    public static void main(String[] args) {
        TreeSet<Person> people = new TreeSet<>();
        people.add(new Person("Tom"));
        people.add(new Person("Jack"));
        people.add(new Person("Anna"));
        people.add(new Person("Bob"));

        people.forEach(new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                System.out.print(person.name + " - ");
            }
        });
        System.out.println();
    }
}
