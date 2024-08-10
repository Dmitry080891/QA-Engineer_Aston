package ru.aston.homework.lesson_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindBlock {
    public WebDriver driver;
    public FindBlock(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    /**
     * определение локатора названия блока Онлайн пополнение без комисии
     */
    @FindBy(xpath = "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2")
    public WebElement findBlock;
    /**
     * метод для осуществления присутствия названия блока
     */
    public boolean Block() {
        findBlock.isDisplayed();
        return true;
    }
}
