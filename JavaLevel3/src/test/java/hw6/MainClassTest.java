package hw6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainClassTest {

    @Test
    void checkArray() {
        Integer[] arrayTest1 = {2, 3, 5, 7, 8, 9};
        assertFalse(MainClass.checkArray(arrayTest1));
        Integer[] arrayTest2 = {2, 3, 5, 7, 8, 9, 1};
        Assertions.assertThrows(RuntimeException.class, () -> MainClass.checkArray(arrayTest2));
        Integer[] arrayTest3 = {2, 3, 5, 7, 8, 9, 4, 1, 4, 4, 1};
        Assertions.assertThrows(RuntimeException.class, () -> MainClass.checkArray(arrayTest3));
        Integer[] arrayTest4 = {4, 1, 4, 4, 1};
        assertTrue(MainClass.checkArray(arrayTest4));
        Integer[] arrayTest5 = {4, 4, 4, 4, 4};
        assertTrue(MainClass.checkArray(arrayTest5));
        Integer[] arrayTest6 = {1, 1, 1, 1, 1, 1};
        assertTrue(MainClass.checkArray(arrayTest6));
    }

    @Test
    void getNewArray() {
        Integer[] arrayTest1 = {};
        Assertions.assertThrows(RuntimeException.class, () -> MainClass.getNewArray(arrayTest1));
        Integer[] arrayTest2 = {1, 2, 3, 5, 6, 7, 8};
        Assertions.assertThrows(RuntimeException.class, () -> MainClass.getNewArray(arrayTest2));
        Integer[] arrayTest3 = {1, 2, 4, 5, 6, 7, 8};
        Assertions.assertArrayEquals(new Integer[]{5, 6, 7, 8}, MainClass.getNewArray(arrayTest3));
        Integer[] arrayTest4 = {1, 2, 3, 4, 5, 4, 6, 4, 1, 7, 8, 9};
        Assertions.assertArrayEquals(new Integer[]{1, 7, 8, 9}, MainClass.getNewArray(arrayTest4));
    }
}