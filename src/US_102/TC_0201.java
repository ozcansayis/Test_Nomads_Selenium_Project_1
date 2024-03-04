package US_102;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_0201 extends BaseDriver {

    @Test

    public void TC_0201(){
        String Ad = "Test";
        // Kullanıcı, Akakce.com sitesine tarayıcı üzerinden giriş yapar.
        driver.get("https://www.akakce.com/");

        // Ana sayfada, sağ üst köşede bulunan "Giriş Yap" seçeneğine tıklar
        WebElement GirisYap = driver.findElement(By.xpath("//*[@id='H_rl_v8']/a[2]"));
        GirisYap.click();

        // Kullanıcı, kullanıcı Epostası ve şifresini doğru bir şekilde girer.
        WebElement Eposta = driver.findElement(By.cssSelector("input[id='life']"));
        Eposta.sendKeys("testnomads01@gmail.com");

        // Kullanıcı, kullanıcı şifresini doğru bir şekilde girer.
        WebElement Sifre = driver.findElement(By.cssSelector("input[id='lifp'][type='password']"));
        Sifre.sendKeys("Nomad07++");

        // Kullanıcı ekranda gözüken "Giriş Yap" butonuna tıklar.
        driver.findElement(By.cssSelector("input[id='lfb'][type='submit']")).click();

        // Sağ üst köşede kullanıcı adının görüntülendiği alana bakar ve bu
        // kullanıcı adının, giriş yapılırken girilen kullanıcı adı ile aynı olup olmadığını kontrol eder.
        WebElement ad = driver.findElement(By.xpath("//div[@id='HM_v8']/i/a"));

        // Eğer kullanıcı adı doğru görünüyorsa, hesap doğrulama sürecinin başarıyla tamamlandığını onaylar.
        Assert.assertEquals(" Adlar uymadi", ad.getText(), Ad);

        WaitAndClose();
    }
}