package hw1;

import java.util.Arrays;
import java.util.ArrayList;

public class Array<Type> {
    Type[] array;

    public Array(Type... array) {
        this.array = array;
    }

    //1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
    public void swapArrayElementsByPositions(int position1, int position2) {
        try {
            Type temp = array[position1];
            array[position1] = array[position2];
            array[position2] = temp;
            System.out.println(Arrays.toString(array));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of range, try again!");
        }
    }

    //2. Написать метод, который преобразует массив в ArrayList;
    public void convertArrayToArrayList() {
        ArrayList<Type> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println(arrayList);
    }
}
