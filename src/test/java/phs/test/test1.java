package phs.test;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
	public static void main(String[] args) throws InterruptedException{
		//如果启动出现问题，用System.setProperty指出chromedriver.exe的路径		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");				
	
		WebDriver auto = new ChromeDriver();//先创建一个对象		
				
		auto.get("http://192.168.3.210/login");//第一步，打开登录页面
		System.out.println(new Date()+"检查是否进入了登录页面："+"http://192.168.3.210/login".equals(auto.getCurrentUrl()));//检查实际地址与预期是否一致
				
		auto.findElement(By.id("employeId")).clear();
		auto.findElement(By.id("employeId")).sendKeys("superadmin");
		auto.findElement(By.id("password")).clear();
		auto.findElement(By.id("password")).sendKeys("ipay01");
		auto.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(3000);
		System.out.println(new Date()+"页面Url："+"http://192.168.3.210/backendUsers".equals(auto.getCurrentUrl()));
				
		auto.quit();  
		
	}

}
