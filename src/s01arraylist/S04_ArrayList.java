package s01arraylist;

import java.util.ArrayList;
import java.util.function.Predicate;

public class S04_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();

        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Saturn");
        planets.add("Neptune");

        System.out.println("before removeIf: " + planets);
        // удалить элементы списка, которые соответсвуют условию
        planets.removeIf(
                new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return "Saturn".equals(s);
                    }
                }
        );
        System.out.println("after removeIf: " + planets);

        // обновление значения по индекску
        planets.set(1, "Neptune");
        System.out.println("after set 1: " + planets);


        // получить индекс элемента по значению, если не найденно то -1
        System.out.println("indexOf Jupiter: " + planets.indexOf("Jupiter"));

        // получение элемента по индексу
        System.out.println("get by index 3: " + planets.get(3));

        // размер массива
        System.out.println("size: " + planets.size());

        // получить часть массива
        ArrayList<String> lst2 = new ArrayList<>(planets.subList(1, 3));
        System.out.println("subList: " + lst2);

        // удалить все элементы
        planets.clear();
        System.out.println("after clear: " + planets);
    }
}
