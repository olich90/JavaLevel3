package hw5;

import java.util.concurrent.BrokenBarrierException;

public class MainClass {
    public static final int CARS_COUNT = 4;

    public static void main(String[] args){
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
        }
        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }

        try{
            while (Car.cyclicBarrier.getNumberWaiting() != CARS_COUNT){
                Thread.sleep(200);
            }

            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
            Car.cyclicBarrier.await();

            while (Car.cyclicBarrier.getNumberWaiting() != Car.threadsCount){
                Thread.sleep(200);
            }
            Car.cyclicBarrier.await();
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
        } catch (BrokenBarrierException | InterruptedException e){
            e.printStackTrace();
        }
    }
}