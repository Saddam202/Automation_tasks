import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class FirstTest {
    @BeforeClass
    public void before()
    {
        System.out.println("Before Class");
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Before Method");
    }
    @Test (enabled = false)
    public void test2()
    {
        // Soft Assertion
        SoftAssert soft = new SoftAssert();
        String actual = "actual";
        String expected = "Expected";
        soft.assertEquals(actual,expected,"String 1 not equal String 2");
        System.out.println("This is my Second Test");
        soft.assertFalse(actual==expected);
        soft.assertAll();
    }
    @Test (priority = -1,enabled = false)
    public void test1()
    {
        //Hard Assertion
        int actual=1; int expected=2;
        Assert.assertTrue(actual<=expected,"Actual is not greater than or equal expected");
        Assert.assertEquals(actual,expected,"Error");
        System.out.println("This is my First Test");
        Assert.assertTrue(actual==expected);
    }
    @Test(enabled = false)
    public void aTest()
    {
        System.out.println("This is a Test");
    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("After Method");
    }
    @AfterClass
    public void after()
    {
        System.out.println("After Class");
    }
}


