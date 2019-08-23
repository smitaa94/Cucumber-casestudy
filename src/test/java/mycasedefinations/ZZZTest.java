package mycasedefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ZZZTest {
 static WebDriver  driver = null;

@Given("zzTest me app is launched")
public void zztest_me_app_is_launched() {
    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
	System.out.println("code1");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe\\");
	  driver =new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm#");
}

@Then("zzuser clicks on log in button")
public void zzuser_clicks_on_log_in_button() {
    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
	System.out.println("code2");
//	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	
}

@Then("zzuser enters valid username {string}")
public void zzuser_enters_valid_username(String string) {
    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
	System.out.println("code3");
	   driver.findElement(By.name("userName")).sendKeys(string);
	
	
}

@Then("zzuser enters pssword {string}")
public void zzuser_enters_pssword(String string) {
    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
	System.out.println("code4");
	driver.findElement(By.name("password")).sendKeys(string);
}

@Given("zzuser logged in into test me app")
public void zzuser_logged_in_into_test_me_app() {
    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
	System.out.println("code5");
	driver.findElement(By.name("Login")).click();
}

@Then("zzuser search the products")
public void zzuser_search_the_products() {
    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
	System.out.println("code6");
	driver.close();
}

@Then("zzuser selects the product")
public void zzuser_selects_the_product() {
    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
	System.out.println("code7");
}

@Then("zzadd the product to cart")
public void zzadd_the_product_to_cart() {
    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
	System.out.println("code8");
}

@Then("zzuser purchases the product")
public void zzuser_purchases_the_product() {
    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
	System.out.println("code9");
}

}
