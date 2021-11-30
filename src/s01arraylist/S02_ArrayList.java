package s01arraylist;

import java.util.ArrayList;

public class S02_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();

        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Saturn");
        planets.add("Neptune");

        // получение True если значение есть в массиве, иначе False
        System.out.println("contains Earth: " + planets.contains("Earth"));

        // получение True если все значения есть в массиве, иначе False
        ArrayList<String> favorite = new ArrayList<>();
        favorite.add("Earth");
        favorite.add("Saturn");
        System.out.println("contains Earth and Saturn: " + planets.containsAll(favorite));

        System.out.println("before remove: " + planets);
        // удаление элемента по значению
        planets.remove("Saturn");
        planets.remove("Neptune");

        System.out.println("after remove: " + planets);

        // оставить в списке только указаные элементы
        ArrayList<String> favorite2 = new ArrayList<>();
        favorite2.add("Earth");
        favorite2.add("Saturn");
        planets.retainAll(favorite2);

        System.out.println("after retainAll: " + planets);
    }
}
