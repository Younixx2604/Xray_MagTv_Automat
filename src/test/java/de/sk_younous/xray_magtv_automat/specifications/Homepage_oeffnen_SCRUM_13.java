package de.sk_younous.xray_magtv_automat.specifications;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertTrue;

public class Homepage_oeffnen_SCRUM_13 {

    @Given("der Benutzer hat einen Webbrowser geöffnet")
    public void der_benutzer_hat_einen_webbrowser_geöffnet() {


        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--start-maximized");
        Configuration.browserCapabilities = firefoxOptions;
        Configuration.browser = "firefox";
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
