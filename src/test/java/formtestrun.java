import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class formtestrun extends Setup {
    public formtestrun(WebDriver driver){
        this.driver = driver;
    }

//    SoftAssert softAssert = new SoftAssert();


    @Test(priority = 0)
    public void loginTest(){
        form login = new form(driver);
        login.cookiesaccept();
        login.eMail();
        login.passWord();
        login.loginButton();
    }
    @Test(priority = 1)
    public void formfillUp(){
        form fillup = new form(driver);
        fillup.plusIconclick();
        fillup.dropDown1();
    }

    @Test(priority = 2)
    public void scrolldown() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        Thread.sleep(4000);
    }


    public void upLoad1(){
        form uploadfile = new form(driver);
        uploadfile.uploadButton();
        uploadfile.uploaD();
        System.out.println("uploaded successfully");

    }




}

