import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

@Test
public class BlockerTest extends BaseTest {

        LoginTest loginBy = new LoginTest();

    @Test
    public void CreateBlokerByAdmin() throws InterruptedException {

        loginBy.loginByAdmin();
        loginBy.createBlocker();
        loginBy.checkBlocker();
        sleep(2000);
        loginBy.deleteBloker();
    }
    @Test
    public void CreateBlokerByPractitioner() throws InterruptedException {
        loginBy.loginByPractitioner();
        sleep(1000);
        driver.findElement(By.xpath("//button[@class='fc-addAppointment-button fc-button fc-state-default fc-corner-left']")).click();
        sleep(1000);
        driver.findElement(By.xpath("//label[@for='appointment_repeat']")).click();
        driver.findElement(By.xpath("//label[@for='appointment_blocker']")).click();
        driver.findElement(By.xpath("//input[@id='appointment_interval']")).clear();
        driver.findElement(By.xpath("//input[@id='appointment_interval']")).sendKeys("5");
        driver.findElement(By.xpath("//input[@id='appointment_endType_1']")).click();
        driver.findElement(By.xpath("//button[@id='save_appointment']")).click();
        loginBy.checkBlocker();
        loginBy.deleteBloker();
    }
    @Test
    public void CreateBlokerByScheduler() throws InterruptedException {
        loginBy.loginByScheduler();
        loginBy.createBlocker();
        sleep(2000);
        loginBy.checkBlocker();
        loginBy.deleteBloker();
    }
    @Test
    public void CreateBlokerByReceptionist() throws InterruptedException {
        loginBy.loginByReceptionist();
        loginBy.createBlocker();
        sleep(2000);
        loginBy.checkBlocker();
        loginBy.deleteBloker();
    }
}
