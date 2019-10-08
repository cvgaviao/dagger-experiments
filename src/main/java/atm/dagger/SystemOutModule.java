package atm.dagger;

import atm.Outputter;
import dagger.Module;
import dagger.Provides;

@Module
public interface SystemOutModule {

    @Provides
    static Outputter textOutputter() {
        return System.out::println;
    }
}
