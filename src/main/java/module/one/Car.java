package module.one;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car {

    /**
     * The class Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(Car.class);

    Engine engine;
    Wheels wheels;

    @Inject
    public Car(Engine pEngine, Wheels pWheels) {
        super();
        engine = pEngine;
        wheels = pWheels;
    }

    public void drive() {
        LOG.info("Driving car");
    }

    @Inject
    public void setRemote(RemoteControl pRemoteControl) {
        pRemoteControl.listen(this);
    }
    
}
