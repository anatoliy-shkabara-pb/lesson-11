package s04set;

import java.util.*;

public class S01_HashSet {
    public static void main(String[] args) {
        HashSet<String> planets = new HashSet<>();

        // добавление элементов
        planets.add("Mercury");
        planets.add("Earth");
        planets.add("Saturn");
        planets.add("Neptune");
        planets.add("Venus");

        // отображение множества, обратите внимание на порядок вывода
        System.out.println(planets);

        // получение True если значение есть в множестве, иначе False
        System.out.println("contains Earth: " + planets.contains("Earth"));

        // пустое множество?
        System.out.println("isEmpty: " + planets.isEmpty());

        // удаление элемента по значению
        System.out.println("remove Saturn: " + planets.remove("Saturn"));
        System.out.println("after remove: " + planets);

        // размер множества
        System.out.println("size: " + planets.size());

        // перебор элементов множества
        for(String str: planets) {
            System.out.print(str + " - ");
        }
        System.out.println();

        // конвертирование HashSet в ArrayList

        List<String> arr = new ArrayList<>(planets);
        System.out.println("list: " + arr);

        // удалить все элементы
        planets.clear();
        System.out.println("after clear: " + planets);

        // конвертирование List в Set
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 1);
        Set<Integer> set = new HashSet<>(list);
        System.out.println("list -> set: " + set);
    }
}
