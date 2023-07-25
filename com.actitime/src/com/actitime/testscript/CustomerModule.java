package com.actitime.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TasksListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException {
		Reporter.log("Creating Customer", true);
		HomePage hp=new HomePage(driver);
		hp.setTasksTab();
		FileLib fl=new FileLib();
		String customerName = fl.getExcelData("./data/testscript.xlsx", "CreateCustomer", 1, 3);
		String customerDescp = fl.getExcelData("./data/testscript.xlsx", "CreateCustomer", 1, 4);
		TasksListPage tlp=new TasksListPage(driver);
		tlp.getAddNewBtn().click();
		tlp.getNewCustomerBtn().click();
		tlp.getEnterCustomerNameTbx().sendKeys(customerName);
		tlp.getEnterCustomerDespTbx().sendKeys(customerDescp);
		tlp.getSelectCustomerDD().click();
		tlp.getSelectBigBangCompany().click();
		tlp.getCreateCustomerBtn().click();
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		String actualText = tlp.getActualCustomerField().getText();
//		Assert.assertEquals(actualText, customerName);
	}
}
