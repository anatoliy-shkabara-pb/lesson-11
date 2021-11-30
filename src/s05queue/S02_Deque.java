package s05queue;

import java.util.Deque;
import java.util.LinkedList;

public class S02_Deque {
    public static void main(String[] args) {
        Deque<String> planets = new LinkedList<>();

        planets.addLast("Mercury");
        planets.offerLast("Earth");
        planets.offerLast("Saturn");
        planets.offerLast("Venus");
        System.out.println(planets);

        // пустая очередь?
        System.out.println("isEmpty: " + planets.isEmpty());

        // получить первый элемент очереди, без удаления
        String top = planets.peekFirst();
        System.out.println("top: " + top);
        System.out.println("after top: " + planets);

        // получить первый элемент очереди, с удалением
        String saturn = planets.pollFirst();
        System.out.println("pollFirst: " + saturn);
        System.out.println("after pollFirst: " + planets);

        // итерация по очереди и извлечение по одному элементу
        while (planets.peekFirst() != null) {
            System.out.println("Первый элемент: " + planets.peekFirst());
            planets.removeFirst();
            System.out.println("Очередь: " + planets);
        }
    }
}
