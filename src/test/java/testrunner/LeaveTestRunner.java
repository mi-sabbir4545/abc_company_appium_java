package testrunner;

import org.testng.annotations.Test;
import screens.CheckInProcess;
import screens.Leave;
import screens.SignIn;
import setup.Setup;

public class LeaveTestRunner extends Setup {
    SignIn signIn;
    Leave leave;

    @Test
    public void testLeaveApply() throws InterruptedException {

        signIn = new SignIn(driver);
        leave = new Leave(driver);
        signIn.signIn("azmin@excelbd.com","D!m77(2SJ,5j");
        leave.applyLeave();
    }
}
