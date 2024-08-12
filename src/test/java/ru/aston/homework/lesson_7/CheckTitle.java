package ru.aston.homework.lesson_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckTitle {
    public WebDriver driver;
    public CheckTitle(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    /**
     * определение локатора поля оплаты услуг: услуги связи
     */
    @FindBy(xpath = "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[1]/p")
    public WebElement communicationServices;
    /**
     * метод для проверки надписи услуги связи
     */
    public boolean CommunicationServices() {
        communicationServices.isDisplayed();
        return true;
    } /**
     * определение локатора поля оплаты услуг: домашний интернет
     */
    @FindBy(xpath = "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[2]/p")
    public WebElement homeInternet;
    /**
     * метод для проверки надписи домашний интернет
     */
    public boolean HomeInternet() {
        homeInternet.isDisplayed();
        return true;
    }
    /**
     * определение локатора поля оплаты услуг: рассрочка
     */
    @FindBy(xpath = "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[3]/p")
    public WebElement installment;
    /**
     * метод для проверки надписи рассрочка
     */
    public boolean Installment() {
        installment.isDisplayed();
        return true;
    }
    /**
     * определение локатора поля оплаты услуг: задолженность
     */
    @FindBy(xpath = "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[4]/p")
    public WebElement arrears;
    /**
     * метод для проверки надписи задолженность
     */
    public boolean Arrears() {
        arrears.isDisplayed();
        return true;
    }
  }
