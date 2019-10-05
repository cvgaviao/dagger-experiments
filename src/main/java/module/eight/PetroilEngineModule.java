package module.eight;

import dagger.Binds;
import dagger.Module;

@Module
public interface PetroilEngineModule {

    @Binds
    abstract Engine bindEngine(PetroilEngine engine);
}
