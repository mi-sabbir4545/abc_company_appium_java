package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class CheckInProcess {

    AndroidDriver driver;
    Utils utils;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Check-OUT\"]")
    WebElement btnCheckIn;
    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Shutter\"]")
    WebElement btnShutter;
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Done\"]")
    WebElement checkInDone;
    @FindBy(xpath = "//android.widget.TextView[@text=\"OK\"]")
    WebElement btnConfirm;


    public CheckInProcess(AndroidDriver driver) {
        if (driver == null) {
            throw new IllegalArgumentException("Driver cannot be null");
        }
        this.driver = driver;
        this.utils = new Utils(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void checkIn() throws InterruptedException {
        Thread.sleep(10000);
        btnCheckIn.click();
        Thread.sleep(1000);
        btnShutter.click();
        Thread.sleep(1000);
        checkInDone.click();
        Thread.sleep(1000);
        btnCheckIn.click();
        Thread.sleep(1000);
        btnConfirm.click();
    }


}
