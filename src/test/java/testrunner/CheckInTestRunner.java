package testrunner;

import org.testng.annotations.Test;
import screens.AttendanceReport;
import screens.CheckInProcess;
import screens.SignIn;
import setup.Setup;

public class CheckInTestRunner extends Setup {

    SignIn signIn;
    CheckInProcess checkInProcess;

    @Test
    public void testCheckInProcess() throws InterruptedException {

        signIn = new SignIn(driver);
        checkInProcess = new CheckInProcess(driver);
        signIn.signIn("azmin@excelbd.com","D!m77(2SJ,5j");
        checkInProcess.checkIn();
    }
}
