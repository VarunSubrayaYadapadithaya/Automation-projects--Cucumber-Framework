/*Author:Varun Subraya Yadapadithaya
San Jose, California.
vyadapadithaya@alumni.scu.edu
*/
package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WeatherPortfolio {
	public WeatherPortfolio(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	
	@FindBy(how = How.XPATH, using = "//a[contains(@class,'btn btn-success btn-invest btn-md btn-customize-portfolio') and contains(text(),'Customize Portfolio')]")
	private WebElement CustomizePortfolio_Btn;
	
	public void click_Customize() {
		CustomizePortfolio_Btn.click();
	}
}
