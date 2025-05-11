package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampBase {
	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampBase obj=new SampBase();
		obj.base();
		obj.access();
	}
	
	public void base() {
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void access() {
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement arrow=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='button'][@class='rct-collapse rct-collapse-btn']")));
		arrow.click();
		arrow.isSelected();
		WebElement arrow2=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[local-name()='svg' and @class='rct-icon rct-icon-expand-close'][1]")));
		arrow2.click();
		arrow2.isSelected();
	}

}
