package com.baseclass;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static TakesScreenshot ts;

	public void browserLaunch() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	//WebDriver Methods
	public void launchApplication(String url) {
		driver.get(url);
	}
	public void close() {
		driver.close();
	}
	public void quit() {
		driver.quit();
	}
	//TakesScreenshot
		public void screenshot(String string) {
		 TakesScreenshot ts =(TakesScreenshot)driver;
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 File target = new File(".//target//"+string+".png");
		 try {
		 FileUtils.copyFile(source, target);}
		 catch (Exception e) {
			e.printStackTrace();}
		}
//		 WebElement Methods
		 public void button(WebElement w) {
				w.click();
			}
			public void inputText(WebElement w, String string) {
				w.sendKeys(string);
			}
			
			public String retrieveText(WebElement e) {
				String text =e.getText();
				return text;
			}
			public String retrieveAttribute(WebElement e, String value) {
				String att =e.getAttribute(value);
				return att;
			}
			public String retrieveCss(WebElement e, String value) {
				String css =e.getCssValue(value);
				return css;
			}
			public String retrieveTag(WebElement e) {
				String tag =e.getTagName();
				return tag;
			}
			public void submit(WebElement w) {
				w.submit();
			}
	//Select Class Methods
			public void selectIndex(WebElement e, int index) {
				Select s = new Select(e);
				s.selectByIndex(index);
			}
			public void selectValue(WebElement e, String value) {
				Select s = new Select(e);
				s.selectByValue(value);
			}
			public void selectText(String text,WebElement e) {
				Select s = new Select(e);
				s.selectByVisibleText(text);
			}
			public List<WebElement> options(WebElement e) {
				Select s = new Select(e);
				List<WebElement> option=s.getOptions();
				return option;
			}
			public List<WebElement> allSelectedOptions(WebElement e) {
				Select s = new Select(e);
				List<WebElement> alloption=s.getAllSelectedOptions();
				return alloption;
			}
			public boolean multipleOptions (WebElement e) {
				Select s = new Select(e);
				boolean multi=s.isMultiple();
				return multi;
			}
			public void timeout() {
				 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				 wait.until(ExpectedConditions.alertIsPresent());
			}
	}
