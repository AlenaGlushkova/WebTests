import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void testFirst() throws InterruptedException {

        String driverPath = "C:/Program Files/ChromeDriver/chromedriver.exe";
        String chromeDriver = "webdriver.chrome.driver";
        String url = "http://www.99-bottles-of-beer.net";
        String expectedResult =  "http://www.99-bottles-of-beer.net/";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        Thread.sleep(3000);

        String actualResult = driver.getCurrentUrl();

        Assert.assertEquals(actualResult, expectedResult);

        driver.close();
        driver.quit();

    }
}
