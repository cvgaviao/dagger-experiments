package module.two;

import dagger.Component;

@Component(modules = {WheelsModule.class})
public interface CarComponent {
    Car createCar();
}
