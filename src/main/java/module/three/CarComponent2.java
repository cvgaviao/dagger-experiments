package module.three;

import dagger.Component;

@Component(modules = { WheelsModule.class, PetroilEngineModule.class })
public interface CarComponent2 {
    Car createCar();
}
