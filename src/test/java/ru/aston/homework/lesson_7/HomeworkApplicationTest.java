package ru.aston.homework.lesson_7;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class HomeworkApplicationTest {
        @Test
   public void main() {
         System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.mts.by/");
              //"Проверить название указанного блока"
       FindBlock findBlock = new FindBlock(driver);
       findBlock.Block();
              // "Проверить наличие логотипов платёжных систем"
        LogoPaySystem logoPaySystem = new LogoPaySystem(driver);
        logoPaySystem.logoPay();
             //"Проверить работу ссылки «Подробнее о сервисе»"
        AboutService aboutService = new AboutService(driver);
        aboutService.clickButtonService();
             // "Заполнить поля и проверить работу кнопки «Продолжить»"
        Pay pay = new Pay(driver);
        pay.inputPhoneNumber("297777777");
        pay.inputSum("10");
        pay.inputEmail("derevyanko.d.e@yandex.ru");
        pay.clickButtonСontinue();
    }
}