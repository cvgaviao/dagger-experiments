package module.three;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DieselEngine implements Engine {

    @Inject
    public DieselEngine() {
        super();
    }
    /**
     * The class Logger
     */
    private static final Logger LOG = LoggerFactory
            .getLogger(DieselEngine.class);

    @Override
    public void start() {
        LOG.info("Diesel engine started.");
    }

}
