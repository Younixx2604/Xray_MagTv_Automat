package de.sk_younous.xray_magtv_automat.specifications;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertTrue;

public class Homepage_oeffnen_SCRUM_13 {

    @Given("der Benutzer hat einen Webbrowser geöffnet")
    public void der_benutzer_hat_einen_webbrowser_geöffnet() {


        ChromeOptions options = new ChromeOptions();    // Optionen hinzufügen, um das Suchmaschinen-Pop-up zu umgehen
        options.addArguments("--disable-search-engine-choice-screen");
        options.addArguments("--start-maximized"); //options.addArguments("--headless");
        //Configuration.browser = "chrome";
        Configuration.browserCapabilities = options;
        //Configuration.browserSize = "1480x800";
        WebDriverRunner.setWebDriver(new ChromeDriver(options));

        open("about:blank");

    }
    @When("der Benutzer die Magenta TV {string} öffnet")
    public void der_benutzer_die_magenta_tv_öffnet(String string) {
          open(string);
    }

    @Then("der URL der göffnete Seite sollte {string} enthalten")
    public void der_url_der_göffnete_seite_sollte_enthalten(String string) throws InterruptedException {


        String actulesURL =  WebDriverRunner.getWebDriver().getCurrentUrl();
        assertTrue(actulesURL.contains(string));

        Thread.sleep(3000);

        closeWebDriver();


    }
}
