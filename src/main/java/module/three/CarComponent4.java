package module.three;

import dagger.Component;

@Component(modules = { WheelsModule.class, PetroilEngineModule2.class })
public interface CarComponent4 {
    Car createCar();
}
