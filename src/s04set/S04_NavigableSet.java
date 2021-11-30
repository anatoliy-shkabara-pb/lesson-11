package s04set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class S04_NavigableSet {
    public static void main(String[] args) {
        // Интерфейс NavigableSet наследуется от SortedSet и предоставляет возможность
        // навигации по множеству в обоих направлениях.

        NavigableSet<String> planets = new TreeSet<>();

        // добавление элементов
        planets.add("Mercury");
        planets.add("Earth");
        planets.add("Saturn");
        planets.add("Neptune");
        planets.add("Venus");

        // печать множества
        System.out.println(planets);

        // обратный порядок
        NavigableSet<String> planetsReverse = planets.descendingSet();
        System.out.println("descendingSet: " + planetsReverse);

        // получить два последних элемента
        NavigableSet<String> twoLast = planets.tailSet("Saturn", true);
        System.out.println("tailSet: " + twoLast);

        // получить элемент, который перед указанным
        String lower = planets.lower("Saturn");
        System.out.println("lower: " + lower);

        // получить элемент, который после указаного
        String higher = planets.higher("Saturn");
        System.out.println("higher: " + higher);

        // получить первый элемент и удалить его из множества
        System.out.println("pollFirst: " + planets.pollFirst());

        // получить последний элемент и удалить его из множества
        System.out.println("pollLast: " + planets.pollLast());
    }
}
