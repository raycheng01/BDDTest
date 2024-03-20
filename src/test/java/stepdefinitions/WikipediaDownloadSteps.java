package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.WikipediaPage;

import static io.qameta.allure.Allure.step;

public class WikipediaDownloadSteps {
    WikipediaPage wikipediaPage = new WikipediaPage();
    @Given("The main page is displayed")
    @And("The page is displayed")
    @Then("the page is displayed")
    public void pageIsDisplayed(){
        step("Page is displayed");
        Assert.assertTrue(wikipediaPage.state().isDisplayed());
    }
    @And("I input {string} in the search field")
    public void setTextInput(String name){
        step("Input string into search field");
        wikipediaPage.inputText(name);
    }
    @And("I click the submit Button")
    public void clickSubmitBtn(){
        step("Click Submit Button");
        wikipediaPage.clickSubmit();
    }
    @And("I click the Tool Menu Button")
    public void clickToolBtn(){
        step("Click Tool Menu Button");
        wikipediaPage.clickToolButton();
    }
    @When("I click the Download as PDF Button")
    public void clickDownloadPDFBtn(){
        step("Click Download as PDF Button");
        wikipediaPage.clickDownloadPDFButton();
    }
    @Then("I click the Download button")
    public void clickDownloadBtn(){
        step("Click Download Button");
        wikipediaPage.clickDownloadButton();
    }
    @And("The file was downloaded")
    public void fileIsExist(){
        step("File was downloaded");
        wikipediaPage.fileIsDownloaded();
    }
    @When("I click the Page Information")
    public void clickPageInfoBtn(){
        step("Click Page Information Button");
        wikipediaPage.clickPageInfoButton();
    }
    @When("I click the language button")
    public void clickLanguageBtn(){
        step("Click Language Button");
        wikipediaPage.clickLanguageButton();
    }
    @And("I change the language")
    public void clickLanguageChange() {
        step("Change Language");
        wikipediaPage.clickEspButton();
    }
}
