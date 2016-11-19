import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by vip on 11/13/2016.
 */
public class TestJava {
    public static void main(String[] args) {

        WebDriver driver;

        System.setProperty("webdriver.chrome.driver", "H:\\selenium\\Selenium Libraries\\Chrome\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://google.com");

/*
        System.setProperty("webdriver.ie.driver", "H:\\selenium\\Selenium Libraries\\IEDriverServer_64Bit.exe");
        driver=new InternetExplorerDriver();
        driver.get("http://google.com");
*/

        /*System.setProperty("webdriver.firefox.marionette","H:\\selenium\\Selenium Libraries\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://google.com");
*/
        driver.quit();
    }
}