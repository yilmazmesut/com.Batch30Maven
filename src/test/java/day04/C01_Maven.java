package day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class C01_Maven {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // implicitlyWait= test boyunca her bir locator icin,  maximum yazilan zaman kadar bekler. 5 sn icinde bulamazsa
        // exception verir. daha erken bulursa 5 sn beklemesine gerek yok.
        // classin basinda implicitlyWait komutu yazmaliyiz.


    // 1- https://www.amazon.com/ sayfasina gidelim
        driver.get("https://www.amazon.com/");

    // 2- arama kutusunu locate edelim
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

    // 3- “Samsung headphones” ile arama yapalim
        aramaKutusu.sendKeys("Samsung headphones" + Keys.ENTER);

    // 4- Bulunan sonuc sayisini yazdiralim
        //WebElement sonucYazisiElementi = driver.findElement(By.className("a-section a-spacing-small a-spacing-top-small"));
        // By.className ile locate ettigimiz webelementinde class attribute'nun degerinde bosluk varsa locator saglikli calismayabilir.
        WebElement sonucYazisiElementi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println("sonucYazisiElementi = " + sonucYazisiElementi.getText());

   // 5- Ilk urunu tiklayalim
        // WebElement ilkUrunElementi = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'] [1]"));
        // sadece bir click yapacak isek webelement olusturmaya ve assign etmeye gerek yok.
        // direk locale edip click yapabiliz :
        driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'] [1]")).click();

    // 6- aramasonuclari ekranina gidelim:
        driver.navigate().back();

    // 7- Sayfadaki tum basliklari yazdiralim
        List <WebElement> urunlerListesi = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        for (WebElement w : urunlerListesi) {
            System.out.println(w.getText());
        }



    }
}
