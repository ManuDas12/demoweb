package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTo_Cart_Computer {
WebDriver driver;
public AddTo_Cart_Computer(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath ="//a[@href='/computers']")WebElement computerClick;
@FindBy(xpath = "//img[@alt='Picture for category Desktops']")WebElement desktopClick;
@FindBy(xpath="//img[@alt='Picture of Build your own cheap computer']") WebElement ownCheapComputerClick;
@FindBy(xpath = "//input[@id='product_attribute_72_5_18_65']") WebElement processorRadioButton;
@FindBy(xpath = "//input[@id='product_attribute_72_6_19_55']") WebElement ramRadioButton;
@FindBy(xpath = "//input[@id='product_attribute_72_3_20_58']") WebElement hddRadioButton;
@FindBy(xpath = "//input[@id='addtocart_72_EnteredQuantity']") WebElement quantitySelect;
@FindBy(xpath="//input[@id='add-to-cart-button-72']") WebElement addtoCartButton;
@FindBy(xpath = "//div[@id='bar-notification']") WebElement alertMsgCartSuccesfull;


public void selectComputerClickForCart() {
	computerClick.click();
}
public void selectDesktopClick() {
	desktopClick.click();
}
public void CheapComputerClick() {
	ownCheapComputerClick.click();	
}
public void radioButtonForProcessor() {
	processorRadioButton.click();
}
public void ramRadioButtonSelect() {
	ramRadioButton.click();
}
public void hddRadioButtonSelect() {
	hddRadioButton.click();
}
public void quantity(String qnum) {
	quantitySelect.sendKeys(qnum);
}
public void cartButton() {
	addtoCartButton.click(); 
}
public boolean isCartSuccessfull() {
	return alertMsgCartSuccesfull.isDisplayed();
}

}
