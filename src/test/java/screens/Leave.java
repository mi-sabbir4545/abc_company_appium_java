package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class Leave {

    AndroidDriver driver;
    Utils utils;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Leave Application\"]")
    WebElement leaveGroup;
    @FindBy(xpath = "//android.widget.TextView[@text=\"\uE627\"]")
    WebElement btnLeave;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"+, Application\"]")
    WebElement btnApplyLeave;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"\uF078, Leave Type*\"]/android.view.ViewGroup")
    WebElement leaveTypeDropDown;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Annual Leave\"]")
    WebElement selectLeaveType;
    @FindBy(xpath = "  //android.view.ViewGroup[@content-desc=\"\uF073, From Date*\"]/android.widget.TextView[1]")
    WebElement formCalender;
    @FindBy(xpath = "//android.view.View[@content-desc=\"01 August 2025\"]")
    WebElement selectFormDate;
    @FindBy(xpath = "//android.widget.Button[@resource-id=\"android:id/button1\"]")
    WebElement btnOk;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"\uF073, To Date*\"]/android.widget.TextView[1]")
    WebElement toCalender;
    @FindBy(xpath = "//android.view.View[@content-desc=\"01 August 2025\"]")
    WebElement selectToDate;
    @FindBy(xpath = " //android.widget.TextView[@text=\"Apply\"]")
    WebElement btnApply;
    @FindBy(xpath = "//android.widget.TextView[@text=\"OK\"]")
    WebElement btnConfirm;

    public Leave(AndroidDriver driver) {
        if (driver == null) {
            throw new IllegalArgumentException("Driver cannot be null");
        }
        this.driver = driver;
        this.utils = new Utils(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void applyLeave() throws InterruptedException {
        Thread.sleep(1000);
        leaveGroup.click();
        Thread.sleep(2000);
        btnLeave.click();
        Thread.sleep(1000);
        btnApplyLeave.click();
        Thread.sleep(1000);
        leaveTypeDropDown.click();
        Thread.sleep(1000);
        selectLeaveType.click();
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
        btnApply.click();
        Thread.sleep(1000);
        btnConfirm.click();

    }
}
