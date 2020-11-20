package mt_Project;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MA004_1 {
  @Test
  public void f() throws MalformedURLException {
	  
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
      driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test123@nisha.com");
      String email1 = driver.findElement(By.xpath("//input[@id='email']")).getText();
      driver.hideKeyboard();
      driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Sunflowers@nvsr1995");
      driver.hideKeyboard();
      driver.findElement(By.xpath("//button[@id='send2']")).click();
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).isDisplayed();
      driver.findElement(By.xpath("//a[contains(text(),'Account Settings')]")).click();
      String email = driver.findElement(By.xpath("//input[@id='email']")).getText();
      Assert.assertEquals(email, email1);
      driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
  }
}
