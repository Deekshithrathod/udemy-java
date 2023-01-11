package section12;

class Car {
    public void start() {
        System.out.println("Car Start");
    }

    public void accelerate() {
        System.out.println("Car Accelerate");
    }

    public void changeGear() {
        System.out.println("Car Gear Change");
    }
}

class LuxuryCar extends Car {
    public void changeGear() {
        System.out.println("Luxury Car Gear change");
    }

    public void sunroofOpen() {
        System.out.println("Luxury Car sunroof open");
    }
}


public class Lecture129 {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.start();
//        car.accelerate();
//        car.changeGear();

//        LuxuryCar luxuryCar = new LuxuryCar();
//        luxuryCar.start();
//        luxuryCar.accelerate();
//        luxuryCar.changeGear();
//        luxuryCar.sunroofOpen();

        Car car = new LuxuryCar();
        car.start();
        car.accelerate();
        car.changeGear();
    }
}
