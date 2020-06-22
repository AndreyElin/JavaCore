package lesson3;

import java.util.*;

public class PhoneBook {

    Map<String, List<Integer>> phoneBook = new HashMap<>();

    public void add(String surnames, int number) {

        if (phoneBook.get(surnames) == null) {
            List<Integer> list = new ArrayList<>();
            list.add(number);
            phoneBook.put(surnames, list);
        } else {
            List<Integer> value = phoneBook.get(surnames);
            value.add(number);
            phoneBook.put(surnames, value);
        }

    }

    public List<Integer> get(String surnames) {
        return phoneBook.get(surnames);
    }
}
