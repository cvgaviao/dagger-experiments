package atm.dagger;

import atm.CommandRouter;
import dagger.Component;

@Component
public interface CommandRouterFactory {
    
    CommandRouter router();
}
