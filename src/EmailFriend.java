import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class EmailFriend {
    protected static WebDriver driver;

    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");

        //open the browser
        driver = new ChromeDriver();

        //maximise the browser window screen
        driver.manage().window().fullscreen();

        //set inplicity wait for driver object
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //open the website
        driver.get("https://demo.nopcommerce.com/");

        //click on login
        driver.findElement(By.linkText("Log in")).click();

        //enter email address
        driver.findElement(By.id("Email")).sendKeys("testtest@test20.com");

        //enter password
        driver.findElement(By.className("password")).sendKeys("xyz123");

        //click on login
        driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click();

        //click on apple macbook
        driver.findElement(By.xpath("//h2/a[@href=\"/apple-macbook-pro-13-inch\"]")).click();

        //click on email friend
        driver.findElement(By.xpath("//input[@value=\"Email a friend\"]")).click();

        //select friend email address
        driver.findElement(By.id("FriendEmail")).sendKeys("nimisha_2507@yahoo.co.in");

        //enter comment
        driver.findElement(By.name("PersonalMessage")).sendKeys("The product you were searching for");

        //send email friend
        driver.findElement(By.xpath("//input[contains(@name,'send-email')]")).click();

        //logout
        //driver.findElement(By.className("ico-logout")).click();

        //driver
        driver.close();


    }
}
