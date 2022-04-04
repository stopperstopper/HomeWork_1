package WDF.browserOptions;

import WDF.Environment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOpt {
    private final String browseroptions = System.getenv("browser.options");
    public WebDriver newDriver() {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments(browseroptions);
        return new ChromeDriver(chromeOptions);
}
}
