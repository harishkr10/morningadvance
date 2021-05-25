package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import genric.Base_Test;
import genric.Base_page;

public class Facebook_login extends Base_page
{
@FindBy(id="email")
private WebElement email;

@FindBy(id="pass")
private WebElement password;

@FindBy(xpath="//button[@type='submit']")
private WebElement logIn;



public Facebook_login(WebDriver driver)
{
	super(driver);
	
}
public void setEmail(String mail)
{
	email.sendKeys(mail);
}
public void setpass(String pwd)
{
	password.sendKeys(pwd);
}
public void passBtn()
{
	logIn.click();
}
}
