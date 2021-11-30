package hw10;

public class Main {
    public static void main(String[] args) {
        NumBox<Float> floatBox = new NumBox<>(5);
        floatBox.add(1.5f);
        floatBox.add(5.5f);
        floatBox.add(4.1f);
        floatBox.add(7.8f);
        floatBox.add(0.5f);
        print(floatBox);

        NumBox<Integer> intBox = new NumBox<>(5);
        intBox.add(5);
        intBox.add(3);
        intBox.add(0);
        intBox.add(9);
        intBox.add(-3);
        print(intBox);
    }

    private static void print(NumBox<?> numBox) {
        int length = numBox.length();

        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.print(numBox.get(i) + " ");
        }
        System.out.println();

        System.out.println("Sum: " + numBox.sum());
        System.out.println("Avg: " + numBox.average());
        System.out.println("Max: " + numBox.max());
    }
}
