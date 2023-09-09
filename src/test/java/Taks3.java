import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Taks3 {
    @Test
    void A_validRegister ()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        //Elements locators
        WebElement RegisterButton = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
        RegisterButton.click();
        WebElement FirstName = driver.findElement(By.id("FirstName"));
        WebElement LastName  = driver.findElement(By.id("LastName"));
        WebElement Email = driver.findElement(By.name("Email"));
        WebElement Password = driver.findElement(By.id("Password"));
        WebElement ConfirmPassword = driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]"));
        WebElement Register = driver.findElement(By.id("register-button"));

        //wep elements commands

        FirstName.sendKeys("Saddam");
        LastName.sendKeys("Abdallah");
        Email.sendKeys("saddamawad70@gmail.com");
        Password.sendKeys("Saddam@25");
        ConfirmPassword.sendKeys("Saddam@25");
        Register.click();
        WebElement Registered_sucess = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]"));
        String Expected ="Your registration completed";
        Assert.assertEquals(Registered_sucess.getText(),Expected);







    }







}
