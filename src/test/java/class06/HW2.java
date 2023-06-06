package class06;
/*
goto http://practice.syntaxtechs.net/dynamic-data-loading-demo.php
click on get new user
print the firstname of user
 */
import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HW2 extends CommonMethods {
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement btn =driver.findElement(By.xpath("//button[@type='button']"));
        btn.click();
        WebElement firstName = driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        String text = firstName.getText();
        System.out.println(text);







    }
}
