package module.one;

import dagger.Component;

@Component
public interface CarComponent {
    Car createCar();
}
