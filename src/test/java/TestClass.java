import com.github.dockerjava.api.model.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver() ;

        driver.navigate().to("https://www.saucedemo.com/");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }


  /*  driver.get("");


    webelement login;


    login.select;
    lofin.sendkeys("usernameemail");
    opassword.
            driver.navigate;

    addpatient.
*/



}
