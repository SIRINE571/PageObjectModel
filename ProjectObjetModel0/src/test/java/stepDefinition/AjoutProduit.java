package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import hooks.SetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjet.PageCart;
import pageObjet.PageHOME;
import pageObjet.PageProduct;

public class AjoutProduit {
	
	public static WebDriver driver = SetUp.driver;
 

	PageProduct Product = new PageProduct(driver);
	PageHOME Home = new PageHOME(driver);
	PageCart Cart = new PageCart(driver);
	
	@When("cliquer sur le bouton Products")
	public void cliquer_sur_le_bouton_products() {
		Home.cliquer_sur_le_bouton_Product();
	    
	}

	@When("cliquer sur add to product")
	public void cliquer_sur_add_to_cart() {
		Product.cliquer_sur_le_bouton_Addtocarts();
	  
	}

	@And("cliquer sur continue shopping")
	public void cliquer_sur_continue_shopping() {
		Product.cliquer_sur_le_bouton_continueshopping();
	    
	     
	}
	
	@When("cliquer sur add to product1")
	public void cliquer_sur_add_to_cart1() {
		Product.cliquer_sur_le_bouton_Addtocarts1();
	  
	}

	@And("cliquer sur view cart button")
	public void cliquer_sur_view_cart_button() {
		Product.cliquer_sur_le_bouton_viewcart();
	    
	}
	
 	
	@Then("verifier le produit1 , le prix1 , la quantité1 , le prix totals1")
	public void verifier_le_produit1_le_prix1_la_quantité1_le_prix_totals1() {
		Assert.assertEquals(toString(), Cart.produit1_obtenu());
		Assert.assertEquals(toString(), Cart.prix1_obtenu());
		Assert.assertEquals(toString(), Cart.quantité1_obtenu());
		Assert.assertEquals(toString(), Cart.prixtotals1_obtenu());
		
	 
	}

	@Then("verifier le produit2 , le prix2 ,la quantité2 , le prix totals2")
	public void verifier_le_produit2_le_prix2_la_quantité2_le_prix_totals2() {
		Assert.assertEquals(toString(), Cart.produit2_obtenu());
		Assert.assertEquals(toString(), Cart.prix2_obtenu());
		Assert.assertEquals(toString(), Cart.quantité2_obtenu());
		Assert.assertEquals(toString(), Cart.prixtotals2_obtenu());
	   
	}



}
