package SeleniumAssignments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.dynamic.loading.ByteArrayClassLoader.ChildFirst;

public class Program1_BasicLocators {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://files.wiseapp.live/upload_files/6932afb3c05630afe5a997f1/upload_997951c3-ea02-4bd1-94eb-4dfb62b41407.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("userName")).sendKeys("Shreya sharma");
		Thread.sleep(3000);
		Select select = new Select(driver.findElement(By.name("city")));
		select.selectByValue("Mumbai");
		Thread.sleep(3000);
		driver.findElement(By.id("female")).click();
		Thread.sleep(3000);
		List<WebElement> checkList = new ArrayList<WebElement>();
		checkList = driver.findElements(By.name("skills"));
		System.out.println(checkList);
		for(WebElement e: checkList) {
			e.click();
		}
		Thread.sleep(3000);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(3000);
		//driver.close();

		
	}

}
