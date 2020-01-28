package com.abc.MagentoObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

		WebDriver driver;
		public Login(WebDriver driver)
		{
			this.driver=driver;
		}
		By username=By.id("email");
		By pwd=By.id("pass");
		By login=By.id("send2");
		public void typeEmail(String email)
		{
			driver.findElement(username).sendKeys("emailvalue");
		}
		public void typePassword(String password)
		{
			driver.findElement(pwd).sendKeys("pwdvalue");
			}
		public void clickOnLogin()
		{
			driver.findElement(login).click();
		}
	}
	
	


