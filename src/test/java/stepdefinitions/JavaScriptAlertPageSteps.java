package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.JavaScriptAlertsPage;

import static io.qameta.allure.Allure.step;

public class JavaScriptAlertPageSteps {
    JavaScriptAlertsPage javaScriptAlertsPage = new JavaScriptAlertsPage();

    @When("I generate JS alert on the Javascript Alert Page")
    public void generateJSAlert(){
        step("Generate JS alert on the Javascript Alert Page");
        javaScriptAlertsPage.clickForJsAlertBtn();
    }

    @Then("Success message is displayed on JavaScript Alert Page")
    public void acceptAlert(){
        step("Success message is displayed on the JavaScript Alert Page");
        Assert.assertTrue(javaScriptAlertsPage.isSuccessLabelDisplayed(),"Success msg is not displayed");
    }
}
