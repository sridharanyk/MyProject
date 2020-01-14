package com.highaltitude;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GT Sanatorium\\Desktop\\Sridharan Project\\Project\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		TakesScreenshot tk =(TakesScreenshot)driver;
		
		
		
		driver.navigate().to("https://www.altitudelifehacks.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		File s = tk.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\GT Sanatorium\\Desktop\\Sridharan Project1\\launch.png");
		FileUtils.copyFile(s, d);
		
	
		driver.findElement(By.id("customer_login_link")).click();
		Thread.sleep(5000);
		File s1 = tk.getScreenshotAs(OutputType.FILE);
		File d1 = new File("C:\\Users\\GT Sanatorium\\Desktop\\Sridharan Project1\\LoginPage.png");
		FileUtils.copyFile(s1, d1);
		
		driver.findElement(By.id("CustomerEmail")).sendKeys("sridharanyk@gmail.com");
		
		driver.findElement(By.id("CustomerPassword")).sendKeys("1234567890");
		
		WebElement a = driver.findElement(By.className("btn"));
		js.executeScript("arguments[0].click()",a);
	
		Thread.sleep(3000);
		File s2 = tk.getScreenshotAs(OutputType.FILE);
		File d2 = new File("C:\\Users\\GT Sanatorium\\Desktop\\Sridharan Project1\\afterLogin.png");
		FileUtils.copyFile(s2, d2);
		
		WebElement b = driver.findElement(By.id("SiteNavLabel-shoes"));
		js.executeScript("arguments[0].click()",b);
		
		Thread.sleep(3000);
		WebElement c = driver.findElement(By.xpath("(//a[@href='/collections/hi-sports-shoes'])[2]"));
		js.executeScript("arguments[0].click()", c);
		
		driver.findElement(By.xpath("//a[@href='/collections/hi-sports-shoes/products/absecon']")).click();
		
		driver.findElement(By.id("AddToCart-product-template")).click();
		Thread.sleep(5000);
		File s3 = tk.getScreenshotAs(OutputType.FILE);
		File d3 = new File("C:\\Users\\GT Sanatorium\\Desktop\\Sridharan Project1\\CheckoutPage.png");
		FileUtils.copyFile(s3, d3);
	}
	
	

}
