package ro.tefacprogramator.m4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    static WebDriver driver;

    @BeforeAll
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test
    public void testAddToy() {
        driver.get("http://localhost:3000");

        driver.findElement(By.cssSelector("input[name='toyID']")).sendKeys("6");
        driver.findElement(By.cssSelector("input[name='description']")).sendKeys("Test");
        driver.findElement(By.cssSelector("input[name='price']")).sendKeys("100");
        driver.findElement(By.cssSelector("input[name='typeID']")).sendKeys("2");
        driver.findElement(By.cssSelector("input[name='categoryID']")).sendKeys("1");

        driver.findElement(By.cssSelector(".js_submit_btn")).sendKeys(Keys.ENTER);


        String result = driver.findElement(By.cssSelector("#status")).getText();
        
        assertEquals("success", result);
    }

    @Test
    public void testRows() {
        driver.get("http://localhost:3000");
        List<WebElement> rows = (List<WebElement>) driver.findElement(By.cssSelector("[class='table table-condensed table-hover event-list'] tr"));
        int count = rows.size();
        if(count > 3) {
            assertEquals(3, count);
        }

    }

    @AfterAll
    public static void closeUp() {
        driver.quit();
    }
}
