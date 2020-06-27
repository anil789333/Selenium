package com.abc.Magento;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagentoLogin
{

	public static void main(String[] args) throws Exception 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		FileInputStream fis = new FileInputStream("C:\\Users\\NEMANI\\Desktop\\Testing\\HybridDrivenFramework\\src\\com\\abc\\Utilites\\hybrid.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String url_data = prop.getProperty("url");
		String email_data = prop.getProperty("email_data");
		String pwd_data = prop.getProperty("pwd_data");
		
		String acc_loc=prop.getProperty("acc");
		String email_loc = prop.getProperty("email_loc");
		String pwd_loc=prop.getProperty("pwd_loc");
		String login_loc=prop.getProperty("login");
		String logout_loc = prop.getProperty("logout");
		
		driver.get(url_data);
		driver.findElement(By.xpath(acc_loc)).click();
		driver.findElement(By.xpath(email_loc)).sendKeys(email_data);
		driver.findElement(By.xpath(pwd_loc)).sendKeys(pwd_data);
		driver.findElement(By.xpath(login_loc)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(logout_loc)).click();
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
