package com.example.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends com.example.selenium.pages.BasePage {

    // TODO define title and logout WebElements using @FindBy
    private By title = By.cssSelector("h2");
    private By logout = By.linkText("Logout");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        // TODO return title text
        return driver.findElement(title).getText();
    }

    public MainPage clickLogout() {
        // TODO click logout and return MainPage
        driver.findElement(logout).click();
        return new MainPage(driver);
    }
}
