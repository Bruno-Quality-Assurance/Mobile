package Steps;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.apache.tools.ant.taskdefs.Copy;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import Massa.MassaTeste;
import PageObject.Elements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;



public class Step {

	PageObject.Elements obj = new Elements();
	Massa.MassaTeste mt = new MassaTeste();
	
	public AppiumDriver Inicia_Apk() {
		
		AppiumDriver driver = null;
		
		try {
			
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("app", new File("C:\\Users\\Auditeste0367\\Downloads\\app-release.apk"));
			cap.setCapability("deviceName", "JG");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "13");
			cap.setCapability("unicodeKeyboard", true);
			//cap.setCapability("noReset", "True");
			driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);		

			Thread.sleep(5000);
			
			
			
		} catch (Exception e) {System.out.println(e.getMessage());}
		return driver;
		
		
		
	}

//================================================================================================
	
public Boolean Login(AppiumDriver driver) {
	
	try {
		
		//Usuario
		driver.findElementByXPath(obj.Po_Usuario()).click();
		driver.findElementByXPath(obj.Po_Usuario()).sendKeys(mt.Massa_Usuario());

		//Senha
		driver.findElementByXPath(obj.Po_Senha()).click();
		driver.findElementByXPath(obj.Po_Senha()).sendKeys(mt.Massa_Senha());
		
		//Entrar
		driver.findElementByAccessibilityId(obj.Po_Entrar()).click();
		Thread.sleep(5000);
		
		return true;
	}catch (Exception e) {System.out.println(e.getMessage()); return false;}
	
	
}

//============================================================================================

public boolean Acessa_Menu(AppiumDriver driver, String Menu) {
	
	try {
		
		switch (Menu) {

		case "Escola":
			driver.findElementByAccessibilityId("Escola").click();
			break;

		case "Minha Trilha":
			driver.findElementByAccessibilityId("Minha Trilha").click();
			break;
			
		case "Biblioteca":
			driver.findElementByAccessibilityId("Biblioteca").click();
			break;
			
		default:
			break;
		}
		
	
		
		return true;
	}catch (Exception e) {System.out.println(e.getMessage());return false;}
	
}
//===========================================================================

public void screenshot(String path_screenshot,String Cenario, AppiumDriver driver) throws IOException{
    File srcFile=driver.getScreenshotAs(OutputType.FILE);
    File targetFile=new File(path_screenshot + Cenario +".jpg");
    FileUtils.copyFile(srcFile,targetFile);
}
}
