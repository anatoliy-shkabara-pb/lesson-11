package s03stack;

import java.util.Stack;

public class S01_Stack {
    public static void main(String[] args) {
        Stack<String> planets = new Stack<>();

        // добавление элементов
        planets.push("Mercury");
        planets.push("Earth");
        planets.push("Saturn");

        // вывод стэка
        System.out.println(planets);

        // пустой стэк?
        System.out.println("empty: " + planets.empty());

        // получить вершину стэка, без удаления
        String top = planets.peek();
        System.out.println("peek: " + top);
        System.out.println("after top: " + planets);

        // получить вершину стэка, с удалением
        String saturn = planets.pop();
        System.out.println("pop: " + saturn);
        System.out.println("after pop: " + planets);

        // поиск элемента в стэке (вызов метода equals() для каждого элемента)
        int index = planets.search("Earth");
        System.out.println("search Earth: " + index);
    }
}
