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

public class WebMathSub {
@Test
public void Subtract () throws IOException {
	
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
	  WebElement Sub = driver.findElement(By.xpath(props.getProperty("Sub")));
	  Sub.click();
	  WebElement num1 = driver.findElement(By.xpath(props.getProperty("num1")));
	  num1.sendKeys("24");
	  WebElement num2 = driver.findElement(By.xpath(props.getProperty("num2")));
	  num2.sendKeys("4");
	  WebElement button = driver.findElement(By.xpath(props.getProperty("button")));
	  button.click();
}
}
