import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginSeleniumTest  {

    @Test
    public void login() { // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "D:\\browser_drivers\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //111
        //222
        //333
        driver.manage().window().maximize();
        driver.get("https://www.linkedin.com/login");
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.xpath("//button[text()='Sign in']"));
        username.sendKeys("example@gmail.com");
        password.sendKeys("password");
        login.click();
        String actualUrl = "https://www.linkedin.com/feed/";
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }
}
