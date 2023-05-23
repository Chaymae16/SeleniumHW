package class02;
/*
HW  (only use XPATH)
navigate to fb.com
click on create new account
fill up all the textboxes
close the popup
close the browser
[10:19 PM]
Note : in order for ur code to work
u have to put Thread.sleep(2000) after clicking
 on Create new account
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWXpath {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@rel='async']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("kim");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Brely");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Kim@.come");
        driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("1209$bAe");
        driver.findElement(By.xpath("//select[@aria-label='Month']")).sendKeys("june");
        driver.findElement(By.xpath("//select[@id='day']")).sendKeys("12");
        driver.findElement(By.xpath("//select[@aria-label='Year']")).sendKeys("1988");
        driver.findElement(By.xpath("//label[text()='Female']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[text()='Male']"));
        driver.findElement(By.xpath("//label[text()='Custom']"));
        driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
        Thread.sleep(2000);
        driver.close();
        driver.quit();






    }
}
