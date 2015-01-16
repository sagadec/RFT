
import resources.TESTgithubHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author Clive
 */
public class TESTgithub extends TESTgithubHelper
{
	/**
	 * Script Name   : <b>TESTgithub</b>
	 * Generated     : <b>Jan 16, 2015 11:11:23 AM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/01/16
	 * @author Clive
	 */
	public void testMain(Object[] args) 
	{
		startApp("ClassicsJavaA");
		
		// Frame: ClassicsCD
		placeOrder().click();
		
		// Frame: Member Logon
		password().click(atPoint(78,5));
		memberLogon().inputChars("ui");
		ok().click();
		
		// Frame: Place an Order
		cardNumberIncludeTheSpaces().click(atPoint(79,9));
		placeAnOrder().inputChars("990");
		expirationDate().drag(atPoint(32,16), atPoint(32,18));
		placeAnOrder().inputChars("90");
		placeOrder2().drag();
		
		// 
		ok2().click();
		
		// Frame: ClassicsCD
		classicsCD(ANY,MAY_EXIT).close();
	}
}

