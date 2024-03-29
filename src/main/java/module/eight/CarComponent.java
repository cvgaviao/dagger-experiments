package module.eight;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = { WheelsModule.class, PetroilEngineModule.class })
public interface CarComponent {

    Car createCar();

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);
 
        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);
 
        CarComponent build();
    }
}
