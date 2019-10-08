package module.ten;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
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
