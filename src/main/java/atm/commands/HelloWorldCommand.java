package atm.commands;

import java.util.List;

import javax.inject.Inject;

import atm.Command;

public class HelloWorldCommand implements Command {

    @Inject
    public HelloWorldCommand() {
        super();
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
        System.out.println("world!");
        return Status.HANDLED;
    }
}

