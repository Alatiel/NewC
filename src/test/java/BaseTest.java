import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class BaseTest extends BasePage implements UserData {

    @BeforeMethod
    public void setup () {

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }
    @AfterMethod
    public void teardown () {
        // driver.get("chrome://settings/clearBrowserData");
        driver.quit();
        driver = null;
    }
}