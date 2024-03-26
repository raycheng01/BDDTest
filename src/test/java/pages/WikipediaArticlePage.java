package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ICheckBox;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class WikipediaArticlePage extends Form {
    private static final String NAME = "Wikipedia";
    private IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final By TOOLS_MENU = By.xpath("//*[@id='vector-page-tools-dropdown']");
    private final By DOWNLOAD_PDF_BUTTON = By.xpath("//*[@id='coll-download-as-rl']");
    private final By PAGE_INFO_BUTTON = By.xpath("//*[@id='t-info']");
    private final By DOWNLOAD_BUTTON = By.xpath("//*[@type='submit']");
    private ICheckBox toolButton = elementFactory.getCheckBox(TOOLS_MENU,"Tools Button");
    private ILabel downloadPdfButton = elementFactory.getLabel(DOWNLOAD_PDF_BUTTON,"Download PDF Button");
    private IButton downloadButton = elementFactory.getButton(DOWNLOAD_BUTTON,"Download Button");
    private IButton pageInfoButton = elementFactory.getButton(PAGE_INFO_BUTTON,"Page Information Button");

    public WikipediaArticlePage(){
        super(By.xpath(String.format(LocatorConstants.PARTICULAR_TEXT_XPATH, NAME)), NAME);
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
    public void clickPageInfoButton(){
        pageInfoButton.click();
    }

}
