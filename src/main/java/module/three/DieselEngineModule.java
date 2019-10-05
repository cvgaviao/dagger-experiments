package module.three;

import dagger.Binds;
import dagger.Module;

@Module
public interface DieselEngineModule {

    @Binds
    Engine bindEngine(DieselEngine pDieselEngine);
}
