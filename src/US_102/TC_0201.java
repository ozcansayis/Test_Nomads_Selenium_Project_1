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
        driver.get("https://www.akakce.com/");

        WebElement GirisYap = driver.findElement(By.xpath("//*[@id='H_rl_v8']/a[2]"));
        GirisYap.click();

        WebElement Eposta = driver.findElement(By.cssSelector("input[id='life']"));
        Eposta.sendKeys("testnomads01@gmail.com");

        WebElement Sifre = driver.findElement(By.cssSelector("input[id='lifp'][type='password']"));
        Sifre.sendKeys("Nomad07++");

        driver.findElement(By.cssSelector("input[id='lfb'][type='submit']")).click();

        WebElement ad = driver.findElement(By.xpath("//div[@id='HM_v8']/i/a"));

        Assert.assertEquals(" Adlar uymadi", ad.getText(), Ad);

        WaitAndClose();

    }
}