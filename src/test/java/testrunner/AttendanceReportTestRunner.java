package testrunner;

import org.testng.annotations.Test;
import screens.AttendanceReport;
import screens.SignIn;
import setup.Setup;

public class AttendanceReportTestRunner extends Setup {

    SignIn signIn;
    AttendanceReport attendanceReport;

    @Test
    public void LeaveTest() throws InterruptedException {

        signIn = new SignIn(driver);
        attendanceReport = new AttendanceReport(driver);
        signIn.signIn("azmin@excelbd.com","D!m77(2SJ,5j");
        attendanceReport.attendanceReportSearch();
    }

}
