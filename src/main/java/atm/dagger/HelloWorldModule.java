package atm.dagger;

import atm.Command;
import atm.commands.HelloWorldCommand;
import dagger.Binds;
import dagger.Module;

@Module
public interface HelloWorldModule {

    @Binds
    Command helloWorldCommand(HelloWorldCommand pHelloWorldCommand);
}
