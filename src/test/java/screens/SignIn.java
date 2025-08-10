package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {

    AndroidDriver driver;

    @FindBy(xpath="//android.widget.EditText[@text=\"Enter Email\"]")
    WebElement userName;
    @FindBy(xpath="//android.widget.EditText[@text=\"Enter Password\"]")
    WebElement txtPassword;
    @FindBy(xpath="//android.widget.TextView[@text=\"Login\"]")
    WebElement btnLogin;

    public SignIn(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void signIn(String username, String password) throws InterruptedException {
        Thread.sleep(1000);
        userName.click();
        userName.sendKeys(username);
        Thread.sleep(1000);
        txtPassword.click();
        txtPassword.sendKeys(password);
        Thread.sleep(1000);
        btnLogin.click();
        btnLogin.click();
    }
}
