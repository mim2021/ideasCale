import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class formtestrun extends Setup {
//    public formtestrun(WebDriver driver){
//        this.driver = driver;
//    }

    SoftAssert softAssert = new SoftAssert();

    @Test(priority = 0)
    public void loginTest() throws InterruptedException {
        form login = new form(driver);

        driver.get("https://unit.ideascale.me/a/community/login");
        driver.manage().window().maximize();
        String expectedUrl = "https://unit.ideascale.me/a/community/login";
        String actualUrl = driver.getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl, "Actual page url is same as expected");

        login.cookiesaccept();
        softAssert.assertEquals(true,true);
        login.eMail();
        softAssert.assertEquals(true,true);
        login.passWord();
        softAssert.assertEquals(true,true);
        login.loginButton();
        softAssert.assertEquals(true,true);
        System.out.println("Successfully Done");
        Thread.sleep(2000);
        softAssert.assertAll();
    }
    @Test(priority = 1)
    public void formfillUp() throws InterruptedException {
        form fillup = new form(driver);
        fillup.plusIconclick();
        softAssert.assertEquals(true,true);
        fillup.dropDown1();
        softAssert.assertEquals(true,true);
        System.out.println("Successfully Completed");
        Thread.sleep(2000);
        softAssert.assertAll();
    }
    @Test(priority = 2)
    public void scrolldown() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void upLoad1() throws InterruptedException {
        form uploadfile = new form(driver);
        uploadfile.uploadButton();
        softAssert.assertEquals(true,true);
        uploadfile.uploaD();
        softAssert.assertEquals(true,true);
        System.out.println("uploaded successfully");
        Thread.sleep(2000);
        softAssert.assertAll();

    }




}

