package org.basicPrograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex1 {

	public static void main(String[] args) {
		
	//	String path = System.getProperty("use,dir");
		
	//	System.setProperty("","PATH OF driver exe files");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//opens the Chrome browser
		ChromeDriver objCH = new ChromeDriver();
		


			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
			//opens the edge browser
			EdgeDriver objEdge = new EdgeDriver();
			
	}

}
