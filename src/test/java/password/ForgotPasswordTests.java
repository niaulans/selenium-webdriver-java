package password;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.*;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testForgotPassword() {

        ForgotPasswordPage forgotpass = homePage.clickForgotPassword();
        forgotpass.setEmail("tau@example.com");

        EmailSentPage emailsent = forgotpass.clickRetrievePasswordBtn();
        assertEquals(emailsent.getNotice(), "Internal Server Error", "Notice is incorrect");
    }
}
