package US_105;

import Utility.MyFunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utility.BaseDriver.WaitAndClose;
import static Utility.BaseDriver.driver;

public class TC_0501 {
    @Test
    public void TC_0501() {
        driver.get("https://www.akakce.com/");

        WebElement login = driver.findElement(By.linkText("Giriş Yap"));
        login.click();

        WebElement email = driver.findElement(By.cssSelector("[id='life']"));
        email.sendKeys("technodeneme007@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("[id='lifp']"));
        password.sendKeys("Deneme007");
        MyFunction.Wait(1);

        WebElement loginButton = driver.findElement(By.cssSelector("[id='lfb']"));
        loginButton.click();
        MyFunction.Wait(1);

        WebElement myAccount = driver.findElement(By.cssSelector("div[id='HM_v8'] a"));
        //  WebElement myAccount = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#HM_v8 >i> a")));
        myAccount.click();
        MyFunction.Wait(1);

        WebElement myOrders = driver.findElement(By.cssSelector("[id='AL'] a[href='/akakcem/siparislerim/']"));
        myOrders.click();

        WebElement message = driver.findElement(By.cssSelector("[class='no-record']"));
        Assert.assertTrue("Mesaj bulunamadı.", message.getText().equals("Kayıtlı siparişiniz bulunmuyor."));

        WaitAndClose();
    }
}
