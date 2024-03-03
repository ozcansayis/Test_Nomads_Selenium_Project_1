package US_103;

import Utility.BaseDriver;
import Utility.MyFunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_0301 extends BaseDriver {

    @Test
    public void Test() {
        driver.get("https://www.akakce.com/");

        WebElement Giris = driver.findElement(By.linkText("Giriş Yap"));
        Giris.click();
        MyFunction.Wait(1);

        WebElement email = driver.findElement(By.cssSelector("input[name='life'][type='email']"));
        email.sendKeys("yag@gmail.com.tr");

        WebElement sifre = driver.findElement(By.cssSelector("input[id='lifp'][name='lifp']"));
        sifre.sendKeys("890ıop.aA");

        WebElement girisyap = driver.findElement(By.cssSelector("[id='lfb']"));
        girisyap.click();

        WebElement hesabim = driver.findElement(By.xpath("//a[@title='Hesabım']"));
        hesabim.click();
        MyFunction.Wait(1);

        WebElement cikis = driver.findElement(By.xpath("//a[contains(text(),'Çık')]"));
        cikis.click();
        MyFunction.Wait(2);


        WebElement Giris1 = driver.findElement(By.linkText("Giriş Yap"));
        Giris1.click();

        WaitAndClose();
    }
}


