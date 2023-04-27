package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericPackage.WorkLib;

public class UserPage {
	
	@FindBy(xpath ="//input[@value='Create New User']")private WebElement createNewUserTab;
	@FindBy(name="username")private WebElement usnTB;
	@FindBy(name="passwordText")private WebElement passTB;
	@FindBy(name="passwordTextRetype")private WebElement retypepassTB;		
    @FindBy(name="firstName")private WebElement fnTB;
    @FindBy(name="lastName")private WebElement lnTB;
    @FindBy(xpath="//input[@value='   Create User   ']")private WebElement createUserTab;
    @FindBy(xpath="//input[@value='      Cancel      ']")private WebElement cancelButton;
    @FindBy(xpath="(//td[@class='listtblcell']/descendant::a)[1]")private WebElement deleteUserTab;
    @FindBy(xpath="//input[@value='Delete This User'] ")private WebElement deleteThisUserTab;
	
    
    public UserPage(WebDriver driver) {
    	PageFactory.initElements(driver,this);
	
	}


	public WebElement getCreateNewUserTab() {
		return createNewUserTab;
	}


	public WebElement getUsnTB() {
		return usnTB;
	}


	public WebElement getPassTB() {
		return passTB;
	}


	public WebElement getRetypepassTB() {
		return retypepassTB;
	}


	public WebElement getFnTB() {
		return fnTB;
	}


	public WebElement getLnTB() {
		return lnTB;
	}


	public WebElement getCreateUserTab() {
		return createUserTab;
	}


	public WebElement getCancelButton() {
		return cancelButton;
	}

    // operational method
	
	public WebElement getDeleteUserTab() {
		return deleteUserTab;
	}


	public WebElement getDeleteThisUserTab() {
		return deleteThisUserTab;
	}
	
	public void userCreate( ) {
		createNewUserTab.click();
	}
    
	
	public void firstUser(String usn,String pass,String fn,String ln) throws InterruptedException
	{
		usnTB.sendKeys(usn);
		Thread.sleep(2000);
		passTB.sendKeys(pass);
		Thread.sleep(2000);
		retypepassTB.sendKeys(pass);
		Thread.sleep(2000);
		fnTB.sendKeys(fn);
		Thread.sleep(2000);
		lnTB.sendKeys(ln);
		Thread.sleep(2000);
		createUserTab.click();
		
	}
    
	public void delete() throws InterruptedException
	{
		deleteUserTab.click();
		Thread.sleep(2000);
		deleteThisUserTab.click();
		WorkLib wl = new WorkLib();
		wl.handleConfirmationPopup();
	}
    
    
}
