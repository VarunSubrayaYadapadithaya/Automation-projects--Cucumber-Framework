$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("WeInvestAssignment.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author:Varun Subraya Yadapadithaya"
    },
    {
      "line": 2,
      "value": "#San Jose, California."
    },
    {
      "line": 3,
      "value": "#vyadapadithaya@alumni.scu.edu"
    },
    {
      "line": 4,
      "value": "###################################################"
    }
  ],
  "line": 7,
  "name": "WeInvest tests- Test A tests the changes made to the percentage of investments in the current portfolio",
  "description": "Test B, tests the addition of a stock to the portfolio \u0026\nTest C tests the responsiveness of the webelements when the window is resized.",
  "id": "weinvest-tests--test-a-tests-the-changes-made-to-the-percentage-of-investments-in-the-current-portfolio",
  "keyword": "Feature",
  "tags": [
    {
      "line": 6,
      "name": "@AutomationAssignment"
    }
  ]
});
formatter.scenario({
  "line": 12,
  "name": "Test A: The changes made to the percentage of investments in the current portfolio",
  "description": "",
  "id": "weinvest-tests--test-a-tests-the-changes-made-to-the-percentage-of-investments-in-the-current-portfolio;test-a:-the-changes-made-to-the-percentage-of-investments-in-the-current-portfolio",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@TestA"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "Navigate to https://sfo-demo.herokuapp.com/model-portfolio",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I Select “All Weather Strategy” by clicking on “Explore Investment Ideas”",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "In next screen click on button “Customize Portfolio” to make changes to portfolio",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Click on “Customize” button to enable edit controls",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Change slider of “ SPDR S\u0026P 500 ETF TRUST SPY US EQUITY ” to 50%",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Click on “Rebalance” button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Click on “Invest” button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "On next page” verify that “SPDR...” under “What does your portfolio contain ?” to be 50%",
  "keyword": "Then "
});
formatter.match({
  "location": "WeInvestAssignment.navigate_to_https_sfo_demo_herokuapp_com_model_portfolio()"
});
formatter.result({
  "duration": 8211073627,
  "status": "passed"
});
formatter.match({
  "location": "WeInvestAssignment.i_Select_All_Weather_Strategy_by_clicking_on_Explore_Investment_Ideas()"
});
formatter.result({
  "duration": 3815631433,
  "status": "passed"
});
formatter.match({
  "location": "WeInvestAssignment.in_next_screen_click_on_button_Customize_Portfolio_to_make_changes_to_portfolio()"
});
formatter.result({
  "duration": 6123138957,
  "status": "passed"
});
formatter.match({
  "location": "WeInvestAssignment.click_on_Customize_button_to_enable_edit_controls()"
});
formatter.result({
  "duration": 5421121306,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "500",
      "offset": 28
    },
    {
      "val": "50",
      "offset": 61
    }
  ],
  "location": "WeInvestAssignment.change_slider_of_SPDR_S_P_ETF_TRUST_SPY_US_EQUITY_to(int,int)"
});
formatter.result({
  "duration": 13309454292,
  "status": "passed"
});
formatter.match({
  "location": "WeInvestAssignment.click_on_Rebalance_button()"
});
formatter.result({
  "duration": 3289490507,
  "status": "passed"
});
formatter.match({
  "location": "WeInvestAssignment.click_on_Invest_button()"
});
formatter.result({
  "duration": 3747660015,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 85
    }
  ],
  "location": "WeInvestAssignment.on_next_page_verify_that_SPDR_under_What_does_your_portfolio_contain_to_be(double)"
});
formatter.result({
  "duration": 1055405005,
  "error_message": "java.lang.AssertionError: expected:\u003c50.0\u003e but was:\u003c13.79\u003e\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\n\tat org.junit.Assert.assertEquals(Assert.java:553)\n\tat org.junit.Assert.assertEquals(Assert.java:683)\n\tat StepDefinitions.WeInvestAssignment.on_next_page_verify_that_SPDR_under_What_does_your_portfolio_contain_to_be(WeInvestAssignment.java:160)\n\tat ✽.Then On next page” verify that “SPDR...” under “What does your portfolio contain ?” to be 50%(WeInvestAssignment.feature:20)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1201109967,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Test B: The addition of a stock to the portfolio",
  "description": "",
  "id": "weinvest-tests--test-a-tests-the-changes-made-to-the-percentage-of-investments-in-the-current-portfolio;test-b:-the-addition-of-a-stock-to-the-portfolio",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@TestB"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "Navigate to https://sfo-demo.herokuapp.com/model-portfolio",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I Select “All Weather Strategy” by clicking on “Explore Investment Ideas”",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "In next screen click on button “Customize Portfolio” to make changes to portfolio",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Click on “Customize” button to enable edit controls",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Click on “Customise” button and ensure the text change to “Reset”",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Click on “+Add Stock”",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Click “Add Stock” in “BT Group plc” row.",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Click on “Done”",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I Check whether “BT Group plc” is added to the portfolio",
  "keyword": "Then "
});
formatter.match({
  "location": "WeInvestAssignment.navigate_to_https_sfo_demo_herokuapp_com_model_portfolio()"
});
formatter.result({
  "duration": 7389073759,
  "status": "passed"
});
formatter.match({
  "location": "WeInvestAssignment.i_Select_All_Weather_Strategy_by_clicking_on_Explore_Investment_Ideas()"
});
formatter.result({
  "duration": 3629978451,
  "status": "passed"
});
formatter.match({
  "location": "WeInvestAssignment.in_next_screen_click_on_button_Customize_Portfolio_to_make_changes_to_portfolio()"
});
formatter.result({
  "duration": 5387861761,
  "status": "passed"
});
formatter.match({
  "location": "WeInvestAssignment.click_on_Customize_button_to_enable_edit_controls()"
});
formatter.result({
  "duration": 5384023410,
  "status": "passed"
});
formatter.match({
  "location": "WeInvestAssignment.click_on_Customise_button_and_ensure_the_text_change_to_Reset()"
});
formatter.result({
  "duration": 20087010002,
  "status": "passed"
});
formatter.match({
  "location": "WeInvestAssignment.click_on_Add_Stock()"
});
formatter.result({
  "duration": 27149754125,
  "status": "passed"
});
formatter.match({
  "location": "WeInvestAssignment.click_Add_Stock_in_BT_Group_plc_row()"
});
formatter.result({
  "duration": 392770959,
  "status": "passed"
});
formatter.match({
  "location": "WeInvestAssignment.click_on_Done()"
});
formatter.result({
  "duration": 3272648949,
  "status": "passed"
});
formatter.match({
  "location": "WeInvestAssignment.i_Check_whether_BT_Group_plc_is_added_to_the_portfolio()"
});
formatter.result({
  "duration": 27536511,
  "status": "passed"
});
formatter.after({
  "duration": 615450310,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Test C: Tests the responsiveness of the webelements when the window is resized",
  "description": "",
  "id": "weinvest-tests--test-a-tests-the-changes-made-to-the-percentage-of-investments-in-the-current-portfolio;test-c:-tests-the-responsiveness-of-the-webelements-when-the-window-is-resized",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 34,
      "name": "@TestC"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "Navigate to https://sfo-demo.herokuapp.com/model-portfolio",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "I Check whether tabs “X Portfolio recommendations based on your preferences” and “Y other portfolio choices available” are available, Where X, Y are numbers",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I Resize browser window to 375 x 667",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "Check whether tabs “Recommended” \u0026 “Others” are available after resize",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "Check X, Y are same before and after resizing the window",
  "keyword": "And "
});
formatter.match({
  "location": "WeInvestAssignment.navigate_to_https_sfo_demo_herokuapp_com_model_portfolio()"
});
formatter.result({
  "duration": 7893976417,
  "status": "passed"
});
formatter.match({
  "location": "WeInvestAssignment.check_whether_tabs_X_Portfolio_recommendations_based_on_your_preferences_and_Y_other()"
});
formatter.result({
  "duration": 239038513,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "375",
      "offset": 27
    },
    {
      "val": "667",
      "offset": 33
    }
  ],
  "location": "WeInvestAssignment.i_Resize_browser_window_to_x(int,int)"
});
formatter.result({
  "duration": 3114771070,
  "status": "passed"
});
formatter.match({
  "location": "WeInvestAssignment.check_whether_tabs_Recommended_Others_are_available_after_resize()"
});
formatter.result({
  "duration": 122529041,
  "status": "passed"
});
formatter.match({
  "location": "WeInvestAssignment.check_X_Y_are_same_before_and_after_resizing_the_window()"
});
formatter.result({
  "duration": 38274645,
  "status": "passed"
});
formatter.after({
  "duration": 633513484,
  "status": "passed"
});
});