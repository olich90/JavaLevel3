package hw1.Fruits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit>{
    List<T> fruits;

    public Box(T... fruits) { this.fruits = new ArrayList<>(Arrays.asList(fruits));}

    public void put(T fruit) {
        this.fruits.add(fruit);
    }

    public float getWeight() {
        float sum = 0.0f;
        if (this.fruits.size() == 0) return sum;

        if (fruits.get(0).getWeight() == 1.0f) sum = fruits.size() * 1.0f;
        else sum = fruits.size() * 1.5f;
        return sum;
    }

    public boolean compare(Box<?> another) {
        return Math.abs(getWeight() - another.getWeight())< 0.0001;
    }

    public void transfer(Box<T> another) {
        another.getFruits().addAll(fruits);
        fruits.clear();
    }

    public List<T> getFruits() {
        return fruits;
    }
}