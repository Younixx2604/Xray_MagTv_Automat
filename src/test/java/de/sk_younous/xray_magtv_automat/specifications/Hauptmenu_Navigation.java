package de.sk_younous.xray_magtv_automat.specifications;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertEquals;

public class Hauptmenu_Navigation {


    @Given("die Homepage {string} ist geöffnet")
    public void die_magenta_tv_homepage_ist_geöffnet(String string) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        options.addArguments("--start-maximized");
        //options.addArguments("--headless");
        //Configuration.browser = "chrome";
        Configuration.browserCapabilities = options;

        open(string);
    }

    @Given("Coockies schliesst")
    public void man_den_coockies_banner_schliesst() throws InterruptedException {
        Thread.sleep(5000);
        $(By.id("OVERLAY-ACCEPT")).shouldBe(Condition.visible).click();
    }

    @When("man klickt {string} - Navigationselement an")
    public void man_auf_klickt_kids_an(String string) {
        $(By.id("MENU-TEXT-7")).click();
    }
    @Then("{string} wird geöffnet")
    public void Kids_wird_geöffnet(String string) throws InterruptedException {
        String actulesURL =  WebDriverRunner.getWebDriver().getCurrentUrl();
        assertEquals(string,actulesURL);
        Thread.sleep(5000);
        closeWebDriver();
    }

    @When("man Sport {string} clickt")
    public void man_sport_klickt_an(String string) {
        $(By.id("MENU-TEXT-6")).click();
    }

    @Then("{string} Sport Seite wird geöffnet")
    public void sport_wird_geöffnet(String string) throws InterruptedException {
        String actulesURL =  WebDriverRunner.getWebDriver().getCurrentUrl();
        assertEquals(string,actulesURL);
        Thread.sleep(5000);
        closeWebDriver();
    }

    @When("man Film Navigationselement {string} klickt")
    public void man_auf_klickt_an(String string) {
        $(By.id("MENU-TEXT-4")).click();
    }
    @Then("Film Seite {string} wird geöffnet")
    public void Film_wird_geöffnet(String string) throws InterruptedException {
        String actulesURL =  WebDriverRunner.getWebDriver().getCurrentUrl();
        assertEquals(string,actulesURL);
        Thread.sleep(5000);
        closeWebDriver();
    }


}

