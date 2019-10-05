package central;

import module.one.Car;
import module.one.DaggerCarComponent;
import module.three.PetroilEngineModule;
import module.three.PetroilEngineModule2;

public class Startup {

    public static void main(String[] args) {

        // constructors
        startModuleOne();

        // modules
        startModuleTwo();

        // interfaces
        startModuleThree();

        // injecting runtime values using builder
        startModuleEight();
    }

    private static void startModuleEight() {
        module.eight.Car car = module.eight.DaggerCarComponent.builder()
                .horsePower(150).engineCapacity(80).build().createCar();
        car.drive();
    }

    private static void startModuleThree() {
        module.three.Car car = module.three.DaggerCarComponent.create()
                .createCar();
        car.drive();

        module.three.Car car2 = module.three.DaggerCarComponent3.create()
                .createCar();
        car2.drive();

        module.three.Car car3 = module.three.DaggerCarComponent2.builder()
                .petroilEngineModule(new PetroilEngineModule(100)).build()
                .createCar();
        car3.drive();

        module.three.Car car4 = module.three.DaggerCarComponent4.builder()
                .petroilEngineModule2(new PetroilEngineModule2(200)).build()
                .createCar();
        car4.drive();

    }

    private static void startModuleOne() {
        Car car = DaggerCarComponent.create().createCar();
        car.drive();
    }

    private static void startModuleTwo() {
        module.two.Car car = module.two.DaggerCarComponent.create().createCar();
        car.drive();
    }

}
