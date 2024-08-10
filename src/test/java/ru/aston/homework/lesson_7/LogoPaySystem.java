package ru.aston.homework.lesson_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoPaySystem {
    public WebDriver driver;
    public LogoPaySystem(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    /**
     * определение локатора логотипов платёжных систем
     */
    @FindBy(xpath = "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[1]/img")
    public WebElement logoPaySystem;
    /**
     * метод для осуществления нажатия кнопки продолжить
     */
    public boolean logoPay() {
        logoPaySystem.isDisplayed();
        return true;
    }
}
