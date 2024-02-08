package seminar2.homeWork;

public class Test {
    public void task0(int arr[]) {
//        Написать метод, возвращающий количество чётных элементов массива.
//        countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Колличество нечетных чисел: " + count);
    }

    public void task1(int arr[]) {
//        Написать функцию, возвращающую разницу между самым большим и 
//        самым маленьким элементами переданного не пустого массива.
        int diff = 0;
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
            diff = max - min;
        }
//        System.out.println("Максимальный элемент в данном массиве: " + max);
//        System.out.println("Минимальный элемент в данном массиве: " + min);
        System.out.println("Разница между максимальным и минимальным массивом: " + diff);
    }

    public void task2(int arr[]) {
//        Написать функцию, возвращающую истину,
//        если в переданном массиве есть два соседних элемента, с нулевым значением.
        boolean zeros = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {
                zeros = true;
            }
        }
        System.out.println(zeros);
    }
}
