import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class form extends Setup {
    public form(WebDriver driver){
        this.driver = driver;
    }

    By cookie = By.xpath("//button[@class='btn btn-primary flex-fill json-link']");
    By email = By.id("login-email");
    By password = By.id("login-password");
    By loginbutton = By.xpath("//button[@type='submit']");
    By plusicon = By.xpath("//span[@class='btn btn-submission-entry position-absolute']");

    By dropdown1 = By.xpath("//span[@class='triangle triangle-down']");

    By uploadbutton = By.xpath("");

    By upload1 = By.xpath("");

    public void cookiesaccept(){
        driver.findElement(cookie).click();
    }

    public void eMail(){
        driver.findElement(email).sendKeys("unit@ideascale.me");
    }

    public void passWord(){
        driver.findElement(password).sendKeys("brewski01");
    }

    public void loginButton(){
        driver.findElement(loginbutton).click();
    }

    public void plusIconclick(){
        driver.findElement(plusicon).click();
    }

//    public void droP(){
//        driver.findElement(dropdown1).click();
//    }
    public void dropDown1(){
        Select drop = new Select(driver.findElement(dropdown1));
        drop.selectByIndex(2);
    }

    public void uploadButton(){
        driver.findElement(uploadbutton).click();

    }
    public void uploaD(){
        driver.findElement(upload1).sendKeys("");
    }






}

