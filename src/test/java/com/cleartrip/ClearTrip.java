package com.cleartrip;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


import com.baseclass.BaseClass;

import io.cucumber.core.gherkin.vintage.internal.gherkin.ast.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ClearTrip extends BaseClass{
		BaseClass base=new BaseClass();
	    public static WebDriver driver;
		com.cleartrip.objectrepository.Cleartrip ct=new com.cleartrip.objectrepository.Cleartrip();
	@Given("User Launch the Application {string}")
	public void user_Launch_the_Application(String string) {
		try {
//			  WebDriverManager.edgedriver().setup();
//			  driver=new EdgeDriver();
//			  driver.get(string);
			driver=base.driver;
			base.launchApplication(string);
			//b.browserLaunch();
			
//			  driver.manage().window().maximize();
//			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
//			  Thread.sleep(2000);
		  }catch(Exception e) {
			  e.printStackTrace();}
	}
	@When("User Enters Valid From Location with 1D List")
	public void user_Enters_Valid_From_Location_with_1D_List(io.cucumber.datatable.DataTable Address) {
	  try {
		  List<String>list=Address.asList();
		   String filter=list.get(2);
//		   WebElement From=driver.findElement(By.xpath("//input[@title=\"From station\"]"));
		   base.inputText(ct.getFrom(),filter);
//		   base.inputText(From, filter);
		   //			From.sendKeys(filter);
			
	  }catch(Exception e) {
		  e.printStackTrace();}
	}
	@When("User Enters Valid From Location {string}")
	public void user_Enters_Valid_From_Location(String From) {
	    try {
//	    	WebElement From1=driver.findElement(By.xpath("//input[@title=\"From station\"]"));
	    	base.inputText(ct.getFrom1(), From);
//	    	base.inputText(From1, From);
//	    	From1.sendKeys(From);
	    }catch(Exception e) {
	  	  e.printStackTrace();}
	}
	@When("User Enters Valid From Location")
	public void user_Enters_Valid_From_Location() {
	try {
//		WebElement From=driver.findElement(By.xpath("//input[@title=\"From station\"]"));
		base.inputText(ct.getFrom(),"Chennai");
//		base.inputText(From,"Chennai");
//		From.sendKeys("Chennai");
	}catch(Exception e) {
		  e.printStackTrace();}
	}
	@When("User Enters Valid To Location {string}")
	public void user_Enters_Valid_To_Location(String To) {
		 try {
//		    	WebElement To1=driver.findElement(By.xpath("//input[@title=\"To station\"]"));
		    	base.inputText(ct.getTo1(), To);
//		    	base.inputText(To1, To);
//		    	To1.sendKeys(To);	
		    }catch(Exception e) {
		  	  e.printStackTrace();} 
	}
	@When("User Enters Valid To Location")
	public void user_Enters_Valid_To_Location() {
	    try {
//	    	WebElement To=driver.findElement(By.xpath("//input[@title=\"To station\"]"));
	    	base.inputText(ct.getTo(), "Bangalore");
//	    	base.inputText(To, "Bangalore");
//	    	To.sendKeys("Bangalore");	
	    }catch(Exception e) {
	  	  e.printStackTrace();}
	}

	@When("User Selects Class from the dropdown")
	public void user_Selects_Class_from_the_dropdown() {
		try {
	   WebElement Class=driver.findElement(By.tagName("Select"));  
	   base.selectText("Sleeper (SL)", Class);
	   //	   Select s=new Select(Class);
//	   s.selectByVisibleText("Sleeper (SL)");
	}catch(Exception e) {
		  e.printStackTrace();}}
	@When("User Selects Date from the Calander")
	public void user_Selects_Date_from_the_Calander() {
	   try {
//		   WebElement Calendar=driver.findElement(By.xpath("//a[text()=\"12\"]"));
		   base.button(ct.getCalendar());
//		   base.button(Calendar);
//		   Calendar.click();
	   }catch(Exception e) {
		  	  e.printStackTrace();}
	}

	@When("User Selects Adults from the dorpdown {string}")
	public void user_Selects_Adults_from_the_dorpdown(String Adults) {
		try {
//	    	WebElement Adults1=driver.findElement(By.xpath("//select[@name=\"adults\"]"));
	    	base.selectText(Adults, ct.getAdults());
//	    	base.selectText(Adults, Adults1);
	    	//	    	Select s=new Select(Adults1);
//	    	   s.selectByVisibleText(Adults);
	    }catch(Exception e) {
		  	  e.printStackTrace();}
	}
	@When("User Selects Adults from the dorpdown")
	public void user_Selects_Adults_from_the_dorpdown() {
	    try {
//	    	WebElement Adults=driver.findElement(By.xpath("//select[@name=\"adults\"]"));
	    	base.selectText("2", ct.getAdults());
//	    	base.selectText("2", Adults);
	    	//	    	Select s=new Select(Adults);
//	    	   s.selectByVisibleText("2");
	    }catch(Exception e) {
		  	  e.printStackTrace();}
	}
	@When("User Selects Children from the dropdown {string}")
	public void user_Selects_Children_from_the_dropdown(String Children) {
		 try {
//			   WebElement Children1=driver.findElement(By.xpath("//select[@name=\"children\"]"));
			   base.selectText(Children, ct.getChildren1());
//			   base.selectText(Children, Children1);
			   //		   	Select s=new Select(Children1);
//		   	   s.selectByVisibleText(Children);
		   }catch(Exception e) {
			  	  e.printStackTrace();}
	}
	@When("User Selects Children from the dropdown")
	public void user_Selects_Children_from_the_dropdown() {
	   try {
//		   WebElement Children=driver.findElement(By.xpath("//select[@name=\"children\"]"));
		   base.selectText("3", ct.getChildren());
//		   base.selectText("3", Children);
		   //	   	Select s=new Select(Children);
//	   	   s.selectByVisibleText("3");
	   }catch(Exception e) {
		  	  e.printStackTrace();}
	}
	@When("User Selects Senior men from the dropdown {string}")
	public void user_Selects_Senior_men_from_the_dropdown(String Men) {
		try {
//			   WebElement Men1=driver.findElement(By.xpath("//select[@name=\"male_seniors\"]"));
			   base.selectText(Men, ct.getMen1());
//			   base.selectText(Men, Men1);
			   //		   	Select s=new Select(Men1);
//		   	   s.selectByVisibleText(Men);
		   }catch(Exception e) {
			  	  e.printStackTrace();}
	}
	@When("User Selects Senior men from the dropdown")
	public void user_Selects_Senior_men_from_the_dropdown() {
		try {
//			   WebElement Men=driver.findElement(By.xpath("//select[@name=\"male_seniors\"]"));
			   base.selectText("0", ct.getMen());		   
//			   base.selectText("0", Men);
//			   Select s=new Select(Men);
//		   	   s.selectByVisibleText("0");
		   }catch(Exception e) {
			  	  e.printStackTrace();}
	}
	@When("User Selects Senior women from the dropdown {string}")
	public void user_Selects_Senior_women_from_the_dropdown(String Women) {
		try {
//			   WebElement Women1=driver.findElement(By.xpath("//select[@name=\"female_seniors\"]"));
			   base.selectText(Women, ct.getWomen1());     
//			   base.selectText(Women, Women1);
			   //		   	Select s=new Select(Women1);
//		   	   s.selectByVisibleText(Women);
		   }catch(Exception e) {
			  	  e.printStackTrace();}
	}
	@When("User Selects Senior women from the dropdown")
	public void user_Selects_Senior_women_from_the_dropdown() {
		try {
//			   WebElement Women=driver.findElement(By.xpath("//select[@name=\"female_seniors\"]"));
			   base.selectText("1", ct.getWomen());
//			   base.selectText("1", Women);
			   //		   	Select s=new Select(Women);
//		   	   s.selectByVisibleText("1");
		   }catch(Exception e) {
			  	  e.printStackTrace();}
	}

	@When("User Clicks On Search Trains")
	public void user_Clicks_On_Search_Trains() {
		try {
//			  WebElement Search=driver.findElement(By.xpath("//button[text()='Search trains']"));
			  base.button(ct.getSearch());
//			  base.button(Search);
//			  Search.click();
		   }catch(Exception e) {
			  	  e.printStackTrace();}
	}
	@When("User Sign In to Clear Trip")
	public void user_Sign_In_to_Clear_Trip() {
	    try {
//	    WebElement SignIn=driver.findElement(By.xpath("//a[@id=\"close\"]"));
		    base.button(ct.getSignIn());        
//	    base.button(SignIn);
//	    SignIn.click();
	    }catch(Exception e) {
		  	  e.printStackTrace();}
	}

	@Then("User Takes a ScreenShot1")
	public void user_Takes_a_ScreenShot1() {
		   try {
			   base.screenshot("Screenshot1");
//			   TakesScreenshot ts = (TakesScreenshot)driver ;
//			    File source =ts.getScreenshotAs(OutputType.FILE);
//			    File target = new File("C:\\Users\\Admin\\eclipse-workspace\\sukanya\\CogecoCucumber\\target\\BookASeat1.png");
//			    FileUtils.copyFile(source, target);
		}catch(Exception e) {
		  	  e.printStackTrace();}
	}
	@Then("User Takes a ScreenShot2")
	public void user_Takes_a_ScreenShot2() {
		try {
			base.screenshot("Screenshot2");
//			   TakesScreenshot ts = (TakesScreenshot)driver ;
//			    File source =ts.getScreenshotAs(OutputType.FILE);
//			    File target = new File("C:\\Users\\Admin\\eclipse-workspace\\sukanya\\CogecoCucumber\\target\\BookASeat2.png");
//			    FileUtils.copyFile(source, target);
		}catch(Exception e) {
		  	  e.printStackTrace();}
	}
	@Then("User Takes a ScreenShots {string}")
	public void user_Takes_a_ScreenShots(String ScreenShot3) {
		try {
			base.screenshot(ScreenShot3);
//			   TakesScreenshot ts = (TakesScreenshot)driver ;
//			    File source =ts.getScreenshotAs(OutputType.FILE);
//			    File target = new File("C:\\Users\\Admin\\eclipse-workspace\\sukanya\\CogecoCucumber\\target\\'"+ScreenShot3+"'.png");
//			    FileUtils.copyFile(source, target);
		}catch(Exception e) {
		  	  e.printStackTrace();}

	}
	}
