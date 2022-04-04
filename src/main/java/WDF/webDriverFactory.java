package WDF;

import WDF.browserOptions.ChromeOpt;
import WDF.browserOptions.OperaOpt;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.Locale;

public class webDriverFactory implements IwebDriverFactory {

    private String browserType = System.getenv("browser").toLowerCase(Locale.ROOT);

@Override
    public EventFiringWebDriver getDriver() {
        switch (this.browserType) {
            case "chrome": {
                return new EventFiringWebDriver(new ChromeOpt().newDriver());
            }
            case "opera": {
                return new EventFiringWebDriver(new OperaOpt().newDriver());
            }
            default:
                return new EventFiringWebDriver(new ChromeOpt().newDriver());
        }
    }
}
