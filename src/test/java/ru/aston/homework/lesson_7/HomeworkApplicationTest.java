package ru.aston.homework.lesson_7;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
class HomeworkApplicationTest {
        @Test
   public void main() {
         System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.mts.by/");
         CheckTitle checkTitle = new CheckTitle(driver);
            //проверка надписи услуги связи
            checkTitle.CommunicationServices();
            //проверко надписи домашний интернет
            checkTitle.HomeInternet();
            //проверка надписи рассрочка
            checkTitle.Installment();
            //проверка надписи задолженность
            checkTitle.Arrears();

        // "Заполнить поля и проверить работу кнопки «Продолжить»"
        Pay pay = new Pay(driver);
        pay.inputPhoneNumber("297777777");
        pay.inputSum("10");
        pay.inputEmail("derevyanko.d.e@yandex.ru");
        pay.clickButtonСontinue();

            CheckPay checkPay = new CheckPay(driver);
            checkPay.checkLogoPay();
            checkPay.cardNumber();
            checkPay.validityPeriod();
            checkPay.cvcNumber();
            checkPay.cardName();
            ExpectedConditions.textToBePresentInElement(checkPay.checkSum, "10.00 BYN");
            ExpectedConditions.textToBePresentInElement(checkPay.checkPhoneNumber, "Оплата: Услуги связи Номер:375297777777");


    }
}