package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    /*
    HW1:
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
close the browser
Note: use name or id as locators
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

         driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

         Thread.sleep(2000);

         driver.findElement(By.id("customer.firstName")).sendKeys("Chaymae");
         driver.findElement(By.id("customer.lastName")).sendKeys("Bufnichel");
         driver.findElement(By.id("customer.address.street")).sendKeys("123GRDNS");
         driver.findElement(By.id("customer.address.city")).sendKeys("Harrisburg");
         driver.findElement(By.id("customer.address.state")).sendKeys("Pennsylvanian");
         driver.findElement(By.id("customer.address.zipCode")).sendKeys("1203");
         driver.findElement(By.name("customer.phoneNumber")).sendKeys("7175639839");
         driver.findElement(By.name("customer.ssn")).sendKeys("25899");
         driver.findElement(By.name("customer.username")).sendKeys("Chaymae34");
         driver.findElement(By.name("customer.password")).sendKeys("B23$ch");
         driver.findElement(By.name("repeatedPassword")).sendKeys("B23$ch");

         Thread.sleep(5000);

         driver.quit();



    }
}
