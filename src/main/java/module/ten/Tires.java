package module.ten;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tires {

    /**
    * The class Logger
    */
    private static final Logger LOG = LoggerFactory.getLogger(Tires.class);

    public Tires() {
        // we don't own this class, so we can't annotate it with @Inject.
    }

    public void inflates() {
        LOG.info("Inflating tires...");
    }
}
