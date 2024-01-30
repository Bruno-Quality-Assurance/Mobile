package Inicio;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Inicio {

	public static void main(String[] args) {
		
		try {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("app", new File("C:\\Users\\Auditeste0367\\Downloads\\app-release.apk"));
			cap.setCapability("deviceName", "JG");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "13");
			cap.setCapability("unicodeKeyboard", true);
			//cap.setCapability("noReset", "True");
			AppiumDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);		

			Thread.sleep(5000);
			//==========LOGIN===================================================================		
			MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
			el1.click();
			el1.sendKeys("aluno3@jg.com");
			
			el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
			el1.click();
			el1.sendKeys("JGs$cret1971.");
			
			el1 = (MobileElement) driver.findElementByAccessibilityId("ENTRAR");
			el1.click();
			//====================================================================================
			
			
			
			
			}catch (Exception e) {System.out.println(e.getMessage());}

	}

}
