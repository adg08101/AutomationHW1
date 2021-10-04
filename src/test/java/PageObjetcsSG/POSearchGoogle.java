package PageObjetcsSG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class POSearchGoogle 
{	
	public WebDriver driver;
	
	//Localizadores
		By searchinputfield = By.name("q");
		By searchbtn = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]");
		By elementlist = By.tagName("h3"); 
		
		
	
	public POSearchGoogle(WebDriver driver) 
	{
		this.driver = driver; //inicializar el objeto de tipo WebElement driver
	}
	
	public WebDriver BaseConnection() 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe"); //para que reconozca el objeto y sepa dónde está el ejecutable
		driver = new ChromeDriver (); //Para crear una nueva instancia del navegador
		return driver;
	}
	
		
	public void TypeInputField(String inputText) //para escribir en un input field
	{
		driver.findElement(searchinputfield).clear();//primero limpiar el campo
		driver.findElement(searchinputfield).sendKeys(inputText);//luego escribir el criterio de búsqueda
	}
	
	public void click() //para hacer click en un elemento btn o link...
	{
		driver.findElement(searchbtn).click();//hacer clic en el botón Search 
	}
	
	public void OpenPage (String URL)
	{
		driver.get(URL);
	}
	
				
	
}