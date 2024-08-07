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
     * определение локатора логотипов платёжных систем
     */
    @FindBy(xpath = "//*[@id=\"pay-section\"]/div/div/div[2]/section/div")
    public WebElement findBlock;
    /**
     * метод для осуществления нажатия кнопки продолжить
     */
    public boolean Block() {
        findBlock.isDisplayed();
        return true;
    }
}
