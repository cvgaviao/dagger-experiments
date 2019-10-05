package module.three;

import dagger.Component;

@Component(modules = { WheelsModule.class, EtanolEngineModule.class })
public interface CarComponent3 {
    Car createCar();
}
