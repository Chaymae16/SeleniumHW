package class07;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/*
goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
login
click on PIM

from the table choose any ID
and print out the row number of that id
 */
public class HW extends CommonMethods {
    public static void main(String[] args) {
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser="chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement userName =driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn=driver.findElement(By.xpath("//input[@name='Submit']"));
        loginBtn.click();
        WebElement pim=driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pim.click();

 //        print the row number of the row that has the id 14235029
        List<WebElement> allIDs =driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
 //        loop
        for (int i = 0; i <allIDs.size() ; i++) {
            String id = allIDs.get(i).getText();
 //        if(){}
        if (id.equals("55804A")){
            System.out.println("the row number of that id "+i+1);
        }
        driver.close();

        }
    }
}
