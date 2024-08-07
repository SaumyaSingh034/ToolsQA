package stepDefinition;

import factory.DriverFactory;
import io.cucumber.java.Before;

public class Hooks {

    DriverFactory factory;
    @Before
    public void setUp(){
        factory = new DriverFactory();
        factory.initializeDriver("chrome");
    }
}
