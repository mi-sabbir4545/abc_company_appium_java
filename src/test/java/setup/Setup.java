package setup;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Setup {

    public AndroidDriver driver;
    //public WebDriver driver1;
    @BeforeTest
    public AndroidDriver setup() throws MalformedURLException {
        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("deviceName","  emulator-5556");
        caps.setCapability("app",System.getProperty("user.dir")+"/src/test/resources/mobile-app.apk");
        caps.setCapability("automationName","UIAutomator2");

        URL url= new URL("http://127.0.0.1:4723");
        driver=new AndroidDriver(url,caps);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        return driver;

    }

    @AfterTest
    public void closeApp() {
        driver.quit();
    }
}
