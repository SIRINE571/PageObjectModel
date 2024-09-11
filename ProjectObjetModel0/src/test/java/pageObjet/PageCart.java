package pageObjet;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageCart {
	
public WebDriver driver ;


//constructeur

	public PageCart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//identification des elements

		@FindBy(how = How.XPATH, using = "//a[normalize-space()='Blue Top']")
		WebElement txt_produit1;

		@FindBy(how = How.XPATH, using = "//a[normalize-space()='Sleeveless Dress']")
		WebElement txt_produit2;

		@FindBy(how = How.XPATH, using = "//p[normalize-space()='Rs. 500']")
		WebElement txt_prix1;

		@FindBy(how = How.XPATH, using = "//button[@class='disabled']")
		WebElement txt_quantité1;
		
		@FindBy(how = How.XPATH, using = "//p[normalize-space()='Rs. 4000']")
		WebElement txt_prixtotals1;
		
		@FindBy(how = How.XPATH, using = "//p[normalize-space()='Rs. 1000']")
		WebElement txt_prix2;
		
		@FindBy(how = How.XPATH, using = "/button[@class='disabled']")
		WebElement txt_quantité2;
		
		@FindBy(how = How.XPATH, using = "//p[normalize-space()='Rs. 8000']")
		WebElement txt_prixtotals2;
		
		
//Cration des methode
		
	 
		
		public String produit1_obtenu() {
			String txt_produit1_obtenu = txt_produit1.getText();
			return txt_produit1_obtenu;
		}
		
		public String produit2_obtenu() {
			String txt_produit2_obtenu = txt_produit2.getText();
			return txt_produit2_obtenu; }
		
		public String prix1_obtenu() {
			String txt_prix1_obtenu = txt_prix1.getText();
			return txt_prix1_obtenu; }
		
		public String quantité1_obtenu() {
			String txt_quantité1_obtenu = txt_quantité1.getText();
			return txt_quantité1_obtenu; }
		
		public String prixtotals1_obtenu() {
			String txt_prixtotals1_obtenu = txt_prixtotals1.getText();
			return txt_prixtotals1_obtenu; }
		
		public String prix2_obtenu() {
			String txt_prix2_obtenu = txt_prix2.getText();
			return txt_prix2_obtenu; }
		
		public String quantité2_obtenu() {
			String txt_quantité2_obtenu = txt_quantité2.getText();
			return txt_quantité2_obtenu; }
		
		public String prixtotals2_obtenu() {
			String txt_prixtotals2_obtenu = txt_prixtotals2.getText();
			return txt_prixtotals2_obtenu; }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		




}
