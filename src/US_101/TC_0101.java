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
        //Kullanici Akakce.com sitesini tarayıcıda açar.
        driver.get("https://www.akakce.com/");

        //Kullanici ana sayfada bulunan "Hesap Oluştur" seçenegine tıklar.
        WebElement createAccount = driver.findElement(By.linkText("Hesap Aç"));
        createAccount.click();

        //Kullanici isim bilgisini eksiksiz doldurur.
        WebElement name = driver.findElement(By.cssSelector("input[id='rnufn']"));
        name.sendKeys("Test");
        MyFunction.Wait(1);

        //Kullanici soyisim bilgisini eksiksiz doldurur.
        WebElement surName = driver.findElement(By.cssSelector("input[id='rnufs']"));
        surName.sendKeys("Nomads");
        MyFunction.Wait(1);

        //Kullanici email adresini eksiksiz doldurur.
        WebElement mail = driver.findElement(By.cssSelector("input[id='rnufe1']"));
        mail.sendKeys("testnomads01@gmail.com\n");
        MyFunction.Wait(1);

        //Kullanici email adresini tekrar eksiksiz doldurur.
        WebElement confirmMail = driver.findElement(By.cssSelector("input[id='rnufe2']"));
        confirmMail.sendKeys("testnomads01@gmail.com\n");
        MyFunction.Wait(1);

        //Kullanici eksiksiz sifre oluşturur.
        WebElement password = driver.findElement(By.cssSelector("input[id='rnufp1']"));
        password.sendKeys("Nomad07++");
        MyFunction.Wait(1);

        //Kullanici sifreyi tekrar doldurur.
        WebElement confirmPassword = driver.findElement(By.cssSelector("input[id='rnufp2']"));
        confirmPassword.sendKeys("Nomad07++");
        MyFunction.Wait(1);

        //Kullanici cinsiyet secenegini tiklar.
        WebElement gender = driver.findElement(By.cssSelector("input[id='rngm']"));
        gender.click();

        //Kullanici sehir bilgisini eksiksiz doldurur.
        WebElement city = driver.findElement(By.cssSelector("select[id='locpr']"));
        Select citySel = new Select(city);
        citySel.selectByValue("6");

        //Kullanici ilce bilgisini eksiksiz doldurur.
        WebElement city2 = driver.findElement(By.cssSelector("select[id='locds']"));
        Select city2select = new Select(city2);
        city2select.selectByValue("64");

        //Kullanici dogum tarihinin gun kutucugunu tiklar.
        WebElement day = driver.findElement(By.cssSelector("select[id='bd']"));
        Select dayselect = new Select(day);
        dayselect.selectByValue("10");

        //Kullanici dogum tarihinin ay kutucugunu tiklar.
        WebElement month = driver.findElement(By.cssSelector("select[id='bm']"));
        Select monthSelect = new Select(month);
        monthSelect.selectByValue("11");

        //Kullanici dogum tarihinin yil kutucugunu tiklar.
        WebElement year = driver.findElement(By.cssSelector("select[id='by']"));
        Select yearSelect = new Select(year);
        yearSelect.selectByValue("1938");

        //Kullanici kullanım sozlesmesi bilgilendirme kutucugunu tiklar.
        WebElement contract = driver.findElement(By.cssSelector("input[id='rnufpca']"));
        contract.click();

        //Kullanici hesap ac kutusunu tiklar.
        WebElement openAccount = driver.findElement(By.cssSelector("input[id='rfb']"));
        openAccount.click();

        WaitAndClose();
    }
}