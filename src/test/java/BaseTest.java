import io.github.bonigarcia.wdm.BrowserManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected static WebDriver driver;

    @BeforeAll
    public static void setupDriver() {
        BrowserManager instance = WebDriverManager.getInstance(ChromeDriver.class);
        instance.setup();
        driver = new ChromeDriver();
    }

    @AfterAll
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
