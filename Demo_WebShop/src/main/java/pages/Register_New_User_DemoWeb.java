package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_New_User_DemoWeb {
	WebDriver driver;
public Register_New_User_DemoWeb(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//a[@href='/register']") WebElement regButton;
@FindBy(xpath = "//input[@id='gender-male']") WebElement genderRadio;
@FindBy(xpath = "//input[@id='FirstName']") WebElement firstName;
@FindBy(xpath = "//input[@id='LastName']") WebElement lastName;
@FindBy(xpath = "//input[@id='Email']") WebElement email;
@FindBy(xpath = "//input[@id='Password']") WebElement password;
@FindBy(xpath = "//input[@id='ConfirmPassword']") WebElement confirmPassword;
@FindBy(xpath = "//input[@id='register-button']") WebElement regButtonSubmit;
@FindBy(xpath = "//div[@class='result']") WebElement regCmplt;

public void regButtonClick() {
	regButton.click();
}
public void genderButtonClick() {
	genderRadio.click();
}
public void firstnameField(String fName) {
	firstName.sendKeys(fName);
} 
public void lastnameField(String lName) {
	lastName.sendKeys(lName);
}
public void emailField(String emailField1) {
	email.sendKeys(emailField1);
}
public void passwordField(String pField) {
	password.sendKeys(pField);
}
public void confirmPassword(String confirmPField) {
	confirmPassword.sendKeys(confirmPField);
}
public void registerUser() {
	regButtonSubmit.click();
}
public boolean isUSerCmpltAll() {
	return regCmplt.isDisplayed();
}
}
