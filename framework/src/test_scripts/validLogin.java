package test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genric.Base_Test;
import genric.Generic_read_excel;
import pom_scripts.Facebook_login;

public class validLogin extends Base_Test
{
@Test
public void loginApp()
{
	String uname = Generic_read_excel.getData("testCase1", 0, 0);
	String pwd = Generic_read_excel.getData("testCase1", 0, 1);
    Facebook_login fb=new Facebook_login(driver);
    fb.setEmail(uname);
    fb.setpass(pwd);
    fb.passBtn();
    Assert.fail();
   system.out.println("hai");
}

}
