package stepDefinition;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageLayer.ElementPage;
import pageLayer.FormPage;

public class FormsStepDef  extends DriverFactory {
    ElementPage elementPage = new ElementPage(driver);
    FormPage formPage = new FormPage(driver);

    @When("user enters first Name as {string} and lastname as {string}")
    public void user_enters_first_name_as_and_lastname_as(String fName, String lName) {
        formPage.entersFullName(fName, lName);
    }

    @When("select {string} radio btn")
    public void select_radio_btn(String gender) {
       formPage.clickOnRadioBtn(gender);
    }

    @When("enters mobile Number {string}")
    public void enters_mobile_number(String mobile) {
        formPage.enterMobileNumber(mobile);
    }

    @When("enters subject {string}")
    public void enters_subject(String subject) {
        formPage.entersSubject(subject);

    }

    @When("select hobbies {string}")
    public void select_hobbies(String hobbies) {
        formPage.hobbies(hobbies);

    }

    @When("user clicks on  Practice Form")
    public void userClicksOnPracticeForm() {
        formPage.clickOnPracticeFormPage();
    }
}
