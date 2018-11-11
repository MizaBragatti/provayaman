package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AdicionarContaPO {
	
	private static WebDriver driver = LoginPO.driver;
	
	private static WebElement element = null;
	
	public static WebElement botao_Contas() {		
		element = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/a"));
		return element;
	}
	
	public static WebElement botao_Adicionar() {		
		element = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/ul/li[1]/a"));
		return element;
	}
	
	public static WebElement validar() {		
		element = driver.findElement(By.xpath("/html/body/div[1]"));
		return element;
	}
	
	public static WebElement form_NomeConta() {		
		element = driver.findElement(By.xpath("//*[@id=\"nome\"]"));
		return element;
	}
	
	public static WebElement botao_Salvar() {		
		element = driver.findElement(By.xpath("/html/body/div[2]/form/div[2]/button"));
		return element;
	}
	
	public static void fecharNavegador() {		
		driver.quit();
	}
	

}
