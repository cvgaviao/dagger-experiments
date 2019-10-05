package central;

import module.one.Car;
import module.one.DaggerCarComponent;
import module.three.PetroilEngineModule;

public class Startup {

    public static void main(String[] args) {

        // constructors
        startModuleOne();

        // modules
        startModuleTwo();

        // interfaces
        startModuleThree();

    }

    private static void startModuleThree() {
        module.three.Car car = module.three.DaggerCarComponent.create()
                .createCar();
        car.drive();

        module.three.Car car2 = module.three.DaggerCarComponent3.create()
                .createCar();
        car2.drive();

        module.three.Car car3 = module.three.DaggerCarComponent2.builder()
                .petroilEngineModule(new PetroilEngineModule(100)).build().createCar();
        car3.drive();
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
