#Author:Varun Subraya Yadapadithaya
#San Jose, California.
#vyadapadithaya@alumni.scu.edu
###################################################

@AutomationAssignment
Feature: WeInvest tests- Test A tests the changes made to the percentage of investments in the current portfolio
Test B, tests the addition of a stock to the portfolio &
Test C tests the responsiveness of the webelements when the window is resized.

  @TestA
  Scenario: Test A: The changes made to the percentage of investments in the current portfolio
    Given Navigate to https://sfo-demo.herokuapp.com/model-portfolio
    When I Select “All Weather Strategy” by clicking on “Explore Investment Ideas”
    And In next screen click on button “Customize Portfolio” to make changes to portfolio
    And Click on “Customize” button to enable edit controls
    And Change slider of “ SPDR S&P 500 ETF TRUST SPY US EQUITY ” to 50%
    And Click on “Rebalance” button
    And Click on “Invest” button
    Then On next page” verify that “SPDR...” under “What does your portfolio contain ?” to be 50%
    
  @TestB
  Scenario: Test B: The addition of a stock to the portfolio
    Given Navigate to https://sfo-demo.herokuapp.com/model-portfolio
    When I Select “All Weather Strategy” by clicking on “Explore Investment Ideas”
    And In next screen click on button “Customize Portfolio” to make changes to portfolio
    And Click on “Customize” button to enable edit controls
    Then Click on “Customise” button and ensure the text change to “Reset”
    And Click on “+Add Stock”
    And Click “Add Stock” in “BT Group plc” row.
    And Click on “Done”
    Then I Check whether “BT Group plc” is added to the portfolio
    
  @TestC
  Scenario: Test C: Tests the responsiveness of the webelements when the window is resized
    Given Navigate to https://sfo-demo.herokuapp.com/model-portfolio
    And I Check whether tabs “X Portfolio recommendations based on your preferences” and “Y other portfolio choices available” are available, Where X, Y are numbers
    When I Resize browser window to 375 x 667
    Then Check whether tabs “Recommended” & “Others” are available after resize
    And Check X, Y are same before and after resizing the window
    
 
    