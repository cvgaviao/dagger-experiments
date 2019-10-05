package module.three;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModule {

    // note that static here will bring performance since those method do not
    // depends of any instance state of module

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflates();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Tires pTires, Rims pRims) {
        return new Wheels(pRims, pTires);
    }
}
