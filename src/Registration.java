import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Registration {
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

        //click on register botton
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();

        //enter first name
        driver.findElement(By.id("FirstName")).sendKeys("Nimisha");

        //enter last name
        driver.findElement(By.xpath("//input[@name= 'LastName']")).sendKeys("Patel");

        //enter email
        driver.findElement(By.name("Email")).sendKeys("testtest@test26.com");

        //enter the password
        driver.findElement(By.xpath("//input[@type=\"password\" and @id=\"Password\"]")).sendKeys("xyz123");

        //enter confirm password
        driver.findElement(By.name("ConfirmPassword")).sendKeys("xyz123");

        //click on register
        driver.findElement(By.xpath("//input[@class=\"button-1 register-next-step-button\"]")).click();

        //click on continue
        //driver.findElement(By.xpath("//div/input[contains(@type,'submit')]")).click();
        //close
        driver.close();

    }
}
