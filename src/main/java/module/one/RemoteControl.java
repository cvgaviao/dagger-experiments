package module.one;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RemoteControl {

    /**
     * The class Logger
     */
    private static final Logger LOG = LoggerFactory
            .getLogger(RemoteControl.class);

    @Inject
    public RemoteControl() {
    }

    public void listen(Car pCar) {
        LOG.info("Tracking car -> {}", pCar);
    }

}
