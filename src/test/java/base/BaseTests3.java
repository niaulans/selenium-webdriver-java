package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests3 {

    private WebDriver driver;

    public void setUp() {
        // Set directory chromedriver
        System.setProperty("webdriver.com.driver", "resources/chromedriver.exe");

        // Create ChromeDriver object
        driver = new ChromeDriver(); // can be changed to Firefox etc.

        // Load to app
        driver.get("https://the-internet.herokuapp.com/");

        // Maximize window app
        driver.manage().window().maximize();

        // Set windows
//        driver.manage().window().setSize(new Dimension(390, 844));

        // Fullscreen window app
//        driver.manage().window().fullscreen();

        // Get title of app
        System.out.println(driver.getTitle());

        // Close app and session
        driver.quit();

        // Just close the windows, not session
//        driver.close();
    }
    public static void main(String[] args) {
        BaseTests3 test = new BaseTests3();
        test.setUp();
    }
}
