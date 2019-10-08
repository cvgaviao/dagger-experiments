package atm.dagger;

import atm.CommandRouter;
import dagger.Component;

@Component(modules = HelloWorldModule.class)
public interface CommandRouterFactory {
    
    CommandRouter router();
}
