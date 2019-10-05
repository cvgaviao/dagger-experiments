package module.three;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class EtanolEngineModule {

    @Binds
    abstract Engine bindEngine(EtanolEngine pEtanolEngine);
}
