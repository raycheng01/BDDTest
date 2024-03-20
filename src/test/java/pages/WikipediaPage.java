package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.*;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import org.testcontainers.shaded.org.yaml.snakeyaml.events.Event;
import utils.FileUtil;

import java.io.File;

public class WikipediaPage extends Form {
    private static final String NAME = "Wikipedia";

    private IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final By SEARCH_FIELD = By.xpath("//*[@id='searchInput']");
    private final By SEARCH_BUTTON = By.xpath("//*[@class='sprite svg-search-icon']");
    private final By TOOLS_MENU = By.xpath("//*[@id='vector-page-tools-dropdown']");
    private final By DOWNLOAD_PDF_BUTTON = By.xpath("//*[@id='coll-download-as-rl']");
    private final By PAGE_INFO_BUTTON = By.xpath("//*[@id='t-info']");
    private final By DOWNLOAD_BUTTON = By.xpath("//*[@type='submit']");
    private final By LANGUAGE_BUTTON = By.xpath("//*[@class='hide-arrow']");
    private final By ESP_LABEL = By.xpath("//option[text()='Español']");
    private ITextBox searchField = elementFactory.getTextBox(SEARCH_FIELD,"Search Field");
    private IButton searchButton = elementFactory.getButton(SEARCH_BUTTON,"Search Button");
    private ICheckBox toolButton = elementFactory.getCheckBox(TOOLS_MENU,"Tools Button");
    private ILabel downloadPdfButton = elementFactory.getLabel(DOWNLOAD_PDF_BUTTON,"Download PDF Button");
    private IButton downloadButton = elementFactory.getButton(DOWNLOAD_BUTTON,"Download Button");
    private IButton pageInfoButton = elementFactory.getButton(PAGE_INFO_BUTTON,"Page Information Button");
    private IButton languageButton = elementFactory.getButton(LANGUAGE_BUTTON,"Language Button");
    private ILabel espLabel = elementFactory.getLabel(ESP_LABEL,"Español Label");
    private final String SEARCH_NAME = "ALBERT EINSTEIN";
    private final String FILE_NAME = "Albert_Einstein.pdf";
    private final String RELATIVE_RESOURCE_PATH = "./Downloads/";
    private final String FILE_PATH = RELATIVE_RESOURCE_PATH + FILE_NAME;
    private final File downloadedFile = new File((FILE_PATH));
    public WikipediaPage(){
        super(By.xpath(String.format(LocatorConstants.PARTICULAR_TEXT_XPATH, NAME)), NAME);
    }
    public void inputText(String string){
        searchField.sendKeys(SEARCH_NAME);
    }
    public void clickSubmit(){
        searchButton.click();
    }
    public void clickToolButton(){
        toolButton.click();
    }
    public void clickDownloadPDFButton(){
        downloadPdfButton.click();
    }
    public void clickDownloadButton(){
        downloadButton.click();
    }
    public boolean fileIsDownloaded(){
        return FileUtil.isFileExist(downloadedFile);
    }
    public void clickPageInfoButton(){
        pageInfoButton.click();
    }
    public void clickLanguageButton(){
        languageButton.click();
    }
    public void clickEspButton(){
        espLabel.click();
    }
}
