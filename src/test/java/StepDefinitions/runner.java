/*Author:Varun Subraya Yadapadithaya
San Jose, California.
vyadapadithaya@alumni.scu.edu
*/
package StepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin ={"pretty" , "html:Reports/cucumber-reports"},features= {"src/test/resources/features"},monochrome = true /*, tags= {"~@TestA","~@TestC"}*/)
public class runner {

}
