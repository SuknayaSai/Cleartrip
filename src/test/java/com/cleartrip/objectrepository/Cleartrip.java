package com.cleartrip.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

import com.baseclass.BaseClass;

public class Cleartrip extends BaseClass {
	public Cleartrip() {
		PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@title=\\\"From station\\\"]")
private WebElement From;

@FindBy(xpath="//input[@title=\\\"From station\\\"]")
private WebElement From1;

@FindBy(xpath="//input[@title=\\\"To station\\\"]")
private WebElement To1;

@FindBy(xpath="//input[@title=\\\"To station\\\"]")
private WebElement To;

@FindBy(xpath="//a[text()=\\\"12\\\"]")
private WebElement Calendar;

@FindBy(xpath="//select[@name=\\\"adults\\\"]")
private WebElement Adults1;

@FindBy(xpath="//select[@name=\\\"adults\\\"]")
private WebElement Adults;

@FindBy(xpath="//select[@name=\\\"children\\\"]")
private WebElement Children1;


@FindBy(xpath="//select[@name=\\\"children\\\"]")
private WebElement Children;


@FindBy(xpath="//select[@name=\\\"male_seniors\\\"]")
private WebElement Men1;


@FindBy(xpath="//select[@name=\\\"male_seniors\\\"]")
private WebElement Men;


@FindBy(xpath="//select[@name=\\\"female_seniors\\\"]")
private WebElement Women1;


@FindBy(xpath="//select[@name=\\\"female_seniors\\\"]")
private WebElement Women;


@FindBy(xpath="//button[text()='Search trains']")
private WebElement Search;

@FindBy(xpath="//a[@id=\\\"close\\\"]")
private WebElement SignIn;

public WebElement getFrom() {
return From;}

public WebElement getFrom1() {
	return From1;
	
}public WebElement getTo1() {
	return To1;
}

public WebElement getTo() {
	return To;
}

public WebElement getCalendar() {
	return Calendar;
}

public WebElement getAdults1() {
	return Adults1;
}

public WebElement getAdults() {
	return Adults;
}

public WebElement getChildren1() {
	return Children1;
}

public WebElement getChildren() {
	return Children;
}

public WebElement getMen1() {
	return Men1;
}
public WebElement getMen() {
	return Men;
}

public WebElement getWomen1() {
	return Women1;
}

public WebElement getWomen() {
	return Women;
}

public WebElement getSearch() {
	return Search;
}


public WebElement getSignIn() {
	return SignIn;
}





}