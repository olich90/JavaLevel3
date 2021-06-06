package hw1;

public class Main {
    public static void main(String[] args) {

        //1
        Array<Integer> i = new Array<>(1, 2, 3, 4, 5, 6);
        Array<Float> f = new Array<>(1f, 2f, 3f, 4f, 5f, 6f);
        Array<String> s = new Array<>("q", "w", "e", "r", "t", "y");
        Array<Boolean> b = new Array<>(false, true);
        Array<Character> c = new Array<>('z', 'x');

        System.out.println("swapArrayElementsByPositions");
        i.swapArrayElementsByPositions(0, 5);
        f.swapArrayElementsByPositions(0, 6);
        s.swapArrayElementsByPositions(0, 5);
        b.swapArrayElementsByPositions(0, 1);
        c.swapArrayElementsByPositions(0, 1);

        //2
        System.out.println("\nconvertArrayToArrayList");
        i.convertArrayToArrayList();
        f.convertArrayToArrayList();
        s.convertArrayToArrayList();
        b.convertArrayToArrayList();
        c.convertArrayToArrayList();
    }
}