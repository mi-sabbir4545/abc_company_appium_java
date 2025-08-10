package testrunner;

import org.testng.annotations.Test;
import screens.SignIn;
import setup.Setup;

public class LoginTestRunner extends Setup {

    SignIn signIn;

    @Test
    public void setSignInTest() throws InterruptedException {
        signIn = new SignIn(driver);
        signIn.signIn("azmin@excelbd.com","D!m77(2SJ,5j");
    }
}
