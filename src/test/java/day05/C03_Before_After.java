package day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C03_Before_After {

    // uc test methodu yapin
    // 1. amazon.com
    // 2. techproeducation'a
    // 3. facebook'a gidin

    // eger her test method'u icin yeni bir sayfa acilsin ve test methodu sonunda kapansin istiyorsak
    // @Before ve @After notasyonlari kullanilmali

    WebDriver driver;

    @Before
    public void setup() {       // //Befor class'i static olmak zorunda degildir..
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");
    }

    @Test
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());
    }

    @Test
    public void techproesTesti() {
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());
    }

    @Test
    public void facebookTesti() {
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());
    }

    @After
    public void tearDown() {    // Befor class'i static olmak zorunda degildir..
        driver.close();
    }
}
