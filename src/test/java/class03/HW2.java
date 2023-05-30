package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
HW2:
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D
Enter valid username
Leave password field empty
Click on login button
Verify error message with text “Password cannot be empty” is displayed. (edited)
 */
public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        driver.manage().window().maximize();

       WebElement userName=driver.findElement(By.xpath("//input[@name='txtUsername']"));
       userName.sendKeys("Chaymae");
       Thread.sleep(2000);
       WebElement login=driver.findElement(By.cssSelector("input#btnLogin"));
       login.click();
       WebElement error= driver.findElement(By.xpath("//span[text()='Password cannot be empty']"));
       String text=error.getText();
        System.out.println(text);
        if (text.equals("Password cannot be empty")){
            System.out.println("is displayed (edited)");
        }else {
            System.out.println("is not is displayed (edited)");
        }
        Thread. sleep(2000);





    }
}
