package Infosys.Ikea.TESTNG;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebMathsDivide {
 @Test
 public void Divide() throws IOException {
	 
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\drivers\\chromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		  driver.manage().window().maximize();
		 FileReader reader = new FileReader ("C:\\Users\\Admin\\eclipse-workspace\\Ikea\\src\\main\\java\\Infosys\\Ikea\\TESTNG\\TestData.properties");
		 Properties props = new Properties ();
		 props.load (reader);
		  driver.get(props.getProperty("search"));
		  WebElement K8 = driver.findElement(By.xpath (props.getProperty("K8")));
		  K8.click();
		  WebElement divide = driver.findElement(By.xpath(props.getProperty("divide")));
		  divide.click();
		  WebElement input1 = driver.findElement(By.xpath(props.getProperty("input1")));
		  input1.sendKeys("5");
		  WebElement input2 = driver.findElement(By.xpath(props.getProperty("input2")));
		  input2.sendKeys("25");
		  WebElement button1= driver.findElement(By.xpath(props.getProperty("button1")));
		  button1.click();
 }
}
