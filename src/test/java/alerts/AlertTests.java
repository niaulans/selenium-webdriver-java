package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert () {
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerAlert();
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResults(), "You successfully clicked an alert", "Result text incorrect");
    }

    @Test
    public void testGetTextFromAlert() {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }

    @Test
    public void testSetInputInAlert() {
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerPrompt();
        String text = "TAU rocks!";
        alertPage.alert_setInput(text);
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResults(),"You entered: " + text, "Result is incorrect");
    }
}
