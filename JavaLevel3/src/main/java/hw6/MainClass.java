package hw6;

import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        // 2. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
        // Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов,
        // идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку, иначе в методе
        // необходимо выбросить RuntimeException. Написать набор тестов для этого метода (по 3-4 варианта входных данных).
        // Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
        Integer[] oldArray = {1, 2, 3, 4, 5, 4, 6, 4, 1, 7, 8, 9};
        try {
            System.out.println(Arrays.toString(getNewArray(oldArray)));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // 3. Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или
        // единицы, то метод вернет false; Если в массиве есть числа отличные от 1 и 4, то метод выбрасывает
        // RuntimeException; Написать набор тестов для этого метода (по 3-4 варианта входных данных).
        Integer[] array = {2, 3, 5, 7, 8, 9, 4};
        try {
            System.out.println(checkArray(array));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean checkArray(Integer[] array) {
        ArrayList<Integer> arrayList = new ArrayList(Arrays.asList(array));

        if (!arrayList.contains(1) && !arrayList.contains(4)) return false;

        for (int i = 0; i < array.length; i++) {
            if (arrayList.get(i) != 1 && arrayList.get(i) != 4)
                throw new RuntimeException("The array contains something different from 1 and 4!");
        }
        return true;
    }

    public static Integer[] getNewArray(Integer[] oldArray) {
        ArrayList<Integer> arrayList = new ArrayList(Arrays.asList(oldArray));

        int lastIndexOf4 = arrayList.lastIndexOf(4);

        if (arrayList.isEmpty()) throw new RuntimeException("The array is empty!");

        if (lastIndexOf4 == -1) throw new RuntimeException("The array not contains element 4!");

        arrayList.subList(0, lastIndexOf4 + 1).clear();

        return arrayList.toArray(new Integer[0]);
    }
}
