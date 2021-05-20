package hw1.Fruits;

public class Main {
    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>(new Apple(), new Apple());
        Box<Orange> orangeBox = new Box<>(new Orange());

        Box<Apple> appleBox2 = new Box<>(new Apple(), new Apple(), new Apple(), new Apple());

        appleBox.put(new Apple());
        orangeBox.put(new Orange());

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));

        System.out.println(appleBox2.getWeight());
        appleBox.transfer(appleBox2);
        System.out.println(appleBox2.getWeight());
        System.out.println(appleBox.getWeight());
    }
}