import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import pages.MainPage;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class TestOpen {

        private static Logger logger = LogManager.getLogger(TestOpen.class);

        private WebDriver driver;
        //public String highLight;
        public static MainPage mainPage;
        private String baseUrl = System.getenv("webdriver.base.url");
        protected Actions actions;
        private String browserType=System.getenv("browser").toLowerCase(Locale.ROOT);
    private String browserOpt=System.getenv("browser.options").toLowerCase(Locale.ROOT);





        @Before
        public  void setup(){

            logger.info("-------------------новый тест----------------------");
        }

        @After
        public void closeDriver() {
            if (driver != null)
                driver.quit();

            logger.info("драйвер закрыт");

            logger.info("-------------------тест окончен---------------------");
        }

        // Проверяем открылась ли главная страница (baseUrl)
        @Test
        public  void validMainPage() throws InterruptedException {

            /**
            почему-то не дает получить драйвер
            **/
            driver= new EventFiringWebDriver(driver);

            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver.get(baseUrl);
            mainPage=new MainPage(driver);
            //  actions = new Actions(driver);
            Assert.assertEquals("Авторские онлайн‑курсы для профессионалов",mainPage.headerMainPage.getText());
            //  Thread.sleep(1000);
            System.out.println(mainPage.headerMainPage.getText());
            logger.info("Valid main page");
        }
    
}
