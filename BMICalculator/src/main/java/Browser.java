import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    private static WebDriver driver;

    public static void setupDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    public static void quitDriver() {
        driver.quit();

    }

    public static WebDriver getDriver() {
        return driver;
    }
}
