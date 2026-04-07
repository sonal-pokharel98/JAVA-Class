class Car {
    void fuelType() {
        System.out.println("Car uses fuel");
    }
}

class PetrolCar extends Car {
    @Override
    void fuelType() {
        System.out.println("Petrol car uses petrol");
    }
}

class ElectricCar extends Car {
    @Override
    void fuelType() {
        System.out.println("Electric car uses electricity");
    }
}

public class TestCar {
    public static void main(String[] args) {

        Car c1 = new PetrolCar();
        Car c2 = new ElectricCar();

        c1.fuelType();
        c2.fuelType();
    }
}