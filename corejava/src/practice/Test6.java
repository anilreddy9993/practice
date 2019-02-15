package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test6
{
	//data members
	public ChromeDriver driver;
	//cunstructor 
	public Test6()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\javaproject\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	public void launch(String u)
	{
		driver.get(u);
	}
	public void close()
	{
		driver.close();
	}

}
