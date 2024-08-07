package ru.aston.homework.lesson_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pay {
    public WebDriver driver;
    public Pay(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    /**
     * определение локатора поля ввода номера телефона
     */
    @FindBy(xpath = "//*[@id=\"connection-phone\"]")
    private WebElement enterPhoneNumber;
    /**
     *  определение локатора поля ввода суммы пополнения
     */
    @FindBy(xpath = "//*[@id=\"connection-sum\"]")
    private WebElement enterSum;
    /**
     * определение локатора поля ввода email для чека
     */
    @FindBy(xpath = "//*[@id=\"connection-email\"]")
    private WebElement enterEmail;
    /**
     * определение локатора кнопки продолжить
     */
    @FindBy(xpath = "//*[@id=\"pay-connection\"]/button")
    private WebElement buttonСontinue;
    /**
     * метод для ввода ввода номера телефона
     */
    public void inputPhoneNumber(String number) {
        enterPhoneNumber.sendKeys(number); }
    /**
     * метод для ввода суммы пополнения
     */
    public void inputSum(String sum) {
        enterSum.sendKeys(sum); }
    /**
     * метод для ввода суммы пополнения
     */
    public void inputEmail(String email) {
        enterEmail.sendKeys(email); }
    /**
     * метод для осуществления нажатия кнопки продолжить
     */
    public void clickButtonСontinue() {
        buttonСontinue.click(); } }
