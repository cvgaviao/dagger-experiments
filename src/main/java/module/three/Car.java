package module.three;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car {

    /**
     * The class Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(Car.class);

    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine pEngine, Wheels pWheels) {
        super();
        engine = pEngine;
        wheels = pWheels;
    }

    public void drive() {
        
        engine.start();
        
        LOG.info("Driving car");
    }

}
