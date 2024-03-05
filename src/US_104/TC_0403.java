package US_104;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TC_0403 extends BaseDriver {
    @Test
    public void TC_0403() {
        // Siteye yönlendirildi
        driver.get("https://www.akakce.com/");
        // Giriş yap butonuna tıklandı
        WebElement girisYap = driver.findElement(By.linkText("Giriş Yap"));
        girisYap.click();
        // Email ve şifre yazılmadan giriş yap butonuna tıklandı
        WebElement girisYap2 = driver.findElement(By.cssSelector("[id='lfb']"));
        girisYap2.click();
        WebElement buton = driver.findElement(By.cssSelector("button[onclick='Modal_v8.close()']"));
        wait.until(ExpectedConditions.elementToBeClickable(buton));
        // Hata mesajının kontrolü sağlandı
        if (buton.isDisplayed()) {
            System.out.println("Giriş yapılamadı test başarılı!");
        } else
            System.out.println("Test başarısız!");

        WaitAndClose();
    }
}