package SauceDemoAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationSauceDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        System.out.println("******** First Case started ********");
        //Set username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(1000);

        //Passwoed is set
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);

        driver.findElement(By.id("login-button")).click();
        System.out.println("Log-In successfully");
        System.out.println("Title " +driver.getTitle());
        Thread.sleep(1000);

        driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]")).click();
       //driver.findElement(By.xpath("//div//select/option[4]")).click();

       for(int i=1;i<=4;i++){
           driver.findElement(By.xpath("//div//select/option["+i+"]")).click();
       }

       driver.findElement(By.xpath("//button[@class=\"btn btn_primary btn_small btn_inventory\"]")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//button[@data-test=\"checkout\"]")).click();
       driver.findElement(By.id("first-name")).sendKeys("Kiran");
       driver.findElement(By.id("last-name")).sendKeys("Jadhav");
       driver.findElement(By.id("postal-code")).sendKeys("413215");
       System.out.println("user details entered successfully");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
       Thread.sleep(1000);
       driver.findElement(By.id("finish")).click();
       Thread.sleep(1000);
       System.out.println(driver.findElement(By.xpath("//div/h2[@class=\"complete-header\"]")).getText());
       System.out.println(driver.findElement(By.xpath("//div[@class=\"complete-text\"]")).getText());
       driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();
       driver.findElement(By.xpath("//a[@id=\"logout_sidebar_link\"]")).click();
       System.out.println("******* First Case completed ********" +'\n');

       System.out.println("********* Second Case started ********");
       driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
       Thread.sleep(1000);
       driver.findElement(By.id("password")).sendKeys("secret_sauce");
       Thread.sleep(1000);
       driver.findElement(By.id("login-button")).click();
       System.out.println(driver.findElement(By.xpath("//h3[@data-test=\"error\"]")).getText());
       System.out.println("******* Second Case completed ********" +'\n');

       System.out.println("********* Third Case Started *********");
       driver.findElement(By.xpath("//button[@class=\"error-button\"]")).click();
       driver.findElement(By.xpath("//div//input[@id=\"user-name\"]")).clear();
       driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("problem_user");
       Thread.sleep(500);
       driver.findElement(By.xpath("//input[@id=\"password\"]")).clear();
       driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
       Thread.sleep(500);
       driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
       // if("img" == "src=/static/media/sl-404.168b1cce.jpg")
        System.out.println("Image displayed is Not Appropriate");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//a[@id=\"logout_sidebar_link\"]")).click();
        Thread.sleep(1000);
        System.out.println("********** Third Case Completed ***********" +'\n');

        System.out.println("********** Fourth Case Started ************ ");
        driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("performance_glitch_user");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
        System.out.println(" Page Is Taking time for Log-in");
        driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//option[@value=\"lohi\"]" )).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
        driver.findElement(By.xpath("//button[@id=\"checkout\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"first-name\"]")).sendKeys("Snehal");
        driver.findElement(By.xpath("//input[@id=\"last-name\"]")).sendKeys("Jadhav");
        driver.findElement(By.xpath("//input[@id=\"postal-code\"]")).sendKeys("413215");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
        driver.findElement(By.xpath("//button[@id=\"finish\"]")).click();
        System.out.println(driver.findElement(By.xpath("//h2[@class=\"complete-header\"]")).getText());
        System.out.println(driver.findElement(By.xpath("//div[@class=\"complete-text\"]")).getText());
        driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();
        driver.findElement(By.xpath("//a[@id=\"logout_sidebar_link\"]")).click();































    }
}
