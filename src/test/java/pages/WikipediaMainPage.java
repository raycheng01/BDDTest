package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.*;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import utils.FileUtil;
import utils.SettingsTestData;

import java.io.File;

public class WikipediaMainPage extends Form {
    private static final String NAME = "Wikipedia";

    private IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final By SEARCH_FIELD = By.xpath("//*[@id='searchInput']");
    private final By SEARCH_BUTTON = By.xpath("//*[@class='sprite svg-search-icon']");

    private final By LANGUAGE_BUTTON = By.xpath("//*[@class='hide-arrow']");
    private final By ESP_LABEL = By.xpath("//option[text()='Español']");
    private ITextBox searchField = elementFactory.getTextBox(SEARCH_FIELD,"Search Field");
    private IButton searchButton = elementFactory.getButton(SEARCH_BUTTON,"Search Button");

    private IButton languageButton = elementFactory.getButton(LANGUAGE_BUTTON,"Language Button");
    private ILabel espLabel = elementFactory.getLabel(ESP_LABEL,"Español Label");
    private final String FILE_NAME = "Albert_Einstein.pdf";
    private final String RELATIVE_RESOURCE_PATH = "./Downloads/";
    private final String FILE_PATH = RELATIVE_RESOURCE_PATH + FILE_NAME;
    private final File downloadedFile = new File((FILE_PATH));
    public WikipediaMainPage(){
        super(By.xpath(String.format(LocatorConstants.PARTICULAR_TEXT_XPATH, NAME)), NAME);
    }
    public void inputText(String text){
        searchField.sendKeys(text);
    }
    public void clickSubmit(){
        searchButton.click();
    }

    public boolean fileIsDownloaded(){
        return FileUtil.isFileExist(downloadedFile);
    }

    public void clickLanguageButton(){
        languageButton.click();
    }
    public void clickEspButton(){
        espLabel.click();
    }
}
