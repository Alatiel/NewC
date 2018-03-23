import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

        @FindBy(xpath = "//input[@name='username']")
        public WebElement usernameField;

        @FindBy(xpath = "//input[@name='password']")
        public WebElement passwordField;

        @FindBy(xpath = "//button[@class='btn btn-consentz-light btn-form']")
        public WebElement signInButton;
    }

