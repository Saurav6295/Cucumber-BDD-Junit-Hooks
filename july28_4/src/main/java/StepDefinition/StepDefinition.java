package StepDefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.After;


public class StepDefinition {
	

	
	
	//Global hooks
	@Before(order=0)
	public void setUP1()
	{
		System.out.println("Launch browser1");
		
	}
	@After(order=0)
	public void tearDown1()
	{
		System.out.println("close the browser1");
		
	}
	@Before(order=1)
	public void setUP2()
	{
		System.out.println("Launch browser2");
		
	}
	@After(order=1)
	public void tearDown2()
	{
		System.out.println("close the browser2");
		
	}
	@Before("@Smoke")
	public void beforefirst()
	{
		System.out.println("tagged hooks1");
	}
	@After("@Sanity")
	public void aftersecond()
	{
		System.out.println("tagged hooks2");
	}
	
	@Before("@Regression")
	public void beforeregression()
	{
		System.out.println("tagged hooks3");	
	}
	
	@Given("^user1 is on home page1$")
	public void method1()
	{
		
		System.out.println("method1");	
	}
	@When("^user2 is on home page2$")
	public void method2()
	{
		
		System.out.println("method2");	
	}
	@Then("^user3 is on home page3$")
	public void method3()
	{
		
		System.out.println("method3");	
	}
	@Given("^user4 is on home page4$")
	public void method4()
	{
		
		System.out.println("method4");	
	}
	@When("^user5 is on home page5$")
	public void method5()
	{
		
		System.out.println("method5");	
	}
	@Then("^user6 is on home page6$")
	public void method6()
	{
		
		System.out.println("method6");	
	}
	
	@Given("^user7 is on home page7$")
	public void method7()
	{
		
		System.out.println("method7");	
	}
	@When("^user8 is on home page8$")
	public void method8()
	{
		
		System.out.println("method8");	
	}
	@Then("^user9 is on home page9$")
	public void method9()
	{
		
		System.out.println("method9");	
	}
	
		
}
