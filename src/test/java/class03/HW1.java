package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
HW1:
Open chrome browser
Go to “http://practice.syntaxtechs.net/input-form-demo.php%E2%80%9D
fill in the complete form (edited)
[10:17 PM]

 */
public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement firstName =driver.findElement(By.xpath("//input[@name='first_name']"));
        firstName.sendKeys("Ali");

        WebElement lastName=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastName.sendKeys("Bai");

        WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("alidse@gmail.com");

        WebElement phone=driver.findElement(By.cssSelector("input[name='phone']"));
        phone.sendKeys("71757868");

        WebElement address=driver.findElement(By.cssSelector("input[name='address']"));
        address.sendKeys("124Rose");

        WebElement city=driver.findElement(By.xpath("//input[@placeholder='city']"));
        city.sendKeys("harisburg ");

        WebElement state=driver.findElement(By.xpath("//select[contains(@class,'-control ')]"));
        state.sendKeys("Ohio");

        WebElement zip=driver.findElement(By.cssSelector("input[placeholder*='Code']"));
        zip.sendKeys("1234");

        WebElement domainName=driver.findElement(By.cssSelector("input[name='website']"));
        domainName.sendKeys("IT");

        WebElement hosting=driver.findElement(By.xpath("//label[text()='Do you have hosting?']"));

        WebElement yes1=driver.findElement(By.xpath("//input[@name='hosting']"));

        WebElement no1=driver.findElement(By.xpath("//input[@value='no']"));
        no1.click();

        WebElement project=driver.findElement(By.cssSelector("textarea[placeholder*='ject De']"));
        project.sendKeys("My first Project");

        WebElement send=driver.findElement(By.xpath("//button[text()='Send ']"));
        send.click();






    }
}
