package module.thirteen;

import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PetroilEngine implements Engine {

    private int horsePower;
    private int engineCapacity;

    @Inject
    public PetroilEngine(@Named("horse power") int pHorsePower,
            @Named("engine capacity") int pEngineCapacity) {
        horsePower = pHorsePower;
        engineCapacity = pEngineCapacity;
    }

    /**
     * The class Logger
     */
    private static final Logger LOG = LoggerFactory
            .getLogger(PetroilEngine.class);

    @Override
    public void start() {
        LOG.info(
                "Petroil engine started with horse power: {}, Engine capacity:{}",
                horsePower, engineCapacity);
    }

}
