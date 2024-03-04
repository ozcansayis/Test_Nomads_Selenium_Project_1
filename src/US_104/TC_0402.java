package US_104;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_0402 extends BaseDriver {
    @Test
    public void TC_0402() {
        //siteye yönlendirildi
        driver.get("https://www.akakce.com/");
        //giriş yap butonuna tıklandı
        WebElement girisYap = driver.findElement(By.linkText("Giriş Yap"));
        girisYap.click();
        //geçersiz email ve şifre yazıldı giriş yap butonuna tıklandı
        WebElement email = driver.findElement(By.cssSelector("[id='life']"));
        email.sendKeys("testnomads01@gmail.com");
        WebElement sifre = driver.findElement(By.cssSelector("[id='lifp']"));
        sifre.sendKeys("Nomad06++");
        WebElement girisYap2 = driver.findElement(By.cssSelector("[id='lfb']"));
        girisYap2.click();
        //hata mesajının kontrolü sağlandı
        WebElement buton= driver.findElement(By.cssSelector("button[onclick='Modal_v8.close()']"));
        if (buton.isDisplayed()) {
            System.out.println("Giriş yapılamadı test başarılı!!!");
        }
        else System.out.println("Test başarısız!");

        WaitAndClose();
    }
}

