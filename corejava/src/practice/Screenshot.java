package practice;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Screenshot
{
	public void screen() throws IOException
	{
	
	WebDriver driver=new ChromeDriver();
	Date d=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yy-hh-mm-ss");
	String screenname=sdf.format(d);
	File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	File dest=new File(screenname+".png");
	FileHandler.copy(src, dest);
	}

}
