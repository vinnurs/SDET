package mt_Project;

import java.awt.SecondaryLoop;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MA004 {
	@Test
	public void f() throws MalformedURLException, InterruptedException {
		DesiredCapabilities capability = new DesiredCapabilities();
        capability.setCapability(MobileCapabilityType.DEVICE_NAME, "Vinnu");
        capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capability.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capability);
        driver.get("https://magento.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@class = 'nav-menu-button js-menu-button visible-xs visible-sm']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@id='register']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Raymond");
       driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Bond");
        driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("raymond@bond.com");
        driver.hideKeyboard();
        driver.findElement(By.xpath("//select[@id='company_type']")).sendKeys("Is a merchant who sells online");
        driver.findElement(By.xpath("//select[@id='individual_role']")).sendKeys("Technical/developer");
        driver.findElement(By.xpath("//select[@id='country']")).sendKeys("India");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("RaymondBond@123");
        driver.hideKeyboard();
        driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("RaymondBond@123");
        driver.hideKeyboard();
        driver.findElement(By.xpath("//input[@id='agree_terms']")).click();
        Thread.sleep(3000);
     
	}
}
