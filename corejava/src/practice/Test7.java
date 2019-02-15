package practice;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Test7 {

	public static void main(String[] args)  {
		Test6 obj=new Test6();
		Primenumber pr=new Primenumber();
		Screenshot screen=new Screenshot();
		ExtentReports er = new ExtentReports("hello.html", true);

		ExtentTest test =er.startTest("check");
		try
		{
			System.out.println("hello");
		obj.launch("https://www.toolsqa.com/selenium-webdriver/exception-handling-selenium-webdriver/");
		screen.screen();
		
		//test.log(LogStatus.PASS,"executed"+test..addScreenCapture(screenname+".png") );
		
		obj.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		pr.prime();
		test.log(LogStatus.PASS, "good");
		er.endTest(test);
		er.flush();

	}

}
