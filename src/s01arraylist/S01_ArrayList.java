package s01arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S01_ArrayList {

    public static void main(String[] args) {
        List<String> planets = new ArrayList<>();

        // добавление элементов
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Saturn");
        planets.add("Neptune");

        planets.remove(0);
        planets.add("X");
        System.out.println(planets);

        // добавлене несколько элементов сразу
        List<String> strings = Arrays.asList("PlanetX", "PlanetY", "PlanetZ");
        planets.addAll(strings);

        // отображение массива
        System.out.println(planets);

        // добавление элемента в определеную позицию
        planets.add(0, "Jupiter");
        planets.add(1, "Uranus");

        System.out.println(planets);
    }
}
