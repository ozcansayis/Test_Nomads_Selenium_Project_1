package US_107;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TC_0701 extends BaseDriver {
    @Test
    public void TC_0701() {
        driver.get("https://www.akakce.com/");

        driver.findElement(By.xpath("//a[text()='Giriş Yap']")).click();
        driver.findElement(By.cssSelector("input[id='life']")).sendKeys("testnomads01@gmail.com");
        driver.findElement(By.cssSelector("input[id='lifp']")).sendKeys("Nomad44++");
        driver.findElement(By.xpath("//input[@id='lfb']")).click();
        driver.findElement(By.linkText("Test")).click();
        driver.findElement(By.linkText("Hesabımı Sil")).click();
        driver.findElement(By.cssSelector("input[id='p']")).sendKeys("Nomad44++" + Keys.ENTER);

        WebElement condition = driver.findElement(By.cssSelector("div[id='C4w'] i"));
        Assert.assertEquals("Hesap silinemedi!", "Hesabın silindi", condition.getText().substring(0, 15));

        WaitAndClose();
    }
}