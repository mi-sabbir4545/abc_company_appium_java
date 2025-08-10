package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class AttendanceReport {
    AndroidDriver driver;
    Utils utils;

    @FindBy(xpath="//android.view.ViewGroup[@content-desc=\"HR\"]")
    WebElement hrGroup;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"My Attendance\"]")
    WebElement attendanceGroup;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"\uF073, From\"]/android.widget.TextView[1]")
    WebElement formCalender;
    @FindBy(xpath = "//android.view.View[@content-desc=\"01 August 2025\"]")
    WebElement selectFormDate;
    @FindBy(xpath = "//android.widget.Button[@resource-id=\"android:id/button1\"]")
    WebElement btnOk;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"\uF073, To\"]/android.widget.TextView[1]")
    WebElement toCalender;
    @FindBy(xpath = "//android.view.View[@content-desc=\"31 August 2025\"]")
    WebElement selectToDate;
    @FindBy(xpath = "//android.widget.TextView[@text=\"All\"]")
    WebElement statusDropdown;
    @FindBy(xpath = "//android.widget.TextView[@text=\"On Leave\"]")
    WebElement clickOnLeaveStatus;

    public AttendanceReport(AndroidDriver driver) {
        if (driver == null) {
            throw new IllegalArgumentException("Driver cannot be null");
        }
        this.driver = driver;
        this.utils = new Utils(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void attendanceReportSearch() throws InterruptedException {
        Thread.sleep(3000);
        attendanceGroup.click();
        Thread.sleep(1000);
        formCalender.click();
        Thread.sleep(1000);
        selectFormDate.click();
        Thread.sleep(1000);
        btnOk.click();
        Thread.sleep(1000);
        toCalender.click();
        Thread.sleep(1000);
        selectToDate.click();
        Thread.sleep(1000);
        btnOk.click();
        Thread.sleep(1000);
        statusDropdown.click();
        Thread.sleep(1000);
        clickOnLeaveStatus.click();
        Thread.sleep(1000);
    }
}
