package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.UserPage;

public class UserCreated extends BaseTest{
	
	@Test
	public void user1() throws IOException, InterruptedException
	{
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		
		lp.validLogin(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		
		HomePage hp = new HomePage(driver);
		hp.clickOnusers();
		
		UserPage up = new UserPage(driver);
		up.userCreate();
		
		String usn = flib.readExcelData(EXCEL_PATH, "userdata", 1, 0);
		String pass = flib.readExcelData(EXCEL_PATH, "userdata", 1, 1);
		String ab = flib.readExcelData(EXCEL_PATH, "userdata", 1, 2);
		String xy = flib.readExcelData(EXCEL_PATH, "userdata", 1, 3);
		
		up.firstUser(usn, pass, ab, xy);
		up.delete();
		
		Thread.sleep(2000);
		up.userCreate();
		
		String usn1 = flib.readExcelData(EXCEL_PATH, "userdata", 2, 0);
		String pass1 = flib.readExcelData(EXCEL_PATH, "userdata", 2, 1);
		String cd= flib.readExcelData(EXCEL_PATH, "userdata", 2, 2);
		String pq= flib.readExcelData(EXCEL_PATH, "userdata", 2, 3);
		
		up.firstUser(usn1, pass1, cd, pq);
		up.delete();
	}

}
