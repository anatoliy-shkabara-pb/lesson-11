package s06map;

import java.util.*;

public class S01_HashMap {
    public static void main(String[] args) {
        HashMap<String, Double> planets = new HashMap<>();

        // добавление элементов
        planets.put("Mercury", 2439.7);
        planets.put("Earth", new Double(6371));
        planets.put("Saturn", new Double(58232));
        planets.put("Neptune", new Double(24622));
        planets.put("Venus", new Double(6051.8));

        // отображение множества, обратите внимание на порядок вывода
        System.out.println(planets);

        // получить значение по ключу
        Double radius = planets.get("Earth");
        System.out.println("get Earth: " + radius);

        // получение True если ключ есть в отображении, иначе False
        System.out.println("containsKey Earth: " + planets.containsKey("Earth"));

        // получение True если значение есть в отображении, иначе False
        System.out.println("containsValue Earth: " + planets.containsValue("Earth"));

        // пустое отображение?
        System.out.println("isEmpty: " + planets.isEmpty());

        // удаление элемента по ключу
        planets.remove("Saturn");
        System.out.println("after remove Saturn: " + planets);

        // список ключей
        Set<String> keys = planets.keySet();
        System.out.println("keySet: " + keys);

        // список значений
        Collection<Double> values = planets.values();
        System.out.println("values: " + values);

        // множество элементов ввиде объектов интерфейса Map.Entry
        Set<Map.Entry<String, Double>> entries = planets.entrySet();
        System.out.println("entrySet: " + entries);

        // перебор элементов Entry отображения с помощью for
        System.out.println();
        System.out.println("-for-");
        for (Map.Entry<String, Double> me : planets.entrySet()) {
            System.out.println("Key: " + me.getKey() + " & Value: " + me.getValue());
        }
        System.out.println();

        System.out.println("-while-");
        // перебор элементов отображения с помощью while
        Iterator i = planets.entrySet().iterator();

        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // размер отображения
        System.out.println("size: " + planets.size());

        // удалить все элементы
        planets.clear();
        System.out.println("after clear: " + planets);
    }
}
