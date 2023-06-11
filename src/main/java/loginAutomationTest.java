import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginAutomationTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\work\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://training.skillo-bg.com:4200/users/login");


        WebElement username = driver.findElement(By.xpath("//input[@id='defaultLoginFormUsername']"));
        username.sendKeys("vladislav.poshta@gmail.com");

        WebElement password = driver.findElement(By.xpath("//*[@id=\"defaultLoginFormPassword\"]"));
        password.sendKeys("testPassword");

        WebElement checkbox = driver.findElement(By.xpath("/html/body/app-root/div[2]/app-login/div/div/form/div/input"));
        checkbox.click();

        WebElement signIn = driver.findElement(By.xpath("//*[@id=\"sign-in-button\"]"));
        signIn.click();
    }
}
