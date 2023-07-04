package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests2 {

    private WebDriver driver;

    public void setUp() {

        System.setProperty("webdriver.com.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println(links.size());
//
//        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
//        inputsLink.click();
//
//        System.out.println(driver.getTitle());
//        driver.quit();

        driver.findElement(By.linkText("Shifting Content")).click();
        driver.findElement(By.linkText("Example 1: Menu Element")).click();
        List<WebElement> menuItems = driver.findElements(By.tagName("li"));
        System.out.println("Number of menu items: " + menuItems.size());

        driver.quit();
    }

    public static void main(String[] args) {
        BaseTests2 test = new BaseTests2();
        test.setUp();
    }
}
