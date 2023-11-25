package magento;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverManager {

    private static WebDriver driver;
    private static WebDriverWait wait;

    public static void create(String browser){
        driver = WebDriverManager.getInstance(browser).create();
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static WebDriverWait getWait(){
        return wait;
    }

    public static void goSite(String url) {
        driver.get(url);
    }
}
