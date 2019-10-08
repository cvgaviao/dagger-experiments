package module.ten;

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
    private Driver driver;

    @Inject
    public Car(Driver pDriver, Engine pEngine, Wheels pWheels) {
        super();
        engine = pEngine;
        wheels = pWheels;
        driver = pDriver;
    }

    public void drive() {

        engine.start();

        LOG.info("Driver {} is driving car {}", driver, this);
    }

}
