package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.AddTo_Cart_Computer;
import utilities.ExcelUtility;

public class AddTo_Cart_Computer_Test extends Base {
  @Test(description = "add to cart computer")
  public void VerifyUserCanCartDesktop() throws IOException {
	  AddTo_Cart_Computer addCart=new AddTo_Cart_Computer(driver);
	  addCart.selectComputerClickForCart();
	  addCart.selectDesktopClick();
	  addCart.CheapComputerClick();
	  addCart.radioButtonForProcessor();
	  addCart.ramRadioButtonSelect();
	  addCart.hddRadioButtonSelect();
	  String quantity=ExcelUtility.getStringData(1, 0, "quantity");
	  addCart.quantity(quantity);
	  addCart.cartButton();
	  
	  boolean isCartSuccessfull=addCart.isCartSuccessfull();
	  assertTrue(isCartSuccessfull,Constants.CARTCMPLT);
	  
  }
}
