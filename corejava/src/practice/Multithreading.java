package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class Multithreading extends Thread
{
	/*
	 * in multi threading method should always be run(non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	public void run()
	{
		try {
			Thread.sleep(20000);
			StringSelection x=new StringSelection("anil");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x, null);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(5000);
			StringSelection y=new StringSelection("reddy");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(y, null);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(5000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
		} catch (InterruptedException | AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		Multithreading mt=new Multithreading();
		/*
		 * to start execution of run method
		 */
		mt.start();
		System.setProperty("webdriver.chrome.driver", "E:\\javaproject\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(30000);
		driver.close();
		
		
	}

}
