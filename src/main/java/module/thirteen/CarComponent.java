package module.thirteen;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = { WheelsModule.class, PetroilEngineModule.class })
public interface CarComponent {

    Car createCar();

    @Component.Factory
    interface Factory {

        CarComponent carFactory(@BindsInstance @Named("horse power") int horsePower,
                @BindsInstance @Named("engine capacity") int engineCapacity);

    }
}
