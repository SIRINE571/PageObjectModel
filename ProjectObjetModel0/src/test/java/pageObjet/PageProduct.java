package pageObjet;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageProduct {

	public WebDriver driver;

//constructeur

	public PageProduct(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

//identification des elements

	@FindBy(how = How.XPATH, using = "//a[@data-product-id='1']")

	WebElement bt_Addtocarts;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-success close-modal btn-block']")

	WebElement bt_continueshopping;

	@FindBy(how = How.XPATH, using = "//a[@data-product-id='3']")

	WebElement bt_Addtocarts1;

	@FindBy(how = How.XPATH, using = "//u[text()='View Cart']")

	WebElement bt_viewcart;

//creation des methodes

	public void cliquer_sur_le_bouton_Addtocarts() {
		scrool_to_element(bt_Addtocarts);
		bt_Addtocarts.click();
	}

	public void cliquer_sur_le_bouton_continueshopping() {

		bt_continueshopping.click();

	}

	public void cliquer_sur_le_bouton_Addtocarts1() {
		scrool_to_element(bt_Addtocarts1);
		bt_Addtocarts1.click();
	}

	public void cliquer_sur_le_bouton_viewcart() {

		bt_viewcart.click();
	}
	
	
	public void scrool_to_element(WebElement element) {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
}
