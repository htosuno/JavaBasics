package com.syntax.class34;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
	public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) throws InterruptedException, IOException {
		String filePath = System.getProperty("user.dir") + "\\testdata\\SyntaxHrmUnPw.xlsx";
		FileInputStream fis = new FileInputStream(filePath);

		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("Sheet1");
		int rows = sheet.getPhysicalNumberOfRows();
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);		
		
		for (int i = 0; i < rows; i++) {
			String username=sheet.getRow(i).getCell(0).toString();
			String password=sheet.getRow(i).getCell(1).toString();
			driver.findElement(By.xpath("//input[@id= 'txtUsername']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@id= 'txtPassword']")).sendKeys(password);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@class= 'button']")).click();
			WebElement name = driver.findElement(By.id("welcome"));
			if(name.getText().contains("Mehmet"))
				System.out.println("Displayed username is correct");
			else
				System.out.println("Displayed username is wrong");
			Thread.sleep(1000);
			name.click();
			Thread.sleep(1000);
			WebElement logout=driver.findElement(By.xpath("//a[text()='Logout']"));
			logout.click();


			

		}


	}

}
