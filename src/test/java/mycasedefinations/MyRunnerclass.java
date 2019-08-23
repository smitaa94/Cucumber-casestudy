package mycasedefinations;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
//for all single feature file
//plugin is for generating html report
//json:target/cucumber.json" for communication between jenkins and eclipse
//@CucumberOptions(features="C:\\Users\\training_h2a.06.15\\Desktop\\Selenium workspace\\cucumber1\\myfeatures\\DemoTags.feature",glue="mystepdefinations",tags= {"@Regression,@Smoke"},plugin= {"html:target/cucumber-htmlreport.html","json:target/cucumber.json"})
//for single feature file
//@CucumberOptions(features="C:\\Users\\training_h2a.06.15\\Desktop\\Selenium workspace\\cucumber1\\src\\test\\java\\mystepdefinations\\TestmeLogin.java",glue="mystepdefinations")
@CucumberOptions(features="C:\\Users\\training_h2a.06.15\\Desktop\\Selenium workspace\\CucumberCasestudy\\myyfeatures\\scenario1.feature",glue="mycasedefination",tags= {"@Smoke"},plugin= {"json:target/cucumber.json"})
public class MyRunnerclass {}



