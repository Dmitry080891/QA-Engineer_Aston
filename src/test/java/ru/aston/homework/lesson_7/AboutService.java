package ru.aston.homework.lesson_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutService {
    public WebDriver driver;
    public AboutService(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    /**
     * определение локатора кнопки подробнее о сервисе
     */
    @FindBy(xpath = "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a")
    private WebElement buttonService;
    /**
     * метод для осуществления нажатия кнопки продолжить
     */
    public void clickButtonService() {
        buttonService.click(); }

}
