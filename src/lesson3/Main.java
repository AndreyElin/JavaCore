package lesson3;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String[] array = {"e", "t", "s", "t", "e", "s", "e", "m", "e", "t"};

        Map<String, Integer> numCount = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            Integer value = numCount.getOrDefault(array[i], 0);
            numCount.put(array[i], value + 1);
        }

        System.out.println(numCount);
    }

}
