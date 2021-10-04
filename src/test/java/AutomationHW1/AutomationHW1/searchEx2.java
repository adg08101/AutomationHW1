package AutomationHW1.AutomationHW1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjetcsSG.POSearchGoogle;


public class searchEx2 {
		
	public WebDriver driver;
	public POSearchGoogle objectsearch;
	
	@Before
	public void setUp() 
	{
		System.setProperty("webdriver.chrome.driver", ".//Driver/chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize(); 
		driver.get("https://www.google.com");
		
		objectsearch = new POSearchGoogle(driver);
	}
	
	@Test	
	public void testGooglePage()
	{
		objectsearch.TypeInputField("uciencia 2021"); //el user escribe el criterio de búsqueda
		objectsearch.click(); // el user da clic en el Search buttton
		
		List<WebElement> list = driver.findElements(By.tagName("h3")); //hace la lista de los elementos h3
		
		if (list.get(0).getText().contains("uciencia")) //Si el título del primer elemento contiene uciencia 2021
		{
			System.out.print(list.get(0).getText()); //imprime el título de la página
			list.get(0).click();//da click en el primer elemento de la lista
		}
		else 
		{
			System.out.print("The search did not return results according to the criteria");
		}
		
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS); //Para interrumpir la llamada de búsqueda
			
		
	}
	
	

	@After
	public void tearDowm()
	{
		driver.quit();
	}
	

}
