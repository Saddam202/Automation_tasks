import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumDemo {
    @Test
    public void startChromeByWebdriverManger() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
        WebElement Searchbox = driver.findElement(By.id("small-searchterms"));
        WebElement SearchButton = driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button"));
        Searchbox.sendKeys("Automation testing");
        SearchButton.click();
        WebElement SearchResult =driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[2]/div/div[2]/div"));
        String Actual = SearchResult.getText();
        Assert.assertEquals(Actual,"No products were found that matched your criteria.");


    }

}
