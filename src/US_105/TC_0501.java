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
        // Akakce.com website opened in browser.
        driver.get("https://www.akakce.com/");

        // Clicked on "Giriş Yap" on the home page.
        WebElement login = driver.findElement(By.linkText("Giriş Yap"));
        login.click();

        // Entered valid information from the test data.
        WebElement email = driver.findElement(By.cssSelector("[id='life']"));
        email.sendKeys("technodeneme007@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("[id='lifp']"));
        password.sendKeys("Deneme007");
        MyFunction.Wait(1);

        // Clicks on the "Login" button.
        WebElement loginButton = driver.findElement(By.cssSelector("[id='lfb']"));
        loginButton.click();
        MyFunction.Wait(1);

        // Navigated to the profile page by clicking on the "My Account" link from the account section located at the top right corner homepage.
        WebElement myAccount = driver.findElement(By.cssSelector("div[id='HM_v8'] a"));
        // WebElement myAccount = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#HM_v8 >i> a")));
        myAccount.click();
        MyFunction.Wait(1);

        // On the profile page, click on the "My Orders" link to be redirected to the order list.
        WebElement myOrders = driver.findElement(By.cssSelector("[id='AL'] a[href='/akakcem/siparislerim/']"));
        myOrders.click();

        // If the order list is empty, it checks if an appropriate message is displayed.
        WebElement message = driver.findElement(By.cssSelector("[class='no-record']"));
        Assert.assertTrue("Mesaj bulunamadı.", message.getText().equals("Kayıtlı siparişiniz bulunmuyor."));

        WaitAndClose();
    }
}
