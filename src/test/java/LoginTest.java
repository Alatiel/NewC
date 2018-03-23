import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

@Test
public class LoginTest extends BaseTest implements UserData {
    LoginPage LoginPage = new LoginPage(driver);


   @Test
    public void loginByAdmin() {
       LoginPage.usernameField.sendKeys(usernameAdmin);
       LoginPage.passwordField.sendKeys(password);
       LoginPage.signInButton.click();
    }
    @Test
    public void loginByPractitioner() {
        LoginPage.usernameField.sendKeys(usernamePractitioner);
        LoginPage.passwordField.sendKeys(password);
        LoginPage.signInButton.click();
   }

    @Test
    public void loginByReceptionist() {
        LoginPage.usernameField.sendKeys(usernameReceptionist);
        LoginPage.passwordField.sendKeys(password);
        LoginPage.signInButton.click();
    }

    @Test
    public void loginByScheduler() {
        LoginPage.usernameField.sendKeys(usernameSscheduler);
        LoginPage.passwordField.sendKeys(password);
        LoginPage.signInButton.click();
    }

    //Create Blocker method
    public void createBlocker() throws InterruptedException {
        driver.get(test1104ClinicUrl);
        sleep(1000);
        driver.findElement(By.xpath("//button[@class='fc-addAppointment-button fc-button fc-state-default fc-corner-left']")).click();
        sleep(2000);
        driver.findElement(By.xpath("//span[text()='Choose a Practitioner']")).click();
        driver.findElement(By.xpath("//span[text()='practitioner 01 (practitioner@yopmail.com)']")).click();
        driver.findElement(By.xpath("//label[@for='appointment_repeat']")).click();
        driver.findElement(By.xpath("//label[@for='appointment_blocker']")).click();
        driver.findElement(By.xpath("//input[@id='appointment_interval']")).clear();
        driver.findElement(By.xpath("//input[@id='appointment_interval']")).sendKeys("5");
        driver.findElement(By.xpath("//input[@id='appointment_endType_1']")).click();
        driver.findElement(By.xpath("//button[@id='save_appointment']")).click();
    }
    public void checkBlocker(){
        driver.get(test1104ClinicappointmentsUrl);
        driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-globe btn-link']"));
    }

    public void deleteBloker () throws InterruptedException{
        driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-globe btn-link']")).click();
        sleep(5000);
        driver.findElement(By.xpath("//button[@title='Delete']")).click();
        sleep(1200);
        driver.findElement(By.xpath("//button[text()='Delete']")).click();
    }

}
