package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();

        (driver.findElement(Locators.iframeButton)).click();

        //-- To Switch to Frame 1
        driver.switchTo().frame(driver.findElement(Locators.outterIFrame));

        //-- To Switch to innerFrame
        driver.switchTo().frame(driver.findElement(Locators.innerIFrame));

        //--To Locate to The input Box
        WebElement inputBox= driver.findElement(Locators.inputBox);
        inputBox.click();

        inputBox.sendKeys("1234556666666667");
        Thread.sleep(3000);

        //-- Navigate to another Link

        driver.navigate().to("https://chercher.tech/practice/frames");
        driver.switchTo().window(driver.getWindowHandle());
        int size = driver.findElements(Locators.numberOfFrames).size();
        System.out.println("size = "+size);

        //-- Switch to frame 1
        driver.switchTo().frame(driver.findElement(Locators.mainFrame));
        driver.findElement(By.xpath("//input")).sendKeys("Diksha");
        driver.switchTo().frame(driver.findElement(Locators.childFrame));
        driver.findElement(Locators.checkBox).click();
        Thread.sleep(2000);

        //-- Return to the main frame
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(Locators.mainFrame2));
        Select select=new Select(driver.findElement(Locators.dropdown));
        select.selectByVisibleText("Big Baby Cat");
        Thread.sleep(3000);

        driver.quit();
    }
}