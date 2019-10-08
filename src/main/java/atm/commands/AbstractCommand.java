package atm.commands;

import atm.Outputter;

public abstract class AbstractCommand {

    private final Outputter outputter;

    public AbstractCommand(Outputter pOutputter) {
        outputter = pOutputter;
    }

    public Outputter getOutputter() {
        return outputter;
    }

}
