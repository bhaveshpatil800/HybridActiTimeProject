package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//a[.='Logout']")private WebElement logoutLink;
	@FindBy(xpath = "//select[@name='usersSelector.selectedUser']")private WebElement enterTimeTrackDropdown;
	@FindBy(xpath="//input[@id='SubmitTTButton']")private WebElement saveLeaveTimeTab;
	@FindBy(xpath = "//div[.='Users']/following-sibling::img")private WebElement usersTab;
	
	// initialization 
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

    // utilization
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}


	public WebElement getEnterTimeTrackDropdown() {
		return enterTimeTrackDropdown;
	}


	public WebElement getSaveLeaveTimeTab() {
		return saveLeaveTimeTab;
	}


	public WebElement getUsersTab() {
		return usersTab;
	}
	
	// operational method
	
	public void logOut()
	{
		logoutLink.click();
	}
	
	public void clickOnusers()
	{
		if(usersTab.isDisplayed())
		{
			usersTab.click();
		}
		else
		{
			System.out.println("We got the exception!!");
		}
	}
}
