
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

public class BaseTest {
    protected static WebDriver driver;

    @BeforeAll
    public static void setupDriver() {
        WebDriverManager driverManager = WebDriverManager.getInstance(ChromeDriver.class);
        driverManager.driverVersion("103.0.5060.53").setup();
        WebDriver nonDecorated = new ChromeDriver();

        WebDriverListener listener = new EventCapture();
        driver = new EventFiringDecorator(listener).decorate(nonDecorated);
    }

    @AfterAll
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
