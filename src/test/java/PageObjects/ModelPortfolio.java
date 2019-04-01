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

public class ModelPortfolio {
	
	public ModelPortfolio(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'All Weather Strategy')]/following::a[contains(.,'Explore Investment Ideas')][1]")
	private WebElement allWeathr_ExpInvIdeas_Btn;
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='model-portfolio-navs hidden-sm hidden-xs']//a)[1]")
	private WebElement recommended_Tab_fullscreen;
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='model-portfolio-navs mobile hidden-md hidden-lg']//a)[1]")
	private WebElement recommended_Tab_resize;
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='model-portfolio-navs hidden-sm hidden-xs']//a)[2]")
	private WebElement others_Tab_fullscreen;
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='model-portfolio-navs mobile hidden-md hidden-lg']//a)[2]")
	private WebElement others_Tab_resize;
	
	public boolean recommended_fullscr_isdisp() {
	boolean display = recommended_Tab_fullscreen.isDisplayed();
		return display;
		 
		 }
	public boolean recommended_resize_isdisp() {
		boolean display = recommended_Tab_resize.isDisplayed();
			return display;
			 }
	public boolean othersTab_resize_isdisp() {
		boolean display = others_Tab_resize.isDisplayed();
			return display;
			 }
	public boolean othersTab_fullscr_isdisp() {
		boolean display = others_Tab_fullscreen.isDisplayed();
			return display;
			 }
	
	public String recommended_fullscr_getText() {
		String text = recommended_Tab_fullscreen.getText();
			return text;
			 
			 }
	public String recommended_resize_getText() {
			String text = recommended_Tab_resize.getText();
				return text;
				 }
	public String othersTab_resize_getText() {
			String text = others_Tab_resize.getText();
				return text;
				 }
	public String othersTab_fullscr_getText() {
			String text = others_Tab_fullscreen.getText();
				return text;
				 }
	public String recommended_fullscr_getCount() {
			String text = recommended_Tab_fullscreen.getText();
			String numbers=text.replaceAll("[^0-9]", "");
				return numbers;
				 
				 }
	public String recommended_resize_getCount() {
				String text = recommended_Tab_resize.getText();
				String numbers=text.replaceAll("[^0-9]", "");
					return numbers;
					 }
	public String othersTab_resize_getCount() {
				String text = others_Tab_resize.getText();
				String numbers=text.replaceAll("[^0-9]", "");
					return numbers;
					 }
	public String othersTab_fullscr_getCount() {
				String text = others_Tab_fullscreen.getText();
				String numbers=text.replaceAll("[^0-9]", "");
					return numbers;
					 }
	public void clickExplore_Investment_Ideas() {
		allWeathr_ExpInvIdeas_Btn.click();
	}	
}
