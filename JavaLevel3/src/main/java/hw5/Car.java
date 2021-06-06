package hw5;

import java.util.concurrent.*;

public class Car implements Runnable {
    private static int winnerCount = 0;
    private static int CARS_COUNT;
    static final int threadsCount = MainClass.CARS_COUNT;
    static final CyclicBarrier cyclicBarrier = new CyclicBarrier(threadsCount + 1);

    static {
        CARS_COUNT = 0;
    }

    private final Race race;
    private final int speed;
    private final String name;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(this.name + " готов");
            cyclicBarrier.await();

            for (int i = 0; i < race.getStages().size(); i++) {
                race.getStages().get(i).go(this);
            }

            synchronized (race.getMon()) {
                if (winnerCount++ == 0) {
                    System.out.println(this.name + " - WIN");
                }
            }
            cyclicBarrier.await();

        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}