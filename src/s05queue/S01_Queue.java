package s05queue;

import java.util.LinkedList;
import java.util.Queue;

public class S01_Queue {
    public static void main(String[] args) {
        Queue<String> planets = new LinkedList<>();

        // добавление элементов
        planets.add("Mercury");
        planets.add("Earth");
        planets.add("Saturn");

        // добавить элемент, в случаи проблемы - выбросить exception
        planets.add("Neptune");

        // добавить элемент, в случаи проблемы - вернуть false
        planets.offer("Venus");

        // получить последний элемент очереди, без удаления
        String top = planets.element();
        System.out.println("top: " + top);
        System.out.println("after top: " + planets);

        // получить последний элемент очереди, с удалением
        String saturn = planets.remove();
        System.out.println("remove: " + saturn);
        System.out.println("after remove: " + planets);

        // итерация элементов
        for(String planet : planets) {
            System.out.print(planet + " - ");
        }
    }
}
