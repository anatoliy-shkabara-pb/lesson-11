package s02linkedlist;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class S01_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> lst = new LinkedList<>();

        // добавление элементов
        lst.add("Mercury");
        lst.add("Earth");
        lst.addLast("Saturn");
        lst.addFirst("Neptune");
        lst.add(1, "Venus");
        System.out.println(lst);

        // вставка в начало
        lst.push("Kopernik");
        System.out.println("after push: " + lst);

        // получение первого элемента
        System.out.println("getFirst: " + lst.getFirst());

        // получение последнего элемента
        System.out.println("getLast: " + lst.getLast());

        // удалить первый элемент из списка и вернуть значение
        System.out.println("removeFirst: " + lst.removeFirst());
        System.out.println("after removeFirst: " + lst);

        // удалить первый элемент из списка и вернуть значение
        System.out.println("poll: " + lst.poll());
        System.out.println("after poll: " + lst);

        // удалить первый элемент из списка и вернуть значение
        System.out.println("pop: " + lst.pop());
        System.out.println("after pop: " + lst);

        // удалить последний элемент из списка и вернуть значение
        System.out.println("removeLast: " + lst.removeLast());
        System.out.println("after removeLast: " + lst);
    }
}
