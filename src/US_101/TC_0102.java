package US_101;

import Utility.BaseDriver;
import Utility.MyFunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TC_0102 extends BaseDriver {
    @Test
    public void TC_0102() {

        driver.get("https://www.akakce.com/");
        MyFunction.Wait(1);

        WebElement createAccount = driver.findElement(By.linkText("Hesap Aç"));
        createAccount.click();
        MyFunction.Wait(1);

        WebElement name = driver.findElement(By.cssSelector("input[id='rnufn']"));
        name.sendKeys("Ümit");
        MyFunction.Wait(1);

        WebElement surName = driver.findElement(By.cssSelector("input[id='rnufs']"));
        surName.sendKeys("eser");
        MyFunction.Wait(1);

        WebElement mail = driver.findElement(By.cssSelector("input[id='rnufe1']"));
        mail.sendKeys("testnomads01@gmail.com");
        MyFunction.Wait(1);

        WebElement confirmMail = driver.findElement(By.cssSelector("input[id='rnufe2']"));
        confirmMail.sendKeys("testnomads02@gmail.com");
        MyFunction.Wait(1);

        WebElement password = driver.findElement(By.cssSelector("input[id='rnufp1']"));
        password.sendKeys("Nomad07++");
        MyFunction.Wait(1);

        WebElement confirmPassword = driver.findElement(By.cssSelector("input[id='rnufp2']"));
        confirmPassword.sendKeys("Nomad07++");
        MyFunction.Wait(1);

        //WebElement gender = driver.findElement(By.cssSelector("input[id='rngm']"));
        //gender.click();
        //MyFunction.Wait(1);
        //cinsiyet boş bırakılmıştır.

        WebElement city = driver.findElement(By.cssSelector("select[id='locpr']"));
        Select citySel = new Select(city);
        citySel.selectByValue("9");
        MyFunction.Wait(1);

        WebElement city2 = driver.findElement(By.cssSelector("select[id='locds']"));
        Select city2select = new Select(city2);
        city2select.selectByValue("116");
        MyFunction.Wait(1);

        // WebElement day = driver.findElement(By.cssSelector("select[id='bd']"));
        // Select dayselect = new Select(day);
        // dayselect.selectByValue("19");
        // MyFunction.Wait(1);
        //dogum tarihleri boş birakilmistir.

        // WebElement month = driver.findElement(By.cssSelector("select[id='bm']"));
        // Select monthSelect = new Select(month);
        // monthSelect.selectByValue("7");
        // MyFunction.Wait(1);
        //dogum tarihleri boş birakilmistir.

        // WebElement year = driver.findElement(By.cssSelector("select[id='by']"));
        // Select yearSelect = new Select(year);
        // yearSelect.selectByValue("1986");
        // dogum tarihleri boş birakilmistir.

        WebElement contract = driver.findElement(By.cssSelector("input[id='rnufpca']"));
        contract.click();
        MyFunction.Wait(1);

        WebElement discount = driver.findElement(By.cssSelector("input[id='rnufnee']"));
        discount.click();
        MyFunction.Wait(1);

        WebElement openAccount = driver.findElement(By.cssSelector("input[id='rfb']"));
        openAccount.click();
        MyFunction.Wait(1);

        List<WebElement> fault = driver.findElements(By.cssSelector("[class='alertX t2'] p"));
        if (fault.isEmpty()) {
            System.out.println("Kayıt başarılı!");
        } else
            System.out.println(fault.getFirst().getText());
//        Assert.assertFalse("Kayıt başarılı!", fault.isEmpty());

        WaitAndClose();
    }
}