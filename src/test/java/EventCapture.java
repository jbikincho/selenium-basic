import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.WebDriverListener;

import java.util.Arrays;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class EventCapture implements WebDriverListener {
    private static final Logger logger = Logger.getLogger("EventCapture");

    @Override
    public void beforeGet(WebDriver driver, String url) {
        logger.info("Getting url: " + url);
    }

    @Override
    public void beforeFindElement(WebDriver driver, By locator) {
        logger.info("Trying to find element by: " + locator.toString());
    }

    @Override
    public void beforeFindElements(WebDriver driver, By locator) {
        logger.info("trying to find elements by: " + locator.toString());
    }

    @Override
    public void beforeExecuteScript(WebDriver driver, String script, Object[] args) {
        logger.info("Trying to execute script: " + script +
                " \nwith params: " + Arrays.stream(args).collect(Collectors.toList()));
    }

    @Override
    public void afterExecuteAsyncScript(WebDriver driver, String script, Object[] args, Object result) {
        logger.info("Trying to execute async script: " + script +"" +
                "\n with params: " + Arrays.stream(args).collect(Collectors.toList()));
    }
}
