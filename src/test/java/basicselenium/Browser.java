package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser {
    @Test
    public void Sample() {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.wikipedia.org/");
        chromeDriver.manage().window().maximize();
        WebElement element = chromeDriver.findElement(By.id("searchInput"));
        element.sendKeys("Artificial Intelligence");
        element.sendKeys(Keys.ENTER);
        WebElement element1 = chromeDriver.findElement(By.xpath("//a[@href='#History']"));
        element1.click();
        WebElement element2 = chromeDriver.findElement(By.id("History"));
        String text = element2.getText();
        System.out.println("Get Text is : " +text);
        String title = chromeDriver.getTitle();
        System.out.println("Page Title is " +title);
        chromeDriver.close();
    }
}
