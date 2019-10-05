package module.three;

import dagger.Module;
import dagger.Provides;

@Module
public class PetroilEngineModule2 {

    int horsePower;
    
    public PetroilEngineModule2(int pHorsePower) {
        super();
        horsePower = pHorsePower;
    }
    

    @Provides
    int provideHorsePower() {
        return horsePower;
    }


    @Provides
    Engine providePetroilEngine2(PetroilEngine2 pPetroilEngine2) {
        return pPetroilEngine2;
    }

}
