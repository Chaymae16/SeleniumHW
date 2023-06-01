package class05;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
HW2:
goto https://chercher.tech/practice/frames

click on check box
then select bay cat from drop down
then enter text in text box (edited)

 */
public class HW2 extends CommonMethods {
    public static void main(String[] args) {
        String url="https://chercher.tech/practice/frames";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        driver.switchTo().frame(0);

        WebElement frame3 =driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);

        WebElement dd=driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel=new Select(dd);
        sel.selectByVisibleText("Baby Cat");

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");

        WebElement text=driver.findElement(By.xpath("//input"));
        text.sendKeys("Java");



    }
}
