import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoToEbayTest {
    @Test(priority = 2)
    public void goToEbay() {
        System.setProperty("webdriver.chrome.driver", "D:\\browser_drivers\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://signin.ebay.com/");
        driver.close();
    }
}
