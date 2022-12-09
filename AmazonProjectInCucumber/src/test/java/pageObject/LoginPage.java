package pageObject;

import seleniumCommands.Commands;

public class LoginPage extends Commands {
	private void mobileNumber(String mobileNumber) {
		String Username="//input[@id='ap_email']";
		sendKeys(Username,mobileNumber );
	}
	private void continueButton() {
		String Continuebtn="//input[@id='continue']";
		click(Continuebtn);
	}
	private void password(String password) {
		String Password="//input[@id='ap_password']";
		sendKeys(Password,password);
	}
	private void loginButton() {
		String LogInbtn="//input[@id='signInSubmit']";
		click(LogInbtn);
	}
	public void login(String mobileNumber , String password) {
		mobileNumber(mobileNumber);
		continueButton();
		password(password);
		loginButton();
	}
}
