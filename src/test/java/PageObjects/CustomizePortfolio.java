package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CustomizePortfolio {
	public CustomizePortfolio(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	
	@FindBy(how = How.XPATH, using = "//a[contains(.,'Customise')]")
	private WebElement a_Customize;
	
	@FindBy(how = How.XPATH, using = "//a[contains(.,'Rebalance')]")
	private WebElement a_Rebalance;
	
	@FindBy(how = How.XPATH, using = "//a[contains(.,'Invest Now')]")
	private WebElement a_Invest;
	
	@FindBy(how = How.XPATH, using = "//a[contains(.,'Reset')]")
	private WebElement a_Reset;
	
	@FindBy(how = How.XPATH, using = "//input[contains(@data-isin,'SPY')]")
	private WebElement input_Slider_SDPR_SPYEquity;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'US EQUITIES')]/following::a[contains(text(),'+ Add Stock')][1]")
	private WebElement a_AddStock;
	
	@FindBy(how = How.XPATH, using = "//div[@class='panel-body']")
	private WebElement a_ScrollElement;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='modal-header'][contains(.,'Add ETFs×')])[1]")
	private WebElement header_AddETF;
	
	@FindBy(how = How.XPATH, using = "(//button[@data-isin='BT' and contains(.,'Add Stock')])[1]")
	private WebElement BTGrpPlcStock_AddButton;
	
	@FindBy(how = How.XPATH, using = "(//button[contains(.,'Done')])[1]")
	private WebElement AddStock_Done_Btn;
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-1'][contains(.,'BT')]")
	private WebElement BTStock;
	
	
	
	public void click_Customize_btn() {
		a_Customize.click();
	}
	public void click_Rebalance_btn() {
		a_Rebalance.click();
	}
	public void click_Invest_btn() {
		a_Invest.click();
	}
	public void click_AddStock_btn() {
		a_AddStock.click();
	}
	public void click_AddStockBTGrpPlcStock_btn() {
		BTGrpPlcStock_AddButton.click();
	}
	public void click_Done() {
		AddStock_Done_Btn.click();
	}
	public void scrollTo_AddStockBTGrpPlcStock_btn(WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", BTGrpPlcStock_AddButton);
	}
	public void scrollTo_Done_btn(WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AddStock_Done_Btn);
	}
	public void scrollTo_Customize_btn(WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", a_Customize);
	}
	public void scrollabove_Customize_btn(WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", a_ScrollElement);
	}
	
	public void Slider(int arg1) {
		String value_str;
		value_str =input_Slider_SDPR_SPYEquity.getAttribute("value");
		int value = Integer.parseInt(value_str);
		while(value!= arg1) {
			if(value < arg1) {
		input_Slider_SDPR_SPYEquity.sendKeys(Keys.RIGHT);
			}else {
				input_Slider_SDPR_SPYEquity.sendKeys(Keys.LEFT);
			}
		value_str =input_Slider_SDPR_SPYEquity.getAttribute("value");
		value = Integer.parseInt(value_str);
				
		}
	}
	
	public boolean CustomiseButton_isdisp() {
		boolean display;
		try {
			 display = a_Customize.isDisplayed();
			
        } catch (NoSuchElementException exception) {
           return false;
        }
		return display;
	}
	
	public boolean ResetButton_isdisp() {
		boolean display = a_Reset.isDisplayed();
			return display;
			 }
	
	public boolean HeaderAddETF_isdisp() {
		
		boolean display;
		try {
		 display = header_AddETF.isDisplayed();
			
        } catch (NoSuchElementException exception) {
           return false;
        }
		return display;
			 }
	
public boolean BTGrpPlcStock_isdisp() {
		
		boolean display;
		try {
		 display = BTStock.isDisplayed();
			
        } catch (NoSuchElementException exception) {
           return false;
        }
		return display;
			 }

}
