package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass extends FileLib {
	public static WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

	@BeforeMethod
	public void login() throws IOException {
		FileLib fl=new FileLib();
		driver.get(fl.getPropertyData("./data/commondata.property", "url"));
		LoginPage lp=new LoginPage(driver);
		lp.setLogin(fl.getPropertyData("./data/commondata.property", "username"), fl.getPropertyData("./data/commondata.property", "password"));
	}

	@AfterMethod
	public void logout() {
		HomePage hp=new HomePage(driver);
		hp.setLogout();
	}
}
