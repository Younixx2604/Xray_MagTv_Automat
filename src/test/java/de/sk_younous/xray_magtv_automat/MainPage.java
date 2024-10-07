package de.sk_younous.xray_magtv_automat;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

// page_url = https://www.jetbrains.com/
public class MainPage {
  public SelenideElement loginButton= $(By.id("MENU-LOGIN"));
  public SelenideElement cookiesAkzeptieren= $(By.id("OVERLAY-ACCEPT"));
}
