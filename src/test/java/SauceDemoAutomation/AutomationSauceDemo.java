package SauceDemoAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.HashMap;
//import java.util.List;
import java.util.Map;

//import static java.sql.DriverManager.getDriver;

public class AutomationSauceDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        //find username and set username
        WebElement txtbox_username = driver.findElement(By.id("user-name"));
        txtbox_username.sendKeys("standard_user");


        //passwoed is set
        driver.findElement(By.id("password")).sendKeys("secret_sauce");


        driver.findElement(By.id("login-button")).click();
        driver.navigate();
        //driver.findElement(By.class("product_sort_container")).click();


        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select")).click();
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        driver.findElement(By.id("first-name")).sendKeys("Kiran");
        driver.findElement(By.id("last-name")).sendKeys("Jadhav");
        driver.findElement(By.id("postal-code")).sendKeys("413215");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        driver.findElement(By.id("finish")).click();
        System.out.println("THANK YOU FOR YOUR ORDER");
       /* public void getFilter getFilter(3);

        ( int index) throws InterruptedException {
            Map<Integer, String> filterValue = new HashMap<>();

            filterValue.put(1, "Name (A to Z)");
            filterValue.put(2, "Name (Z to A)");
            filterValue.put(3, "Price (low to high)");
            filterValue.put(4, "Price (high to low)");
            Thread.sleep(500);


            filterValue.forEach((k, v) -> {
                Select select1 = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
                select1.selectByVisibleText(filterValue.get(k));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            Thread.sleep(2000);
            Select select = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
            select.selectByVisibleText(filterValue.get(index));
        }*/


    }
}
