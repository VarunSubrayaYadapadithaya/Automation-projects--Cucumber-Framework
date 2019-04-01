package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SuggestionsPage {
	public SuggestionsPage(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	
	@FindBy(how = How.XPATH, using = "//span[contains(.,'What does your portfolio contain?')]")
	private WebElement span_WhatDoesPortfolioContainHeader;
	
	@FindBy(how = How.XPATH, using = "//span[contains(.,'SPDR S&P500 ETF Trust')]/following::span[1]")
	private WebElement span_SDPR_Percentage;
	
	@FindBy(how = How.XPATH, using = "//span[contains(.,'Where do we invest your money')]")
	private WebElement span_WhereDoWeInvest_Header;
	
	
	public void scrollTo_PortfolioContents(WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", span_WhatDoesPortfolioContainHeader);
	}
	
	public void scrollTo_WheredoWeInvestMoneyHeader(WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", span_WhereDoWeInvest_Header);
	}
	
	public String SDPR_getPercentage() {
		String text = span_SDPR_Percentage.getText();
			return text;
			 
			 }
}
