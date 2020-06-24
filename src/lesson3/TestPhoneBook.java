package lesson3;

public class TestPhoneBook {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", 899956761);
        phoneBook.add("Ivanov", 899956762);
        phoneBook.add("Ivanov", 899956763);
        phoneBook.add("Petrov", 899956764);
        phoneBook.add("Sidorov", 899956785);

        for (int arg : phoneBook.get("Ivanov")) {
            System.out.println(arg);
        }

    }
}
