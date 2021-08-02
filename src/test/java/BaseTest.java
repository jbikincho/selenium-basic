import io.github.bonigarcia.wdm.BrowserManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected static WebDriver driver;

    @BeforeClass
    public static void setupDriver() {
        BrowserManager instance = WebDriverManager.getInstance(ChromeDriver.class);
        instance.setup();
        driver = new ChromeDriver();
    }

    @AfterClass
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
