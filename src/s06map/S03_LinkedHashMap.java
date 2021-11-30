package s06map;

import java.util.LinkedHashMap;
import java.util.Map;

public class S03_LinkedHashMap {
    public static void main(String[] args) {
        // LinkedHashMap реализует связанный список элементов отображения и хранит ключи в порядке вставки.
        // Также позволяет сортировать элементы в порядке последнего доступа.
        // LinkedHashMap не обеспечивает скорость поиска как HashMap.

        LinkedHashMap<String, Double> planets = new LinkedHashMap<>();

        // добавление элементов
        planets.put("Mercury", new Double(2439.7));
        planets.put("Earth", new Double(6371));
        planets.put("Saturn", new Double(58232));
        planets.put("Neptune", new Double(24622));
        planets.put("Venus", new Double(6051.8));

        // отображение множества, обратите внимание на порядок вывода
        System.out.println(planets);

        // получить значение по ключу
        System.out.println("get Earth: " + planets.get("Earth"));

        // получение True если ключ есть в отображении, иначе False
        System.out.println("containsKey Earth: " + planets.containsKey("Earth"));

        // получение True если значение есть в отображении, иначе False
        System.out.println("conatainsValue: " + planets.containsValue(6371d));

        // перебор элементов отображения с помощью for
        for (Map.Entry me : planets.entrySet()) {
            System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        }
    }
}
