import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrangeHRM {
    protected static WebDriver driver;

    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");

        //open browser
        driver = new ChromeDriver();

        //maximise the browser window
        driver.manage().window().fullscreen();

        //set implicity wait for driver object
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).click();

        //enter first name
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        //enter password
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin123");

        //click on login
        driver.findElement(By.id("btnLogin")).click();

        //click on welcome user
        driver.findElement(By.xpath("//a[@class=\"panelTrigger\"]")).click();

        //click on logout
        driver.findElement(By.linkText("Logout")).click();

        //close
        driver.close();
    }
}
