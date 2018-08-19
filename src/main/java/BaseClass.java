import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import java.io.File;

public class BaseClass {
    public static void main(String[] args) {
        File file = new File("/Users/monilj/Downloads/phantomjs-2.1.1-macosx/bin/phantomjs");
        System.setProperty("phantomjs.binary.path", file.getAbsolutePath());

        PhantomJSDriver driver = new PhantomJSDriver();
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Guru99");
        element.submit();
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("test case pass");
        driver.quit();
    }
}
