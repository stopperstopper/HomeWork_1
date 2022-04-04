package WDF.browserOptions;

import WDF.Environment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class OperaOpt {
    private final String browseroptions = System.getenv("browser.options");
    public WebDriver newDriver() {
        OperaOptions operaOptions = new OperaOptions();
        operaOptions.addArguments(browseroptions);
        return new OperaDriver(operaOptions);
    }
}
