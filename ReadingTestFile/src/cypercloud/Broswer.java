package cypercloud;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;

public class Broswer {

	public static void main(String[] args) throws Exception{
		
		Reading r=new Reading();
		
		ArrayList<String> array=r.getUserDefied();
		
		
		System.out.println(array);
		
		
		WebDriver driver =new FirefoxDriver(); 
		
		driver.get("https://gmail.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		for(int i=0;i<=array.size();i=i+2){
			
		
		driver.findElement(By.id("Email")).sendKeys(array.get(i));
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("PersistentCookie")).click();
		driver.findElement(By.id("Passwd")).sendKeys(array.get(i+1));
	    driver.findElement(By.id("signIn")).click();
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
	    driver.findElement(By.xpath("//*[@id='gb_71']")).click();
		
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://gmail.com");
		}
		
		//driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		
		
		

	}

}
