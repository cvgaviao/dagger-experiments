package atm.commands;

import java.util.List;

import javax.inject.Inject;

import atm.Command;
import atm.Outputter;

public class HelloWorldCommand extends AbstractCommand implements Command {

    @Inject
    public HelloWorldCommand(Outputter pOutputter) {
        super(pOutputter);
    }

    @Override
    public String key() {
        return "hello";
    }

    @Override
    public Status handleInput(List<String> pInput) {
        if (!pInput.isEmpty()) {
            return Status.INVALID;
        }
        getOutputter().output("world!");
        return Status.HANDLED;
    }
}
