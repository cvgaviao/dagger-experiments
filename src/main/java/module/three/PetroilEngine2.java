package module.three;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PetroilEngine2 implements Engine {

    int horsePower;

    @Inject
    public PetroilEngine2(int pHorsePower) {
        horsePower = pHorsePower;
    }

    /**
     * The class Logger
     */
    private static final Logger LOG = LoggerFactory
            .getLogger(PetroilEngine2.class);

    @Override
    public void start() {
        LOG.info("Petroil engine started with horse power: {}", horsePower);
    }

}
