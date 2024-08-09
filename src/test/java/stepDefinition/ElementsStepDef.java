package stepDefinition;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import pageLayer.ElementPage;

public class ElementsStepDef extends DriverFactory {
    ElementPage elementPage;


    @And("user gets the heading of the page")
    public void userGetsTheHeadingOfThePage() {

    }
}
