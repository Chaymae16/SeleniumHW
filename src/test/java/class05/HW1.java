package class05;

import Utlis.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
http://practice.syntaxtechs.net/javascript-alert-box-demo.php
click on the last alert
send keys and accept it

Note: don't worry if the text u send doesn't appear up in the textbook
 */
public class HW1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement alert1 =driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
        alert1.click();

        Thread.sleep(3000);

        Alert switchFocus=driver.switchTo().alert();
        switchFocus.sendKeys("Selenium");
        switchFocus.accept();

    }

}
