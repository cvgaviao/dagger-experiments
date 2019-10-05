package module.three;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EtanolEngine implements Engine {

    @Inject
    public EtanolEngine() {
        super();
    }
    /**
    * The class Logger
    */
    private static final Logger LOG = LoggerFactory
            .getLogger(EtanolEngine.class);

    @Override
    public void start() {
        LOG.info("Etanol engine started");
    }

}
