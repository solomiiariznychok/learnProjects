import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoToGoogleStartPageTest {

       @Test(priority = 1)
    public void goToGoogle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sriznych\\Documents\\driver\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(36000);
        driver.close();
    }
}
