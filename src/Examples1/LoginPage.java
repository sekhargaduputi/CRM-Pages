package Examples1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
	
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.gecko.driver","D:/Testing Softwares/Suresh Sir Selinum/New Softwares&Jars/Browser/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://freecrm.com/"); 
		
		String tittle=driver.getTitle();
		System.out.println(tittle);
		
		if(driver.equals("free crm")){
			System.out.println("Tittle is match");
		}
		List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		
		/*for(int i=0;i<link.size();i++){
			WebElement s=link.get(i);
			System.out.println(s.getText());
		}*/
		for(WebElement a:link){
			System.out.println(a.getText());
		}
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		System.out.println("Login page Display");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sekhargaduputi@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sekhar@9676");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		
		System.out.println("Login successfully");
		
	
		driver.quit();
		
	
		
		
	}

}
