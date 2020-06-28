package lesson5;

public class MainTest {

    static final int SIZE = 10_000_000;

    public static void main(String[] args) {

        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        long a1 = System.currentTimeMillis();
        new CreateOneArray().createOneArray(arr);
        System.currentTimeMillis();
        System.out.println("Метод 1: " + (System.currentTimeMillis() - a1));

        long a2 = System.currentTimeMillis();
        new CreateOneArrayFromTwoArray().createOneArrayFromTwoArray(arr);
        System.currentTimeMillis();
        System.out.println("Метод 2: " + (System.currentTimeMillis() - a2));

    }

}
