package US_104;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class TC_0401 extends BaseDriver {
    @Test
    public void TC_401() {
        //siteye yönlendirildi
        driver.get("https://www.akakce.com/");
        //giriş yap butonuna tıklandı
        WebElement girisYap = driver.findElement(By.linkText("Giriş Yap"));
        girisYap.click();
        //kullanıcıdan email ve şifresi yazılıp 'Giriş yap' butonuna tıkla
        WebElement email = driver.findElement(By.cssSelector("[id='life']"));
        email.sendKeys("testnomads01@gmail.com");
        WebElement sifre = driver.findElement(By.cssSelector("[id='lifp']"));
        sifre.sendKeys("Nomad07++");
        WebElement girisYap2 = driver.findElement(By.cssSelector("[id='lfb']"));
        girisYap2.click();

        WaitAndClose();
    }
}