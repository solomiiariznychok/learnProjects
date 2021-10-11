import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoToGoogleStartPageTest {

    @Test(priority = 1)
    public void goToGoogle() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sriznych\\Documents\\driver\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.close();
    }
}
