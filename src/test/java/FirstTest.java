import static com.codeborne.selenide.Selenide.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.logging.Logger;

public class FirstTest extends  BaseTest {
    private final Logger log = Logger.getLogger(this.getClass().getName());
    @Test
    public void firstTEst() {
        driver.get("http://www.google.pl");
        driver.findElement(By.className("kurwa"));
        TestingBuilder putin = TestingBuilder.builder().age(12).name("putin").occupation("no, just visiting").build();

        log.info("!!! Pass: " + putin.name);
        log.info("!!! Pass: " + putin.occupation);

    }

    @Test
    public void  secondEmpty() {
        driver.get("http://google.pl");
    }
}
