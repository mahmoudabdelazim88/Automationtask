package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Fristscript {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\AMWAG\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
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
     driver.findElement(By.cssSelector("#createGlobalItem > span")).click();
     driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS );
     driver.findElement(By.cssSelector("#summary")).sendKeys("hello");
     driver.findElement(By.cssSelector("#create-issue-submit")).click();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
	}
}
