package WDF;

import WDF.exceptions.DriverTypeNotSupported;
import org.openqa.selenium.WebDriver;

public interface IwebDriverFactory {
    WebDriver getDriver() throws DriverTypeNotSupported;
}
