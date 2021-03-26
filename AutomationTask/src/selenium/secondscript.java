package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class secondscript {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\AMWAG\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     Actions action = new Actions(driver);
     driver.manage().window().maximize();
     driver.get("https://www.google.com/");
     driver.get("https://mahmoudproject.atlassian.net");
     driver.findElement(By.cssSelector("#username")).sendKeys("jamid56653@irahada.com");
     driver.findElement(By.cssSelector("#login-submit > span > span")).click();
     driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS );
     driver.findElement(By.cssSelector("#password")).sendKeys("Poject123");
     driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS );
     driver.findElement(By.cssSelector("#login-submit > span > span")).click();
     driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS );
     driver.findElement(By.cssSelector("#jira-frontend > div.sc-cvbbAY.dNpdKE > div > div.sc-eHgmQL.ihIdlP > div > header > div > div > div > div > div > div > div > div:nth-child(1) > div > input")).click();
     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS );
     driver.findElement(By.cssSelector("#jira-frontend > div.sc-cvbbAY.dNpdKE > div > div.sc-eHgmQL.ihIdlP > div > header > div > div > div > div > div > div > div > div:nth-child(1) > div > input")).sendKeys("PROJ-6");
     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
     action.sendKeys(Keys.TAB).build().perform();
     action.sendKeys(Keys.ENTER).build().perform();
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
     
    
	}
}