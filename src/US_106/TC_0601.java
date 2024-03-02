package US_106;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TC_0601 extends BaseDriver {
    @Test
    public void x() {
        driver.get("https://www.akakce.com/");

        WebElement logIn = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("div[id^='H_'] a[rel='nofollow']+a"))));
        logIn.click();


        WebElement eMail = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("input[id='life']"))));
        eMail.sendKeys("testnomads01@gmail.com");


        WebElement password = driver.findElement(By.cssSelector("input[class='t'][id='lifp']"));
        password.sendKeys("Nomad44++");


        WebElement logInButton = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='lfb']"))));
        logInButton.click();


        WebElement account = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#HM_v8 >i> a")));
        account.click();


        WebElement mesajlar = driver.findElement(By.cssSelector("ul[id='AL'] a[href='/akakcem/mesajlarim/']"));
        mesajlar.click();

        WebElement inBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#C4w>div>p")));
        Assert.assertTrue("hata", inBox.getText().equals("Listelenecek mesaj bulunamadı."));
        WaitAndClose();
    }
}