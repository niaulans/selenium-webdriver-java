package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {

    private WebDriver driver;
    private By notice = By.xpath("//h1");

    public EmailSentPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getNotice(){
        return driver.findElement(notice).getText();
    }

}
