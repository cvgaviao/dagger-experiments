package module.three;

import dagger.Module;
import dagger.Provides;

@Module
public class PetroilEngineModule {

    int horsePower;
    
    public PetroilEngineModule(int pHorsePower) {
        super();
        horsePower = pHorsePower;
    }

    @Provides
    Engine providePetroilEngine() {
        return new PetroilEngine(horsePower);
    }

}
