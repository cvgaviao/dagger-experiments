package module.three;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PetroilEngine implements Engine {

    int horsePower;

    public PetroilEngine(int pHorsePower) {
        horsePower = pHorsePower;
    }

    /**
     * The class Logger
     */
    private static final Logger LOG = LoggerFactory
            .getLogger(PetroilEngine.class);

    @Override
    public void start() {
        LOG.info("Petroil engine started with horse power: {}", horsePower);
    }

}
