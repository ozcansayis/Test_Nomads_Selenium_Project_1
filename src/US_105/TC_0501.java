package US_105;

import Utility.BaseDriver;
import Utility.MyFunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_0501 extends BaseDriver {
    @Test
    public void TC_0501() {
        driver.get("https://www.akakce.com/");

        WebElement login = driver.findElement(By.linkText("Giriş Yap"));
        login.click();

        WebElement email = driver.findElement(By.cssSelector("[id='life']"));
        email.sendKeys("testnomads01@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("[id='lifp']"));
        password.sendKeys("Nomad07++");

        WebElement loginButton = driver.findElement(By.cssSelector("[id='lfb']"));
        loginButton.click();
        MyFunction.Wait(1);

        WebElement myAccount = driver.findElement(By.cssSelector("div[id='HM_v8'] a"));
        // WebElement myAccount = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#HM_v8 >i> a")));
        myAccount.click();
        MyFunction.Wait(1);

        WebElement myOrders = driver.findElement(By.cssSelector("[id='AL'] a[href='/akakcem/siparislerim/']"));
        myOrders.click();

        WebElement message = driver.findElement(By.cssSelector("[class='no-record']"));
        Assert.assertEquals("Mesaj bulunamadı.", "Kayıtlı siparişiniz bulunmuyor.", message.getText());

        WaitAndClose();
    }
}
