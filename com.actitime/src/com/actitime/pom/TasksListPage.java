package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksListPage {

	public static WebDriver driver;
	
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addNewBtn;
	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement newCustomerBtn;
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement enterCustomerNameTbx;
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustomerDespTbx;
	@FindBy(xpath = "(//div[text()='- Select Customer -'])[1]")
	private WebElement selectCustomerDD;
	@FindBy(xpath = "//div[text()='Galaxy Corporation' and @class='itemRow cpItemRow ']")
	private WebElement selectBigBangCompany;
	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement createCustomerBtn;
	@FindBy(xpath = "//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualCustomerField;

	@FindBy(xpath = "//div[text()='+ New Project']")
	private WebElement newProjectBtn;
	@FindBy(xpath = "(//input[@placeholder='Enter Project Name'])[2]")
	private WebElement enterProjectNameTbx;
	@FindBy(xpath = "//div[@class='comboboxButton']")
	private WebElement selectCreatedCustomerDropdown;
	@FindBy(xpath = "//div[text()='HDFC_001']")
	private WebElement selectHDFC;
	@FindBy(xpath = "//textarea[@placeholder='Add Project Description']")
	private WebElement projectDesp;
	@FindBy(xpath = "//div[text()='Create Project']")
	private WebElement createProjectBtn;

	@FindBy(xpath = "//div[text()='+ New Tasks']")
	private WebElement newTaskBtn;
	@FindBy(xpath = "(//div[@class='comboboxButton'])[1]")
	public WebElement selectProjectDD;
	@FindBy(xpath = "//div[@class='itemRow cpItemRow ' and text()='Big Bang Company']")
	public WebElement selectBigBangInTask;
	@FindBy(xpath = "(//div[@class='comboboxButton'])[2]")
	public WebElement selectCustDDInTask;
	@FindBy(xpath = "//div[@class='itemRow cpItemRow ' and text()='Spaceship building']")
	public WebElement selectSpaceship;
	@FindBy(xpath = "(//input[@placeholder='Enter task name'])[1]")
	public WebElement enterTaskName;
	@FindBy(xpath = "//div[text()='Create Tasks']")
	public WebElement createTasksBtn;

	public TasksListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getNewProjectBtn() {
		return newProjectBtn;
	}

	public WebElement getEnterProjectNameTbx() {
		return enterProjectNameTbx;
	}

	public WebElement getSelectCreatedCustomerDropdown() {
		return selectCreatedCustomerDropdown;
	}

	public WebElement getSelectHDFC() {
		return selectHDFC;
	}

	public WebElement getProjectDesp() {
		return projectDesp;
	}

	public WebElement getCreateProjectBtn() {
		return createProjectBtn;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustomerBtn() {
		return newCustomerBtn;
	}

	public WebElement getEnterCustomerNameTbx() {
		return enterCustomerNameTbx;
	}

	public WebElement getActualCustomerField() {
		return actualCustomerField;
	}

	public WebElement getEnterCustomerDespTbx() {
		return enterCustomerDespTbx;
	}

	public WebElement getSelectCustomerDD() {
		return selectCustomerDD;
	}

	public WebElement getSelectBigBangCompany() {
		return selectBigBangCompany;
	}

	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}
	public WebElement getNewTaskBtn() {
		return newTaskBtn;
	}

	public WebElement getSelectProjectDD() {
		return selectProjectDD;
	}

	public WebElement getSelectBigBangInTask() {
		return selectBigBangInTask;
	}

	public WebElement getSelectCustDDInTask() {
		return selectCustDDInTask;
	}

	public WebElement getSelectSpaceship() {
		return selectSpaceship;
	}

	public WebElement getEnterTaskName() {
		return enterTaskName;
	}

	public WebElement getCreateTasksBtn() {
		return createTasksBtn;
	}
}
