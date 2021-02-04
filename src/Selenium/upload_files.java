package Selenium;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class upload_files {

	    public static void main(String[] args) {
	        System.setProperty("webdriver.firefox.marionette","E:\\Projects\\UI Projects\\ICICI UI Regression Test\\HSBC-CAN-FA\\Drivers\\chromedriver.exe");
	        String baseUrl = "http://demo.guru99.com/test/upload/";
	        WebDriver driver = new ChromeDriver();

	        driver.get(baseUrl);
	        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

	        // enter the file path onto the file-selection input field
	        uploadElement.sendKeys("C:\\newhtml.html");

	        // check the "I accept the terms of service" check box
	        driver.findElement(By.id("terms")).click();

	        // click the "UploadFile" button
	        driver.findElement(By.name("send")).click();
	        
	        // to get the Response message or code of a particular URL
		    
	        HttpURLConnection connection = (HttpURLConnection) new URL("http://google.com").openConnection();
		    connection.connect();
		    connection.getResponseMessage();
		    connection.disconnect();
		    
	        }

	}

