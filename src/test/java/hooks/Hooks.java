package hooks;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import com.beust.ah.A;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.SettingsTestData;

import static io.qameta.allure.Allure.step;

public class Hooks {
    private Browser browser = AqualityServices.getBrowser();

    @Before()
    public void setup(){

        browser = AqualityServices.getBrowser();
        browser.maximize();
        browser.goTo(SettingsTestData.getEnvData().getHost());
    }

    @After()
    public void teardown(){
        browser.quit();
    }
}
