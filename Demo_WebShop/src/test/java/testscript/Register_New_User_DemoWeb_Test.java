package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.Register_New_User_DemoWeb;
import utilities.ExcelUtility;

public class Register_New_User_DemoWeb_Test extends Base {
  @Test(description = " new user registration")
  public void verifyUsercanregister() throws IOException {
	  Register_New_User_DemoWeb register=new Register_New_User_DemoWeb(driver);
	  register.regButtonClick();
	  register.genderButtonClick();
	  String firstName=ExcelUtility.getStringData(1, 0, "newRegistration");
	  String lastName=ExcelUtility.getStringData(1, 1, "newRegistration");
	  String email=ExcelUtility.getStringData(1, 2, "newRegistration");
	  String pass=ExcelUtility.getStringData(1, 3, "newRegistration");
	  String confirmPassword=ExcelUtility.getStringData(1, 4,"newRegistration");
	  register.firstnameField(firstName);
	  register.lastnameField(lastName);
	  register.emailField(email);
	  register.passwordField(pass);
	  register.confirmPassword(confirmPassword);
	  register.registerUser();
	  
	  boolean isUSerCmpltAll=register.isUSerCmpltAll();
	  assertTrue(isUSerCmpltAll,Constants.REGFAILED);
	  
  }
}
