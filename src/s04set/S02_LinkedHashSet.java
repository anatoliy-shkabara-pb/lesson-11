package s04set;

import java.util.LinkedHashSet;

public class S02_LinkedHashSet {
    public static void main(String[] args) {
        // Класс LinkedHashSet расширяет класс HashSet, не добавляя никаких новых методов.
        // Класс поддерживает связный список элементов множества в том порядке, в котором они вставлялись.

        LinkedHashSet<String> planets = new LinkedHashSet<>();

        // добавление элементов
        planets.add("Mercury");
        planets.add("Earth");
        planets.add("Saturn");
        planets.add("Neptune");

        // отображение множества, обратите внимание на порядок вывода
        System.out.println(planets.toString());
    }
}
