package s01arraylist;

import java.util.ArrayList;

public class S03_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();

        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Saturn");
        planets.add("Neptune");

        // удаление элемента по индексу
        planets.remove(1);

        System.out.println("after remove 1: " + planets);

        // удалить все элементы в списке
        ArrayList<String> favorite = new ArrayList<>();
        favorite.add("Earth");
        favorite.add("Saturn");
        planets.removeAll(favorite);

        System.out.println("after removeAll: " + planets);
    }
}
