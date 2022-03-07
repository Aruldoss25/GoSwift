package techListic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoSignUp {

	@Test
	public void signUp() {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
		driver.findElement(By.name("firstname")).sendKeys("Aruldoss");
		
		driver.findElement(By.name("lastname")).sendKeys("Muthuraj");
		
		driver.findElement(By.id("sex-0")).click();
		
		
		driver.findElement(By.id("exp-0")).click();
		
		driver.findElement(By.id("datepicker")).sendKeys("25/11/1993");
		
		driver.findElement(By.id("profession-1")).click();
		
		driver.findElement(By.id("tool-2")).click();
		
		WebElement continent = driver.findElement(By.id("continents"));
		
		Select dropDown= new Select(continent);
		
		dropDown.selectByVisibleText("Asia");
		
		
		WebElement commands = driver.findElement(By.id("selenium_commands"));
		
		Select dropDown2= new Select(commands);
		dropDown2.selectByVisibleText("WebElement Commands");
		
		
		WebElement photo = driver.findElement(By.xpath("//input[@class=\"input-file\"]"));
		photo.sendKeys("C:\\Users\\Aruldoss\\Desktop\\goswift.JPG");
		
		
		String attribute = driver.findElement(By.xpath("//a[text()=\"Click here to Download File\"]")).getAttribute("href");
        System.out.println(attribute);
	}
}
