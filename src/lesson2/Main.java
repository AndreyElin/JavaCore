package lesson2;

public class Main {

    public static void main(String[] args) {

        String[][] nums = {
                {"3", "24", "15", "45"},
                {"3", "24", "15", "45"},
                {"3", "24", "15", "45"},
                {"3", "24", "1er5", "45"}
        };

        try {
            System.out.println(array2dSum(nums));
        } catch (MyArrayDataException e) {
            System.out.print("Неверная ячейка: ");
            System.out.print(e.getI());
            System.out.print(" ");
            System.out.println(e.getJ());
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }


    }

    public static int array2dSum(String[][] nums) {

        int sum = 0;
        int value = 0;
        
        if (nums.length == 4) {
            for (int i = 0; i < 4; i++) {
                if (nums[i].length != 4) {
                    throw new MyArraySizeException("Массив не правильного размера");
                }
            }
        } else {
            throw new MyArraySizeException("Массив не правильного размера");
        }

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    try {
                        value = Integer.parseInt(nums[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }

                    sum += value;
                }
            }

        return sum;
    }
}
