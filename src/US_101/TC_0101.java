package US_101;

import Utility.BaseDriver;
import Utility.MyFunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC_0101 extends BaseDriver {
    @Test
    public void TC_0101() {

        driver.get("https://www.akakce.com/");
        MyFunction.Wait(1);

        WebElement createAccount = driver.findElement(By.linkText("Hesap Aç"));
        createAccount.click();
        MyFunction.Wait(1);

        WebElement name = driver.findElement(By.cssSelector("input[id='rnufn']"));
        name.sendKeys("Test");
        MyFunction.Wait(1);

        WebElement surName = driver.findElement(By.cssSelector("input[id='rnufs']"));
        surName.sendKeys("Nomads");
        MyFunction.Wait(1);

        WebElement mail = driver.findElement(By.cssSelector("input[id='rnufe1']"));
        mail.sendKeys("testnomads01@gmail.com\n");
        MyFunction.Wait(1);

        WebElement confirmMail = driver.findElement(By.cssSelector("input[id='rnufe2']"));
        confirmMail.sendKeys("testnomads01@gmail.com\n");
        MyFunction.Wait(1);

        WebElement password = driver.findElement(By.cssSelector("input[id='rnufp1']"));
        password.sendKeys("Nomad44++");
        MyFunction.Wait(1);

        WebElement confirmPassword = driver.findElement(By.cssSelector("input[id='rnufp2']"));
        confirmPassword.sendKeys("Nomad44++");
        MyFunction.Wait(1);

        WebElement gender = driver.findElement(By.cssSelector("input[id='rngm']"));
        gender.click();
        MyFunction.Wait(1);

        WebElement city = driver.findElement(By.cssSelector("select[id='locpr']"));
        Select citySel = new Select(city);
        citySel.selectByValue("9");
        MyFunction.Wait(1);

        WebElement city2 = driver.findElement(By.cssSelector("select[id='locds']"));
        Select city2select = new Select(city2);
        city2select.selectByValue("116");
        MyFunction.Wait(1);

        WebElement day = driver.findElement(By.cssSelector("select[id='bd']"));
        Select dayselect = new Select(day);
        dayselect.selectByValue("19");
        MyFunction.Wait(1);

        WebElement month = driver.findElement(By.cssSelector("select[id='bm']"));
        Select monthSelect = new Select(month);
        monthSelect.selectByValue("7");
        MyFunction.Wait(1);

        WebElement year = driver.findElement(By.cssSelector("select[id='by']"));
        Select yearSelect = new Select(year);
        yearSelect.selectByValue("1986");

        WebElement contract = driver.findElement(By.cssSelector("input[id='rnufpca']"));
        contract.click();
        MyFunction.Wait(1);

        WebElement discount = driver.findElement(By.cssSelector("input[id='rnufnee']"));
        discount.click();
        MyFunction.Wait(1);

        WebElement openAccount = driver.findElement(By.cssSelector("input[id='rfb']"));
        openAccount.click();
        MyFunction.Wait(1);

        WaitAndClose();

    }
}