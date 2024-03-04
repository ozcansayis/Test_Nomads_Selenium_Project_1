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

        //we click on the login button in order to enter the pre-created username and password.
        WebElement logIn = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("div[id^='H_'] a[rel='nofollow']+a"))));
        logIn.click();


        //in pursuit of landing in the login page we enter the credentials starting with our e-mail address.
        WebElement eMail = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("input[id='life']"))));
        eMail.sendKeys("testnomads01@gmail.com");

        //we keep on going entering the password.
        WebElement password = driver.findElement(By.cssSelector("input[class='t'][id='lifp']"));
        password.sendKeys("Nomad07++");

        WebElement logInButton = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='lfb']"))));
        logInButton.click();

        //to access the inbox section we first need to click the account button
        WebElement account = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#HM_v8 >i> a")));
        account.click();

       //once we hit the account button , dropdown section pops out and we get to hit 'mesajlarim' section.
        WebElement mesajlar = driver.findElement(By.cssSelector("ul[id='AL'] a[href='/akakcem/mesajlarim/']"));
        mesajlar.click();

        //right after we get into 'mesajlarim' section we get to check if there is a message popping up in case of an empty message box.
        WebElement inBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#C4w>div>p")));
        Assert.assertEquals("hata", "Listelenecek mesaj bulunamadı.", inBox.getText());

        WaitAndClose();
    }
}