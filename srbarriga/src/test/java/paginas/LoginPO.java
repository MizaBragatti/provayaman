package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPO {
	
	public static WebDriver driver = new ChromeDriver();;
	
	private static WebElement element = null;
	
	public static void abre_Navegador(String pagina) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver.get("https://srbarriga.herokuapp.com/"+pagina);
	}
	
	public static WebElement form_email() {		
		element = driver.findElement(By.id("email"));
		return element;
	}
	
	public static WebElement form_senha() {		
		element = driver.findElement(By.id("senha"));
		return element;
	}
	
	public static WebElement botao_Entrar() {		
		element = driver.findElement(By.xpath("/html/body/div[2]/form/button"));
		return element;
	}
	
	public static WebElement validar() {		
		element = driver.findElement(By.xpath("/html/body/div[1]"));
		return element;
	}
	
	public static void fecharNavegador() {		
		driver.quit();
	}
	

}
