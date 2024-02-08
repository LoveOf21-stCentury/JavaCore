package seminar2;

public class Methods {
    //    Задача: Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
    //    заполнить его диагональные элементы единицами, используя цикл(ы)
    public void test0() {
        int arr[][] = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean test1(int[] array) {
//        Задача: Написать метод, в который передается не пустой одномерный целочисленный массив,
//        метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части
//        массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true,
//        checkBalance([2, 1, 1, 2, 1]) → false,
//        checkBalance([10, || 1, 2, 3, 4]) → true.
//        Абстрактная граница показана символами ||, эти символы в массив не входят.

        int leftSum = array[0];
        int rightSum = 0;
        for (int i = 1; i < array.length; i++) {
            rightSum += array[i];
        }
        if (leftSum == rightSum) return true;
        for (int i = 1; i < array.length; i++) {
            leftSum += array[i];
            rightSum -= array[i];
            if (leftSum == rightSum) return true;
        }
        return false;
    }

    public void tic_tac_toe(){

    }
}
