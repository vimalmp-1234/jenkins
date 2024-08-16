package jenkins.com;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsTest {
	
	@Test
	public void Demo()
	{
		Reporter.log("Created a jenkins class", true);
	}

}
