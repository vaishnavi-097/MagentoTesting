package com.abc.MagentoMain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.MagentoObjects.Home;
import com.abc.MagentoObjects.Login;
import com.abc.MagentoObjects.Welcome;



public class MagentoTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.magento.com");
		Welcome w=new Welcome(driver);
		w.clickonMyAccount();
	   Login l=new Login(driver);
	   l.typeEmail("vaishnavi11kulkarni@gmail.com");
	   l.typePassword("Vaish@123");
	   l.clickOnLogin();
	   Home h=new Home(driver);
	   h.clickOnLogOut();
	   driver.quit();
	   
	   
		
	}

}
