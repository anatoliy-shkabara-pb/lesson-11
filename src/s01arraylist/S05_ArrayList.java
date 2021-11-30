package s01arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class S05_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();

        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Saturn");
        planets.add("Neptune");

        System.out.println("list: " + planets);
        //список в обратном порядке
        Collections.reverse(planets);
        System.out.println("after reverse: " + planets);

        // заменить значение каждого элемента списка на результат оператор
        planets.replaceAll(
                new UnaryOperator<String>() {
                    @Override
                    public String apply(String s) {
                        return "*" + s + "*";
                    }
                }
        );

//        planets.replaceAll(new UnaryOperator<String>() {
//            @Override
//            public String apply(String s) {
//                return String.valueOf(s.length());
//            }
//        });

        System.out.println("after replaceAll: " + planets);

        // выполнить действие над каждым элементом списка

        planets.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("We are flying to " + s);
            }
        });

//        Iterator<String> iterator = planets.iterator();
//        while (iterator.hasNext()) {
//            String item = iterator.next();
//            //iterator.remove();
//            planets.remove(0);
//            System.out.println(item);
//        }


        for (String p: planets) {
            planets.remove(p);
            System.out.println(p);
        }
    }
}
