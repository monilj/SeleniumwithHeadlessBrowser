import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class ChromeDriver {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/monilj/Downloads/Devlopment/drivers/chromedriver");
       ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("headless");
        chromeOptions.addArguments("window-size=1200x600");
        org.openqa.selenium.chrome.ChromeDriver driver = new org.openqa.selenium.chrome.ChromeDriver(chromeOptions);
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Guru99");
        element.submit();
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("test case pass");
        driver.quit();

    }

}
