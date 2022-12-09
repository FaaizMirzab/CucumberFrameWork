package featureFile;

import io.cucumber.java.en.*;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.ProductPage;
import seleniumCommands.Commands;

public class StepDefinition {
	
	Commands commands=new Commands();
	LoginPage loginpage=new LoginPage();
	HomePage homepage=new HomePage();
	ProductPage productpage=new ProductPage();
	
	@Given("User Launched the Amazon Loging Page in Browser")
	public void user_launched_the_amazon_loging_page_in_browser() {
	   commands.launch();
	}

	@When("user logined by Entering {string} and {string}")
	public void user_logined_by_entering_and(String mobileNumber, String password) {
		loginpage.login(mobileNumber, password);
	}

	@And("the user entered {string} in search box")
	public void the_user_entered_in_search_box(String productName) {
		homepage.searchBoxAction(productName);
	}

	@And("the user select the {string}")
	public void the_user_select_the(String product) {
		homepage.productFind(product);
	}

	@And("the user add the selected product into cart")
	public void the_user_add_the_selected_product_into_cart() {
	   commands.switchMethod();
	   productpage.AddToCart();
	}

	@Then("verify the {string} in cart")
	public void verify_the_in_cart(String product) {
	   productpage.cartVerification(product);
	   commands.quit();
	}

}
