import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DemoTest {
    @Test
    public void startTest() throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rocket-dev.k12techrepairs.com/tickets/ailGOl");
        driver.findElement(By.xpath("//span[normalize-space()='Maintenance']")).click();
        Thread.sleep(5000);
        //choose maintamce
        driver.findElement(By.cssSelector("label[for='opt-1']")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[name='234']")).click();
        //fillimg form
        driver.findElement(By.cssSelector("input[placeholder='Name*']")).sendKeys("Arun");
        driver.findElement(By.cssSelector("input[placeholder='Email*']")).sendKeys("akr7205@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Room No. *']")).sendKeys("107");
        driver.findElement(By.cssSelector("input[placeholder='Student No.']")).sendKeys("23500");
        driver.findElement(By.cssSelector("input[placeholder='Ticket Title *']")).sendKeys("tickettile");
        //clicking captcha


        driver.findElement(By.cssSelector(".SaveBtn.mt-2")).click();



    }
}
