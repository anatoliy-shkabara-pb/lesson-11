package s07compare;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class S02_Comparator {

    static class Person {

        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }


    static class PersonNameComparator implements Comparator<Person> {

        public int compare(Person a, Person b) {
            return a.getName().compareTo(b.getName());
        }
    }

    static class PersonAgeComparator implements Comparator<Person> {

        public int compare(Person a, Person b) {
            if (a.getAge() > b.getAge())
                return 1;
            else if (a.getAge() < b.getAge())
                return -1;
            else
                return 0;
        }

        public static void main(String[] args) {
            PersonNameComparator pcomp = new PersonNameComparator();
            TreeSet<Person> people = new TreeSet<>(pcomp);

            people.add(new Person("Tom", 23));
            people.add(new Person("Nick", 34));
            people.add(new Person("Tom", 10));
            people.add(new Person("Bill", 14));

            people.forEach(new Consumer<Person>() {
                @Override
                public void accept(Person p) {
                    System.out.print(p.getName() + " - ");
                }
            });
            System.out.println();

            Comparator<Person> multiComp = new PersonNameComparator()
                    .thenComparing(new PersonAgeComparator());
            TreeSet<Person> persons = new TreeSet<>(multiComp);
            persons.add(new Person("Tom", 23));
            persons.add(new Person("Nick", 34));
            persons.add(new Person("Tom", 10));
            persons.add(new Person("Bill", 14));
            persons.forEach(new Consumer<Person>() {
                @Override
                public void accept(Person p) {
                    System.out.print("[" + p.getName() + ": " + p.getAge() + "] - ");
                }
            });
        }
    }
}
