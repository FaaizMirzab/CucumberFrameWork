package pageObject;

import seleniumCommands.Commands;

public class HomePage extends Commands {
	private void searchBox(String productName) {
		String searchbox="//input[@id='twotabsearchtextbox']";
		sendKeys(searchbox, productName);
	}
	private void searchButtonClick() {
		String searchbtn="//input[@id='nav-search-submit-button']";
		click(searchbtn);
	}
	public void searchBoxAction(String productName) {
		searchBox(productName);
		searchButtonClick();	
	}
	public void productFind(String product) {
		String productname="//img[@alt='"+product+"']";
		click(productname);	
	}

}
