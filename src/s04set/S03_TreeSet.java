package s04set;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class S03_TreeSet {
    public static void main(String[] args) {
        class A {
            int num;

            public A(int num) {
                this.num = num;
            }

            @Override
            public String toString() {
                return "A{" +
                        "num=" + num +
                        '}';
            }
        }

        TreeSet<A> set = new TreeSet<>(new Comparator<A>() {
            @Override
            public int compare(A o1, A o2) {
                return Integer.compare(o1.num, o2.num);
            }
        });
        set.add(new A(42));
        set.add(new A(10));
        set.add(new A(5));

        System.out.println(set);





        TreeSet<String> planets = new TreeSet<>();

        // добавление элементов
        planets.add("Mercury");
        planets.add("Earth");
        planets.add("Saturn");
        planets.add("Neptune");
        planets.add("Venus");

        // добавлене несколько элементов сразу
        planets.addAll(Arrays.asList("PlanetX", "PlanetY", "PlanetZ"));

        // отображение множества, обратите внимание на порядок вывода
        System.out.println(planets);

        // получение True если значение есть в множестве, иначе False
        System.out.println("contains Earth: " + planets.contains("Earth"));

        // пустое множество?
        System.out.println("isEmpty: " + planets.isEmpty());

        // получить первый элемент
        System.out.println("first: " + planets.first());

        // получить последний элемент
        System.out.println("last: " + planets.last());

        // получить все элементы перед указаным
        System.out.println("headSet Neptune: " + planets.headSet("Neptune"));

        // получить все элементы после указаного
        System.out.println("tailSet: " + planets.tailSet("Neptune"));

        // получить все элементы между двумя указаными
        System.out.println("subSet: " + planets.subSet("Mercury", "Venus"));

        // удаление элемента по значению
        System.out.println("remove Saturn: " + planets.remove("Saturn"));
        System.out.println("aster remove: " + planets);

        // размер множества
        System.out.println("size: " + planets.size());

        // получить индекс элемента
        System.out.println("index of Neptune: " + planets.headSet("Neptune").size());
    }
}
