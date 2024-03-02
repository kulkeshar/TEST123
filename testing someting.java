package Aquatest;

import org.testng.annotations.Test;

import base.Baseclass;
import pasges.aquapage;

public class aquatest extends Baseclass {
	public static aquapage pag=new aquapage(driver);
	
	@Test
	public static void invlidlogin() {
		pag.invlidlogin();
	}

}
model.aquapage( apps)
{
	
}