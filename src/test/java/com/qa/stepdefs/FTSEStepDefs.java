package com.qa.stepdefs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FTSEStepDefs {
	
	private static RemoteWebDriver driver;
	@Given("I can access {string}")
	public void i_can_access(String string) {
		driver = SelenuimWebDriver.getDriver();
		driver.manage().window().setSize(new Dimension(1366, 768));
		driver.get("https://" + string);
	}

	@Given("I navigate to the risers page")
	public void i_navigate_to_the_risers_page() {
		WebElement acceptCookie = driver.findElement(By.xpath("//*[@id=\"acceptCookie\"]"));
		acceptCookie.click();
	    WebElement risersPageLink = driver.findElement(By.xpath("/html/body/main/div/div/div[3]/div/div[4]/div[1]/ul/li[2]/a/strong"));
	    risersPageLink.click();
	}

	@Given("I should see {string} on the page as the highest riser")
	public void i_should_see_on_the_page_as_the_highest_riser(String string) {
	    WebElement highestRiser = driver.findElement(By.cssSelector("#ls-row-IAG-L > td.name-col.align-left > a"));
	    assertEquals(string, highestRiser.getText() );
	}

	@Given("then I navigate to the fallers page")
	public void then_i_navigate_to_the_fallers_page() {
	    WebElement fallerPageLink = driver.findElement(By.xpath("/html/body/main/div/div/div[3]/div[4]/div[1]/div[1]/ul/li[3]/a"));
	    fallerPageLink.click();
	}

	@Then("I should see {string} on the page as the top faller")
	public void i_should_see_on_the_page_as_the_top_faller(String string) {
	    WebElement highestFaller = driver.findElement(By.xpath("/html/body/main/div/div/div[3]/div[4]/div[1]/div[2]/table/tbody/tr[8]/td[2]/a"));
	    assertEquals(string, highestFaller.getText() );
	}

}
