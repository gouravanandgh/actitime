package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TasksListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class ProjectModule extends BaseClass{
	@Test
	public void testCreateProject() throws EncryptedDocumentException, IOException {
		Reporter.log("Creating Project", true);
		HomePage hp=new HomePage(driver);
		hp.setTasksTab();
		FileLib fl=new FileLib();
		String projectName = fl.getExcelData("./data/testscript.xlsx", "CreateProject", 1, 5);
		String projectDescp = fl.getExcelData("./data/testscript.xlsx", "CreateProject", 1, 6);
		TasksListPage tlp=new TasksListPage(driver);
		tlp.getAddNewBtn().click();
		tlp.getNewProjectBtn().click();
		tlp.getEnterProjectNameTbx().sendKeys(projectName);
		tlp.getSelectCreatedCustomerDropdown().click();
		tlp.getSelectHDFC().click();
		tlp.getProjectDesp().sendKeys(projectDescp);
		tlp.getCreateProjectBtn().click();
	}
}
