package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.WikipediaArticlePage;
import pages.WikipediaMainPage;

import static io.qameta.allure.Allure.step;

public class WikipediaDownloadSteps {
    WikipediaMainPage wikipediaMainPage = new WikipediaMainPage();
    WikipediaArticlePage wikipediaArticlePage = new WikipediaArticlePage();
    @Given("The main page is displayed")
    public void mainPageIsDisplayed(){
        step("Page is displayed");
        Assert.assertTrue(wikipediaMainPage.state().isDisplayed());
    }
    @Then("I input {string} in the search field")
    public void setTextInput(String name){
        step("Input" + name + " into search field");
        wikipediaMainPage.inputText(name);
    }
    @Given("I click the search Button")
    @Then("I click the submit Button")
    public void clickSubmitBtn(){
        step("Click Submit Button");
        wikipediaMainPage.clickSubmit();
    }
    @And("I click the Tool Menu Button")
    public void clickToolBtn(){
        step("Click Tool Menu Button");
        wikipediaArticlePage.clickToolButton();
    }
    @When("I click the Download as PDF Button")
    public void clickDownloadPDFBtn(){
        step("Click Download as PDF Button");
        wikipediaArticlePage.clickDownloadPDFButton();
    }
    @Then("I click the Download button")
    public void clickDownloadBtn(){
        step("Click Download Button");
        wikipediaArticlePage.clickDownloadButton();
    }
    @And("The file was downloaded")
    public void fileIsExist(){
        step("File was downloaded");
        wikipediaMainPage.fileIsDownloaded();
    }
    @When("I click the Page Information")
    public void clickPageInfoBtn(){
        step("Click Page Information Button");
        wikipediaArticlePage.clickPageInfoButton();
    }
    @Given("I click the language button")
    public void clickLanguageBtn(){
        step("Click Language Button");
        wikipediaMainPage.clickLanguageButton();
    }
    @And("I change the language to Spanish")
    public void clickLanguageChange() {
        step("Change Language");
        wikipediaMainPage.clickEspButton();
    }
    @Then("The page for {string} is displayed")
    public void pageIsDisplayed(String name){
        step(name + " page is displayed correctly.");
        Assert.assertTrue(wikipediaMainPage.state().isDisplayed());
    }
}
