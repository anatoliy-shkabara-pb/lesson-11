package s06map;

import java.util.*;

public class S02_TreeMap {
    public static void main(String[] args) {
        TreeMap<String, Double> planets = new TreeMap<>();

        // добавление элементов
        planets.put("Mercury", new Double(2439.7));
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
        System.out.println("containsValue: " + planets.containsValue("Earth"));

        // пустое отображение?
        System.out.println("isEmpty: " + planets.isEmpty());

        // удаление элемента по ключу
        planets.remove("Saturn");
        System.out.println("after remove Saturn: " + planets);

        // список ключей
        Set keys = planets.keySet();
        System.out.println("keySet: " + keys);

        // список значений
        Collection<Double> values = planets.values();
        System.out.println("values: " + values);

        // множество элементов ввиде объектов интерфейса Map.Entry
        Set entries = planets.entrySet();
        System.out.println("entrySet: " + entries);

        // перебор элементов отображения с помощью for
        for (Map.Entry me : planets.entrySet()) {
            System.out.println("Key: " + me.getKey() + " & Value: " + me.getValue());
        }

        // перебор элементов отображения с помощью while
        Iterator i = planets.entrySet().iterator();
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        // размер отображения
        System.out.println("size: " + planets.size());

        // сортировка элементов по значению
        System.out.println("before sort");
        for (Map.Entry me : planets.entrySet()) {
            System.out.println("Key: " + me.getKey() + " & Value: " + me.getValue());
        }
        System.out.println("after sort");
        Map sortedMap = sortByValues(planets);
        for (Map.Entry me : (Set<Map.Entry>) sortedMap.entrySet()) {
            System.out.println("Key: " + me.getKey() + " & Value: " + me.getValue());
        }

        // удалить все элементы
        planets.clear();
    }

    public static <K, V extends Comparable<V>>Map<K, V> sortByValues ( final Map<K, V> map) {
        Comparator<K> valueComparator = new Comparator<K>() {
            public int compare(K k1, K k2) {
                int compare = map.get(k1).compareTo(map.get(k2));
                if (compare == 0)
                    return 1;
                else
                    return compare;
            }
        };

        Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
        sortedByValues.putAll(map);
        return sortedByValues;
    }
}
