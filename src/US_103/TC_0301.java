package US_103;

import Utility.BaseDriver;
import Utility.MyFunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_0301 extends BaseDriver {

    @Test
    public void Test() {
        //Kullanıcı Akakçe.com sitesi tarayıcı açar
        driver.get("https://www.akakce.com/");

        //Kullanıcı Giriş yap sayfasını tıklar
        WebElement Giris = driver.findElement(By.linkText("Giriş Yap"));
        Giris.click();
        MyFunction.Wait(1);

        //Kullanıcı mail bilgisini eksiksiz doldurur
        WebElement email = driver.findElement(By.cssSelector("input[name='life'][type='email']"));
        email.sendKeys("testnomads01@gmail.com");

        //Kullanıcı şifre bilgisini eksiksiz doldurur
        WebElement sifre = driver.findElement(By.cssSelector("input[id='lifp'][name='lifp']"));
        sifre.sendKeys("Nomad07++");

        //Kullanıcı Giriş yap butonuna tıklar
        WebElement girisyap = driver.findElement(By.cssSelector("[id='lfb']"));
        girisyap.click();

        //Kullanıcı hesabım butonuna tıklar
        WebElement hesabim = driver.findElement(By.xpath("//a[@title='Hesabım']"));
        hesabim.click();
        MyFunction.Wait(1);

        //Kullanıcı akakçe.com sitesinden çıkış yapar
        WebElement cikis = driver.findElement(By.xpath("//a[contains(text(),'Çık')]"));
        cikis.click();
        MyFunction.Wait(2);

        //Kullanıcı tekrar akakçe.com giriş sayfasına gelir
        WebElement Giris1 = driver.findElement(By.linkText("Giriş Yap"));
        Giris1.click();

        WaitAndClose();
    }
}