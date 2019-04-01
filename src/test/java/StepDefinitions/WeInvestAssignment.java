/*Author:Varun Subraya Yadapadithaya
San Jose, California.
vyadapadithaya@alumni.scu.edu
*/

package StepDefinitions;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.CustomizePortfolio;
import PageObjects.ModelPortfolio;
import PageObjects.SuggestionsPage;
import PageObjects.WeatherPortfolio;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WeInvestAssignment {
	public static WebDriver driver;
	ModelPortfolio model;
	WeatherPortfolio weatherPortfolio;
	CustomizePortfolio customizePortfolio;
	SuggestionsPage results;
	
	@Given("^Navigate to https://sfo-demo\\.herokuapp\\.com/model-portfolio$")
	public void navigate_to_https_sfo_demo_herokuapp_com_model_portfolio()  {
		String path = System.getProperty("user.dir");
		String os = System.getProperty("os.name");
		System.out.println(path);
		System.out.println(os);
		if(os.contains("Windows")) {			//Run on Windows Machine
			System.setProperty("webdriver.chrome.driver", path+"/src/main/resources/Drivers/chromedriver.exe");
		}
		if(os.contains("Mac")){				//Run on Apple Mac 
			System.setProperty("webdriver.chrome.driver", path+"/src/main/resources/Drivers/chromedriver");
		}
		
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.navigate().to("https://sfo-demo.herokuapp.com/model-portfolio");
	    
	}

	@When("^I Select “All Weather Strategy” by clicking on “Explore Investment Ideas”$")
	public void i_Select_All_Weather_Strategy_by_clicking_on_Explore_Investment_Ideas()  {
	  model = new ModelPortfolio(driver);
	  model.clickExplore_Investment_Ideas(); 
	  System.out.println("All Weather Strategy Explore button is clicked");
	  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	}

	@When("^In next screen click on button “Customize Portfolio” to make changes to portfolio$")
	public void in_next_screen_click_on_button_Customize_Portfolio_to_make_changes_to_portfolio()  {
		weatherPortfolio = new WeatherPortfolio(driver);
		weatherPortfolio.click_Customize();  
		System.out.println("Customize Portfolio Clicked");
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}  
	    
	}

	@When("^Click on “Customize” button to enable edit controls$")
	public void click_on_Customize_button_to_enable_edit_controls()  {
		customizePortfolio = new CustomizePortfolio(driver);
		customizePortfolio.scrollabove_Customize_btn(driver);  
		System.out.println("Customise Button is clicked");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}  
    
		customizePortfolio.click_Customize_btn();  
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}  
	    
	}

	@When("^Change slider of “ SPDR S&P (\\d+) ETF TRUST SPY US EQUITY ” to (\\d+)%$")
	public void change_slider_of_SPDR_S_P_ETF_TRUST_SPY_US_EQUITY_to(int arg1, int arg2)  {
	    System.out.println(arg2);
	    customizePortfolio = new CustomizePortfolio(driver);
		customizePortfolio.Slider(arg2);			//Change the slider value to 50%
		System.out.println("Slider is changed to "+arg2);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}  
	    
	}

	@When("^Click on “Rebalance” button$")
	public void click_on_Rebalance_button()  {
		customizePortfolio = new CustomizePortfolio(driver);
		customizePortfolio.scrollabove_Customize_btn(driver);  
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}  
    
		customizePortfolio.click_Rebalance_btn();
		System.out.println("Rebalance button is clicked");
		  try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}     
	    
	}

	@When("^Click on “Invest” button$")
	public void click_on_Invest_button()  {
		customizePortfolio = new CustomizePortfolio(driver);
		customizePortfolio.scrollabove_Customize_btn(driver);  
		customizePortfolio.click_Invest_btn();
		System.out.println("Invest Button is clicked");
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}     
	    
	}

	@Then("^On next page” verify that “SPDR\\.\\.\\.” under “What does your portfolio contain \\?” to be (\\d+)%$")
	public void on_next_page_verify_that_SPDR_under_What_does_your_portfolio_contain_to_be(double arg1)  {
	    results = new SuggestionsPage(driver);
	    results.scrollTo_WheredoWeInvestMoneyHeader(driver);
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}  
	   double res = Double.parseDouble(results.SDPR_getPercentage());
	   assertEquals(arg1,res,0.0);		// The SDPR should be changed to 50
	    
	}

	@Then("^Click on “Customise” button and ensure the text change to “Reset”$")
	public void click_on_Customise_button_and_ensure_the_text_change_to_Reset()  {
		customizePortfolio = new CustomizePortfolio(driver);
		boolean disp = customizePortfolio.CustomiseButton_isdisp();
		assertEquals(false,disp);
		boolean disp2 = customizePortfolio.ResetButton_isdisp();
		assertEquals(true,disp2);
		System.out.println("Customise button changed to Reset");
	    
	}

	@Then("^Click on “\\+Add Stock”$")
	public void click_on_Add_Stock()  {
		customizePortfolio = new CustomizePortfolio(driver);
		boolean disp2= customizePortfolio.BTGrpPlcStock_isdisp();
		assertEquals(false,disp2);		//BT Group PLC stock is not displayed before adding it.
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		customizePortfolio.click_AddStock_btn();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean disp =customizePortfolio.HeaderAddETF_isdisp(); 
		assertEquals(true,disp);
		System.out.println("Add Stock Is Clicked");
		
	}

	@Then("^Click “Add Stock” in “BT Group plc” row\\.$")
	public void click_Add_Stock_in_BT_Group_plc_row()  {
		customizePortfolio = new CustomizePortfolio(driver);
		customizePortfolio.scrollTo_AddStockBTGrpPlcStock_btn(driver);
		customizePortfolio.click_AddStockBTGrpPlcStock_btn();
		
		System.out.println("BT Group PLC Add Button is clicked");
	    
	}

	@Then("^Click on “Done”$")
	public void click_on_Done()  {
		customizePortfolio = new CustomizePortfolio(driver);
		customizePortfolio.scrollTo_Done_btn(driver);
		customizePortfolio.click_Done();
		System.out.println("Done Button is clicked");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}

	@Then("^I Check whether “BT Group plc” is added to the portfolio$")
	public void i_Check_whether_BT_Group_plc_is_added_to_the_portfolio()  {
		customizePortfolio = new CustomizePortfolio(driver);
		boolean disp2= customizePortfolio.BTGrpPlcStock_isdisp();
		assertEquals(true,disp2);		//BT Group PLC stock is displayed after adding it. 
		System.out.println("BT Group PLC row is added to portfolio"); 
	}
	public static String x_fullscr;
	public static String y_fullscr;
	@And("^I Check whether tabs “X Portfolio recommendations based on your preferences” and “Y other portfolio choices available” are available, Where X, Y are numbers$")
	public void check_whether_tabs_X_Portfolio_recommendations_based_on_your_preferences_and_Y_other()  {
		model = new ModelPortfolio(driver);
		boolean disp = model.recommended_fullscr_isdisp();
		System.out.println("1:"+disp);
		assertEquals(true,disp);				//“X Portfolio recommendations based on your preferences” should be displayed
		
		String text = model.recommended_fullscr_getText();
		Assert.assertTrue(text.matches("^[0-9]+ Portfolio recommendations based on your preferences$"));	
		
		boolean disp2 = model.othersTab_fullscr_isdisp();
		System.out.println("2:"+disp2);
		assertEquals(true,disp2);				//“Y other portfolio choices available” should be displayed
		
		String text2 = model.othersTab_fullscr_getText();
		Assert.assertTrue(text2.matches("^[0-9]+ other portfolio choices available$"));	
		
		boolean disp3 = model.recommended_resize_isdisp();
		System.out.println("3:"+disp3);
		assertEquals(false,disp3);				//Recommended(X) is not displayed when in fullscreen
		
		boolean disp4 = model.othersTab_resize_isdisp();
		System.out.println("4:"+disp4);
		assertEquals(false,disp4);				//Others(Y) is not displayed when in fullscreen
		
		x_fullscr = model.recommended_fullscr_getCount();
		
		y_fullscr = model.othersTab_fullscr_getCount();
		
	}

	@When("^I Resize browser window to (\\d+) x (\\d+)$")
	public void i_Resize_browser_window_to_x(int arg1, int arg2)  {
		Dimension d = new Dimension(arg1,arg2);	//Resize current window to the set dimension
		        driver.manage().window().setSize(d);
		        System.out.println("Resizing Window to:"+arg1+" x "+arg2);
		        try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		        
	}

	@Then("^Check whether tabs “Recommended” & “Others” are available after resize$")
	public void check_whether_tabs_Recommended_Others_are_available_after_resize(){
		model = new ModelPortfolio(driver);
		boolean disp = model.recommended_fullscr_isdisp();
		System.out.println("1:"+disp);
		assertEquals(false,disp);				//“X Portfolio recommendations based on your preferences” should not be displayed when screen is resized
		
		boolean disp2 = model.othersTab_fullscr_isdisp();
		System.out.println("2:"+disp2);
		assertEquals(false,disp2);				//“Y other portfolio choices available” should not be displayed when screen is resized
		
		boolean disp3 = model.recommended_resize_isdisp();
		System.out.println("3:"+disp3);
		assertEquals(true, disp3);				//Recommended(X) is displayed when screen is resized
		
		String text = model.recommended_resize_getText();
		Assert.assertTrue(text.matches("^Recommended \\([0-9]+\\)$"));	
		
		boolean disp4 = model.othersTab_resize_isdisp();
		System.out.println("4:"+disp4);
		assertEquals(true,disp4);				//Others(Y) is displayed when screen is resized

		String text2= model.othersTab_resize_getText();
		Assert.assertTrue(text2.matches("^Others \\([0-9]+\\)$"));
  
	}

	public static String x_resize;
	public static String y_resize;
	
	@Then("^Check X, Y are same before and after resizing the window$")
	public void check_X_Y_are_same_before_and_after_resizing_the_window()  {
		x_resize = model.recommended_resize_getCount();
		y_resize = model.othersTab_resize_getCount();
		System.out.println("X_fullscr Count: "+x_fullscr);
		System.out.println("X_resize Count: "+x_resize);
		System.out.println("Y_fullscr Count: "+y_fullscr);
		System.out.println("Y_resize Count: "+y_resize);
		assertEquals(x_fullscr,x_resize);
		assertEquals(y_fullscr,y_resize);
		
		
	    
	}
	
	@After
	public void takeScreenshot(Scenario scenario) {
	    if (scenario.isFailed()) {
	            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	            scenario.embed(screenshot, "image/png"); 
	           
	    }
	    driver.quit();
	}
	
	
}
