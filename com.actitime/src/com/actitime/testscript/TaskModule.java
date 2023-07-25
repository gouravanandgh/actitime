package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TasksListPage;

public class TaskModule extends BaseClass {
	@Test
	public void testCreateTask() throws EncryptedDocumentException, IOException {
		Reporter.log("Creating Task", true);
		HomePage hp=new HomePage(driver);
		hp.setTasksTab();
		FileLib fl=new FileLib();
		String taskName = fl.getExcelData("./data/testscript.xlsx", "CreateTask", 1, 7);
		TasksListPage tlp=new TasksListPage(driver);
		tlp.getAddNewBtn().click();
		tlp.getNewTaskBtn().click();
		tlp.getSelectProjectDD().click();
		tlp.getSelectBigBangInTask().click();
		tlp.getSelectCustDDInTask().click();
		tlp.getSelectSpaceship().click();
		tlp.getEnterTaskName().sendKeys(taskName);
		tlp.createTasksBtn.click();
	}
}
