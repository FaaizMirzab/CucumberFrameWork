package pageObject;

import org.openqa.selenium.WebElement;

import seleniumCommands.Commands;

public class ProductPage extends Commands{
	
	public void AddToCart() {
		String productname="//button[text()=' Add to Cart ']";
		click(productname);
	}
	private void cartOpen() {
		String cartlogo="//a[@id='nav-cart']";
		click(cartlogo);
	}
	
	public void cartVerification(String product) {
		cartOpen();
		String product1="//img[contains(@alt,'"+product+"')]";
		WebElement element = elementFind(product1);
		if(element.isDisplayed()) {
			System.out.println("the product is sucessfully added");
		}
		else {
			System.out.println("the product is not added");
		}
	}
}
