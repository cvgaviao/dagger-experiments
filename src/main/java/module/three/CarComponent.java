package module.three;

import dagger.Component;

@Component(modules = { WheelsModule.class, DieselEngineModule.class })
public interface CarComponent {
    Car createCar();
}
