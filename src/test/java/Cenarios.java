import java.io.IOException;

import org.junit.Test;

import Steps.Step;
import io.appium.java_client.AppiumDriver;

public class Cenarios {

	Step s = new Step();

	@Test
	public void CT001_Acessa_Escola() throws IOException {
		
		AppiumDriver driver = s.Inicia_Apk();
		s.Login(driver);
		s.Acessa_Menu(driver, "Escola");
		s.screenshot("./target/","CT001_Acessa_Escola", driver);			
	}
	
	@Test
	public void CT002_Acessa_Minha_Trilha() throws IOException{
		
		AppiumDriver driver = s.Inicia_Apk();
		s.Login(driver);
		s.Acessa_Menu(driver, "Minha Trilha");	
		s.screenshot("./target/","CT002_Acessa_Minha_Trilha", driver);
	}
	
	@Test
	public void CT003_Acessa_Biblioteca() throws IOException{
		
		AppiumDriver driver = s.Inicia_Apk();
		s.Login(driver);
		s.Acessa_Menu(driver, "Biblioteca");
		s.screenshot("./target/","CT003_Acessa_Biblioteca", driver);
	}
	
	
}
