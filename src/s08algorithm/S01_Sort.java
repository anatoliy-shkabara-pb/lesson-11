package s08algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class S01_Sort {
    public static void main(String[] args) {
        // сортировка массивов
        // сортировка по возростанию
        int[] array = {1, 0, -2, 3, 5, 2, 0, 20};
        System.out.println("array = " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("sorted array = " + Arrays.toString(array));
        System.out.println();

        // сортировка в обратном направлении
        int[] array2 = {4, 0, -2, 7, 5, 4, 2, 8};
        System.out.println("array2 = " + Arrays.toString(array2));
        Integer[] objectArray = convertToObjectList(array2);
        Arrays.sort(objectArray, Comparator.reverseOrder());
        System.out.println("revers sorted array = " + Arrays.toString(objectArray));
        System.out.println();

        // сортировка коллекций
        class Person implements Comparable<Person>{
            String name;
            int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public int compareTo(Person o) {
                return 0;
            }

            @Override
            public String toString() {
                return "{ " + name + ", " + age + " }";
            }
        }

        List<Person> persons = Arrays.asList(
                new Person("Alex", 21),
                new Person("Jon", 18),
                new Person("Bob", 35),
                new Person("Anna", 23));
        System.out.println("persons = " + persons);

        // ошибка компиляции, так как класс Person не реализует интерфейс Comparable,
        // т.е. не известно как сравнивать дава объекта этого типа
        Collections.sort(persons);

        // сортировка по полю name
        persons.sort(Comparator.comparing(p -> p.name));
        System.out.println("sorted by name persons = " + persons);

        //сортировка по полю age
        persons.sort(Comparator.comparing(p -> p.age));
        System.out.println("sorted by age persons = " + persons);
    }

    private static Integer[] convertToObjectList(int[] array) {
        Integer[] objects = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            objects[i] = array[i];
        }
        return objects;
    }
}
