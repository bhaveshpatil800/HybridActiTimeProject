package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath = "//input[@name='username']")
	private WebElement usnTB;
	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement passTB;
	@FindBy(xpath = "//a[@id='loginButton']")
	private WebElement loginButton;
	@FindBy(xpath = "//input[@id='keepLoggedInCheckBox']")
	private WebElement checkBoxButton;

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	// getter method

	public WebElement getUsnTB() {
		return usnTB;
	}

	public WebElement getPassTB() {
		return passTB;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getCheckBoxButton() {
		return checkBoxButton;
	}

	// operational Methods

	public void validLogin(String validusn, String validpass) {
		usnTB.sendKeys(validusn);
		passTB.sendKeys(validpass);
		loginButton.click();

	}

	public void invalidLogin(String invalidusn, String invalidpass) throws InterruptedException {
		usnTB.sendKeys(invalidusn);
		passTB.sendKeys(invalidpass);
		loginButton.click();
		Thread.sleep(2000);
		usnTB.clear();
	}

}
