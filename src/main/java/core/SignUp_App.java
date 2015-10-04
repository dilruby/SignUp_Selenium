package core;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.Document;



public class SignUp_App {

	public static void main(String[] args) throws ParserConfigurationException, Exception {

		//WebDriver driver = new HtmlUnitDriver();
		//((HtmlUnitDriver) driver).setJavascriptEnabled(true);
		
		WebDriver driver = new FirefoxDriver();
		String test_case_id_01 = "TC-001.01";
		String test_case_id_02 = "TC-001.02";
		String test_case_id_03 = "TC-001.03";
		String test_case_id_04 = "TC-001.04";
		String test_case_id_05 = "TC-001.05";
		String test_case_id_06 = "TC-001.06";
		String test_case_id_07 = "TC-001.07";
		String test_case_id_08 = "TC-001.08";
		String test_case_id_09 = "TC-001.09";
		String test_case_id_10 = "TC-001.10";
		String test_case_id_11 = "TC-001.11";
		String test_case_id_12 = "TC-001.12";
		String test_case_id_13 = "TC-001.13";
		String test_case_id_14 = "TC-001.14";
		String test_case_id_15 = "TC-001.15";
		String test_case_id_16 = "TC-001.16";
		String test_case_id_17 = "TC-001.17";
		String test_case_id_18 = "TC-001.18";
		String test_case_id_19 = "TC-001.19";
		String test_case_id_20 = "TC-001.20";
		String test_case_id_21 = "TC-001.21";
		String test_case_id_22 = "TC-001.22";
		String test_case_id_23 = "TC-001.23";
		String test_case_id_24 = "TC-001.24";
		String test_case_id_25 = "TC-001.25";
		String test_case_id_26 = "TC-001.26";
		String test_case_id_27 = "TC-001.27";
		String test_case_id_28 = "TC-001.28";
		String test_case_id_29 = "TC-001.29";
		
		String url = "http://learn2test.net/qa/apps/sign_up/v1/";
		String url0 = "http://learn2test.net/qa/apps/sign_up/v0/";
		String url_pars = "http://api.wunderground.com/api/8a75c2aa5ba78758/conditions/q/37.350101,-121.985397.xml";		
		//String url_pub_ip = "http://www.whatismypublicip.com/";

		String title_sign_up_expected = "Welcome to Sign Up v1";
		String apptitle_sign_up_expected = "Sign Up";

		String title_facebook_expected = "Facebook - Log In or Sign Up";
		String title_twitter_expected = "Twitter";
		String title_flickr_expected = "Flickr, a Yahoo company | Flickr - Photo Sharing!";
		String title_youtube_expected = "YouTube";

		String error_fname_empty_expected = "Please enter First Name";
		String error_lname_empty_expected = "Please enter Last Name";
		String error_email_empty_expected = "Please enter Email Address";
		String error_phone_empty_expected = "Please enter Phone Number";
		String invalid_fname_expected = "Invalid First Name: [a-zA-Z,.'-]{3,30}";
		String invalid_lname_expected = "Invalid Last Name: [a-zA-Z,.'-]{3,30}";
		String invalid_email_expected = "Invalid Email Address: xx[min2]@x[min1].xx[2-6]";
		String invalid_phone_expected = "Invalid Phone Number: should be 10 digits";
		
		
		String copyright_expected = "© 2015 learn2test.net";
		String os_browser_expected = "OS X 10.10 Yosemite";

		String fname = "Alex";
		String lname = "Moore";
		String email = "alexmoore@gmail.com";
		String phone = "415 555-1212";
		String gender = "Male";
		String state = "California";
		String terms = "Agreed";
		String xpath_loc = "//display_location/full";
		
		
		

		// TC-001.01 Page title validation

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String title_sign_up_actual = driver.getTitle();

		if (title_sign_up_expected.equals(title_sign_up_actual)) {
			System.out.println("Test Case ID: \t\t" + test_case_id_01 + " - PASSED");
			System.out.println("Title Expected/Actual: \t" + title_sign_up_expected + "/" + title_sign_up_actual);
			System.out.println("===============================================================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_01 + " - FAILED");
			System.out.println("Title Expected/Actual: \t" + title_sign_up_expected + "/" + title_sign_up_actual);
			System.out.println("===============================================================================");
		}

		// TC-001.02 Application title validation

		String apptitle_sign_up_actual = driver.findElement(By.id("id_f_title")).getText();

		if (apptitle_sign_up_expected.equals(apptitle_sign_up_actual)) {
			System.out.println("Test Case ID: \t\t" + test_case_id_02 + " - PASSED");
			System.out.println("Title Expected/Actual: \t" + apptitle_sign_up_expected + "/"
					+ apptitle_sign_up_actual);
			System.out.println("===============================================================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_02 + " - FAILED");
			System.out.println("Title Expected/Actual: \t" + apptitle_sign_up_expected + "/" + apptitle_sign_up_actual);
			System.out.println("===============================================================================");
		}

		// TC-001.03 Facebook image and its link validation

		driver.findElement(By.id("id_img_facebook")).click();
		ArrayList<String> allTabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allTabs.get(1));
		String title_facebook_actual = driver.getTitle();
		driver.close();
		driver.switchTo().window(allTabs.get(0));

		if (title_facebook_expected.equals(title_facebook_actual)) {
			System.out.println("Test Case ID: \t\t" + test_case_id_03 + " - PASSED");
			System.out.println("Title Expected/Actual: \t" + title_facebook_expected + "/" + title_facebook_actual);
			System.out.println("===============================================================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_03 + " - FAILED");
			System.out.println("Title Expected/Actual: \t" + title_facebook_expected + "/" + title_facebook_actual);
			System.out.println("===============================================================================");
		}

		// TC-001.04 Twitter image and its link validation

		driver.findElement(By.id("id_img_twitter")).click();
		ArrayList<String> allTabstw = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allTabstw.get(1));
		String title_twitter_actual = driver.getTitle();
		driver.close();
		driver.switchTo().window(allTabs.get(0));

		if (title_twitter_expected.equals(title_twitter_actual)) {
			System.out.println("Test Case ID: \t\t" + test_case_id_04 + " - PASSED");
			System.out.println("Title Expected/Actual: \t" + title_twitter_expected + "/" + title_twitter_actual);
			System.out.println("===============================================================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_04 + " - FAILED");
			System.out.println("Title Expected/Actual: \t" + title_twitter_expected + "/" + title_twitter_actual);
			System.out.println("===============================================================================");
		}

		// TC-001.05 Flickr image and its link validation

		driver.findElement(By.id("id_img_flickr")).click();
		ArrayList<String> allTabsfl = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allTabsfl.get(1));
		String title_flickr_actual = driver.getTitle();
		driver.close();
		driver.switchTo().window(allTabs.get(0));

		if (title_flickr_expected.equals(title_flickr_actual)) {
			System.out.println("Test Case ID: \t\t" + test_case_id_05 + " - PASSED");
			System.out.println("Title Expected/Actual: \t" + title_flickr_expected + "/" + title_flickr_actual);
			System.out.println("===============================================================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_05 + " - FAILED");
			System.out.println("Title Expected/Actual: \t" + title_flickr_expected + "/" + title_flickr_actual);
			System.out.println("===============================================================================");
		}

		// TC-001.06 Youtube image and its link validation

		driver.findElement(By.id("id_img_youtube")).click();
		ArrayList<String> allTabsyt = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allTabsyt.get(1));
		String title_youtube_actual = driver.getTitle();
		driver.close();
		driver.switchTo().window(allTabs.get(0));

		if (title_youtube_expected.equals(title_youtube_actual)) {
			System.out.println("Test Case ID: \t\t" + test_case_id_06 + " - PASSED");
			System.out.println("Title Expected/Actual: \t" + title_youtube_expected + "/" + title_youtube_actual);
			System.out.println("===============================================================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_06 + " - FAILED");
			System.out.println("Title Expected/Actual: \t" + title_youtube_expected + "/" + title_youtube_actual);
			System.out.println("===============================================================================");
		}

		// TC-001.07 Quote validation

		driver.findElement(By.id("id_quotes")).getText();
		String quote = driver.findElement(By.id("id_quotes")).getText();
		if (quote != null && quote.length() < 103 && quote.length() > 67) {
			System.out.println("Test Case ID: \t\t" + test_case_id_07 + " - PASSED");
			System.out.println("Quote length: \t\t" + quote.length());
			System.out.println("===============================================================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_07 + " - FAILED");
			System.out.println("Quote length: \t\t" + quote.length());
			System.out.println("===============================================================================");
		}

		// TC-001.08 Submit button and Error "Enter first name" validation

		driver.findElement(By.id("id_submit_button")).click();
		String error_fname_empty_actual = driver.findElement(By.id("ErrorLine")).getText();

		if (error_fname_empty_expected.equals(error_fname_empty_actual)) {
			System.out.println("Test Case ID: \t\t" + test_case_id_08 + " - PASSED");
			System.out
					.println("Error Expected/Actual: \t" + error_fname_empty_expected + "/" + error_fname_empty_actual);
			System.out.println("===============================================================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_08 + " - FAILED");
			System.out
					.println("Error Expected/Actual: \t" + error_fname_empty_expected + "/" + error_fname_empty_actual);
			System.out.println("===============================================================================");
		}

		// TC-001.09 Error "Enter last name" validation

		driver.findElement(By.id("id_fname")).clear();
		driver.findElement(By.id("id_fname")).sendKeys(fname);

		driver.findElement(By.id("id_submit_button")).click();

		String error_lname_empty_actual = driver.findElement(By.id("ErrorLine")).getText();

		if (error_lname_empty_expected.equals(error_lname_empty_actual)) {
			System.out.println("Test Case ID: \t\t" + test_case_id_09 + " - PASSED");
			System.out
					.println("Error Expected/Actual: \t" + error_lname_empty_expected + "/" + error_lname_empty_actual);
			System.out.println("===============================================================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_09 + " - FAILED");
			System.out
					.println("Error Expected/Actual: \t" + error_lname_empty_expected + "/" + error_lname_empty_actual);
			System.out.println("===============================================================================");
		}

		// TC-001.10 Error "Enter email" validation

		driver.findElement(By.id("id_fname")).clear();
		driver.findElement(By.id("id_fname")).sendKeys(fname);

		driver.findElement(By.id("id_lname")).clear();
		driver.findElement(By.id("id_lname")).sendKeys(lname);

		driver.findElement(By.id("id_submit_button")).click();

		String error_email_empty_actual = driver.findElement(By.id("ErrorLine")).getText();

		if (error_email_empty_expected.equals(error_email_empty_actual)) {
			System.out.println("Test Case ID: \t\t" + test_case_id_10 + " - PASSED");
			System.out
					.println("Error Expected/Actual: \t" + error_email_empty_expected + "/" + error_email_empty_actual);
			System.out.println("===============================================================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_10 + " - FAILED");
			System.out
					.println("Error Expected/Actual: \t" + error_email_empty_expected + "/" + error_email_empty_actual);
			System.out.println("===============================================================================");
		}

		// TC-001.11 Error "Enter phone number" validation

		driver.findElement(By.id("id_fname")).clear();
		driver.findElement(By.id("id_fname")).sendKeys(fname);

		driver.findElement(By.id("id_lname")).clear();
		driver.findElement(By.id("id_lname")).sendKeys(lname);

		driver.findElement(By.id("id_email")).sendKeys(email);

		driver.findElement(By.id("id_submit_button")).click();
		String error_phone_empty_actual = driver.findElement(By.id("ErrorLine")).getText();

		if (error_phone_empty_expected.equals(error_phone_empty_actual)) {
			System.out.println("Test Case ID: \t\t" + test_case_id_11 + " - PASSED");
			System.out
					.println("Error Expected/Actual: \t" + error_phone_empty_expected + "/" + error_phone_empty_actual);
			System.out.println("===============================================================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_11 + " - FAILED");
			System.out
					.println("Error Expected/Actual: \t" + error_phone_empty_expected + "/" + error_phone_empty_actual);
			System.out.println("===============================================================================");
		}

		// TC-001.12 Current day validation

		DateFormat dtFormat = new SimpleDateFormat("MMMMM dd, YYYY ");
		Calendar cal = Calendar.getInstance();
		String current_day = dtFormat.format(cal.getTime());
		String current_date_app = driver.findElement(By.id("timestamp")).getText();
		if (current_date_app.equalsIgnoreCase(current_day)) {
			System.out.println("Test Case ID: \t\t\t" + test_case_id_12 + " - PASSED");
			System.out.println("Current day/current date in app: " + current_day + "/" + current_date_app);
			System.out.println("===============================================================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_12 + " - FAILED");
			System.out
					.println("Current day/current date app: " + current_day + "/" + current_date_app);
			System.out.println("===============================================================================");
		}
		
		// TC-001.13 Copyright validation
		
		driver.findElement(By.id("copyright")).getText();
		String copyright_actual = driver.findElement(By.id("copyright"))
				.getText();

		if (copyright_expected.equals(copyright_actual)) {
			System.out.println("Test Case ID: \t\t\t" + test_case_id_13
					+ " - PASSED");
			System.out.println("Copyright Expected/Actual: \t"
					+ copyright_expected + "/" + copyright_actual);
			System.out.println("===============================================================================");
		} else {
			System.out.println("Test Case ID: \t\t\t" + test_case_id_13
					+ " - FAILED");
			System.out.println("Copyright Expected/Actual: \t"
					+ copyright_expected + "/" + copyright_actual);
			System.out.println("===============================================================================");
		}
		
		// TC-001.14 My OS & Browser validation
		
		driver.findElement(By.id("os_browser")).getText();
		String os_browser_actual = driver.findElement(By.id("os_browser"))
				.getText();

		if (os_browser_expected.equals(os_browser_actual)) {
			System.out.println("Test Case ID: \t\t\t" + test_case_id_14
					+ " - PASSED");
			System.out.println("OS & Browser Expected/Actual: \t"
					+ os_browser_expected + "/" + os_browser_actual);
			System.out.println("===============================================================================");
		} else {
			System.out.println("Test Case ID: \t\t\t" + test_case_id_14
					+ " - FAILED");
			System.out.println("OS & Browser Expected/Actual: \t"
					+ os_browser_expected + "/" + os_browser_actual);
			System.out.println("===============================================================================");
		}

		
		// TC-001.15 Radio-button Male presence validation
		
		if (driver.findElement(By.id("id_g_radio_01")).isDisplayed()) {

			System.out.println("Test Case ID: \t\t" + test_case_id_15
					+ " - PASSED");
			System.out
					.println("Male radio-button in the Gender field exists \t");

			System.out.println("===============================================================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_15
					+ " - FAILED");
			System.out
					.println("Male radio-button in the Gender field doesn't exist \t");

			System.out.println("===============================================================================");
		}
		

		// TC-001.16 Radio-button Female presence validation

		if (driver.findElement(By.id("id_g_radio_02")).isDisplayed()) {

			System.out.println("Test Case ID: \t\t" + test_case_id_16
					+ " - PASSED");
			System.out
					.println("Female radio-button in the Gender field exists \t");

			System.out.println("===============================================================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_16
					+ " - FAILED");
			System.out
					.println("Female radio-button in the Gender field doesn't exist \t");

			System.out.println("===============================================================================");
		}

		
		// TC-001.17 State element presence validation
		
		if (driver.findElement(By.id("id_state")).isDisplayed()) {

			System.out.println("Test Case ID: \t\t" + test_case_id_17
					+ " - PASSED");
			System.out.println("State dropdown list exists \t");

			System.out.println("===============================================================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_17
					+ " - FAILED");
			System.out.println("State dropdown list doesn't exist \t");

			System.out.println("===============================================================================");
		}
		
		
		// TC-001.18 Checkbox Agreed presence validation
		
		if (driver.findElement(By.id("id_checkbox")).isDisplayed()) {

			System.out.println("Test Case ID: \t\t" + test_case_id_18
					+ " - PASSED");
			System.out.println("Checkbox for agreement exists \t");

			System.out.println("===============================================================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_18
					+ " - FAILED");
			System.out.println("Checkbox for agreement doesn't exist \t");

			System.out.println("===============================================================================");
		}

		//TC-001.19 Validation of correct filling of all fields
		
		driver.findElement(By.id("id_fname")).clear();
		driver.findElement(By.id("id_fname")).sendKeys(fname);
		
		driver.findElement(By.id("id_lname")).clear();
		driver.findElement(By.id("id_lname")).sendKeys(lname);
		
		driver.findElement(By.id("id_email")).clear();
		driver.findElement(By.id("id_email")).sendKeys(email);
		
		driver.findElement(By.id("id_phone")).clear();
		driver.findElement(By.id("id_phone")).sendKeys(phone);
		
		driver.findElement(By.id("id_g_radio_01")).click();
		
		// driver.findElement(By.id("id_state")).sendKeys(Keys.DOWN);
		//Select select = new Select(driver.findElement(By.id("id_state")));
		//select.selectByIndex(5);
		
		Select select = new Select(driver.findElement(By.id("id_state")));
		select.selectByVisibleText("California");
		
		driver.findElement(By.id("id_checkbox")).click();
		driver.findElement(By.id("id_submit_button")).click();

		String fname_conf_actual = driver.findElement(By.id("id_fname_conf"))
				.getText();
		String lname_conf_actual = driver.findElement(By.id("id_lname_conf"))
				.getText();
		String email_conf_actual = driver.findElement(By.id("id_email_conf"))
				.getText();
		String phone_conf_actual = driver.findElement(By.id("id_phone_conf"))
				.getText();
		String gender_conf_actual = driver.findElement(By.id("id_gender_conf"))
				.getText();
		String state_conf_actual = driver.findElement(By.id("id_state_conf"))
				.getText();
		String terms_conf_actual = driver.findElement(By.id("id_terms_conf"))
				.getText();

		if (fname.equals(fname_conf_actual) && lname.equals(lname_conf_actual)
				&& email.equals(email_conf_actual)
				&& phone.equals(phone_conf_actual)
				&& gender.equals(gender_conf_actual)
				&& state.equals(state_conf_actual)
				&& terms.equals(terms_conf_actual)) {
			System.out.println("Test Case ID: \t\t" + test_case_id_19
					+ " - PASSED");
			System.out.println("F.Name Expected/Actual: " + fname + "/"
					+ fname_conf_actual);
			System.out.println("L.Name Expected/Actual: " + lname + "/"
					+ lname_conf_actual);
			System.out.println("Email Expected/Actual: \t" + email + "/"
					+ email_conf_actual);
			System.out.println("Phone Expected/Actual: \t" + phone + "/"
					+ phone_conf_actual);
			System.out.println("Gender Expected/Actual: " + gender + "/"
					+ gender_conf_actual);
			System.out.println("State Expected/Actual: \t" + state + "/"
					+ state_conf_actual);
			System.out.println("Terms Expected/Actual: \t" + terms + "/"
					+ terms_conf_actual);
			System.out.println("===============================================================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_19
					+ " - FAILED");
			System.out.println("First Name Expected/Actual: \t" + fname + "/"
					+ fname_conf_actual);
			System.out.println("Last Name Expected/Actual: \t" + lname + "/"
					+ lname_conf_actual);
			System.out.println("Email Expected/Actual: \t" + email + "/"
					+ email_conf_actual);
			System.out.println("Phone Expected/Actual: \t" + phone + "/"
					+ phone_conf_actual);
			System.out.println("Gender Expected/Actual: \t" + gender + "/"
					+ gender_conf_actual);
			System.out.println("State Expected/Actual: \t" + state + "/"
					+ state_conf_actual);
			System.out.println("Terms Expected/Actual: \t" + terms + "/"
					+ terms_conf_actual);
			System.out.println("===============================================================================");
		}
		driver.findElement(By.id("id_back_button")).click();



		// TC-001.20 Reset button validation

		driver.findElement(By.id("id_fname")).sendKeys(fname);
		driver.findElement(By.id("id_lname")).sendKeys(lname);
		driver.findElement(By.id("id_email")).sendKeys(email);
		driver.findElement(By.id("id_phone")).sendKeys(phone);
		driver.findElement(By.id("id_g_radio_02")).click();
		driver.findElement(By.id("id_state")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("id_checkbox")).click();
		
		driver.findElement(By.id("id_reset_button")).click();

		if (driver.findElement(By.id("id_fname")).getText().isEmpty() 
				&& driver.findElement(By.id("id_lname")).getText().isEmpty()
				&& driver.findElement(By.id("id_email")).getText().isEmpty()
				&& driver.findElement(By.id("id_phone")).getText().isEmpty()
				&& !driver.findElement(By.id("id_g_radio_02")).isSelected()
				&& driver.findElement(By.id("id_state")).isDisplayed()
				&& !driver.findElement(By.id("id_checkbox")).isSelected()) 
			{
			System.out.println("Test Case ID: \t\t" + test_case_id_20
					+ " - PASSED");
			System.out.println("First Name is reseted \t");
			System.out.println("Last Name is reseted \t");
			System.out.println("Email is reseted \t");
			System.out.println("Phone Number is reseted \t");
			System.out.println("Gender is reseted \t");
			System.out.println("State is reseted \t");
			System.out.println("Terms agreement is reseted \t");
			System.out.println("===============================================================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_20
					+ " - FAILED");
			System.out.println("First Name is not reseted \t");
			System.out.println("Last Name is not reseted \t");
			System.out.println("Email is not reseted \t");
			System.out.println("Phone Number is not reseted \t");
			System.out.println("Gender is not reseted \t");
			System.out.println("State is not reseted \t");
			System.out.println("Terms agreement is not reseted \t");
			System.out.println("===============================================================================");
		}
		
	// TC-001.21 Invalid First Name verification
		
		driver.findElement(By.id("id_fname")).clear();
		driver.findElement(By.id("id_fname")).sendKeys("Alex1");
		driver.findElement(By.id("id_submit_button")).click();
		
		String invalid_fname_actual = driver.findElement(By.id("ErrorLine")).getText();
		
		if (invalid_fname_expected.equals(invalid_fname_actual)){
			System.out.println("Test Case ID: \t\t" + test_case_id_21
					+ " - PASSED");
			System.out.println("Error Expected/Actual: \t"
					+ invalid_fname_expected + "/" + invalid_fname_actual);
			System.out.println("==============================================================================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_21
					+ " - FAILED");
			System.out.println("Error Expected/Actual: \t"
					+ invalid_fname_expected + "/" + invalid_fname_actual);
			System.out.println("==============================================================================================");
		}
		
		// TC-001.22 Invalid Last name verification
		
		driver.findElement(By.id("id_fname")).clear();
		driver.findElement(By.id("id_fname")).sendKeys(fname);
		
		driver.findElement(By.id("id_lname")).clear();
		driver.findElement(By.id("id_lname")).sendKeys("Moore1");
		
		driver.findElement(By.id("id_submit_button")).click();
		
		String invalid_lname_actual = driver.findElement(By.id("ErrorLine")).getText();
		
		if(invalid_lname_expected.equals(invalid_lname_actual)){
			System.out.println("Test Case ID: \t\t" + test_case_id_22
					+ " - PASSED");
			System.out.println("Error Expected/Actual: \t"
					+ invalid_lname_expected + "/" + invalid_lname_actual);
			System.out.println("==============================================================================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_22
					+ " - FAILED");
			System.out.println("Error Expected/Actual: \t"
					+ invalid_lname_expected + "/" + invalid_lname_actual);
			System.out.println("==============================================================================================");
		}
		
		// TC-001.23 Invalid Email verification
		
		driver.findElement(By.id("id_fname")).clear();
		driver.findElement(By.id("id_fname")).sendKeys(fname);
		
		driver.findElement(By.id("id_lname")).clear();
		driver.findElement(By.id("id_lname")).sendKeys(lname);
		
		driver.findElement(By.id("id_email")).clear();
		driver.findElement(By.id("id_email")).sendKeys("a@gmail.com");
		
		driver.findElement(By.id("id_submit_button")).click();
		
		String invalid_email_actual = driver.findElement(By.id("ErrorLine")).getText();
		
		if(invalid_email_expected.equals(invalid_email_actual)){
			System.out.println("Test Case ID: \t\t" + test_case_id_23
					+ " - PASSED");
			System.out.println("Error Expected/Actual: \t"
					+ invalid_email_expected + "/" + invalid_email_actual);
			System.out.println("==============================================================================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_23
					+ " - FAILED");
			System.out.println("Error Expected/Actual: \t"
					+ invalid_email_expected + "/" + invalid_email_actual);
			System.out.println("==============================================================================================");
		}
		
		// TC-001.24 Invalid Phone number verification
		
		driver.findElement(By.id("id_fname")).clear();
		driver.findElement(By.id("id_fname")).sendKeys(fname);
		
		driver.findElement(By.id("id_lname")).clear();
		driver.findElement(By.id("id_lname")).sendKeys(lname);
		
		driver.findElement(By.id("id_email")).clear();
		driver.findElement(By.id("id_email")).sendKeys(email);
		
		driver.findElement(By.id("id_phone")).clear();
		driver.findElement(By.id("id_phone")).sendKeys("1111111111A");
		
		driver.findElement(By.id("id_submit_button")).click();
		
		String invalid_phone_actual = driver.findElement(By.id("ErrorLine")).getText();
		
		if(invalid_phone_expected.equals(invalid_phone_actual)){
			System.out.println("Test Case ID: \t\t" + test_case_id_24
					+ " - PASSED");
			System.out.println("Error Expected/Actual: \t"
					+ invalid_phone_expected + "/" + invalid_phone_actual);
			System.out.println("==============================================================================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_24
					+ " - FAILED");
			System.out.println("Error Expected/Actual: \t"
					+ invalid_phone_expected + "/" + invalid_phone_actual);
			System.out.println("==============================================================================================");
		}
		
		// TC-001.25 First name validation using regex
		
		driver.findElement(By.id("id_fname")).clear();
		driver.findElement(By.id("id_fname")).sendKeys("Dilrabo");
		
		String fname_actual = driver.findElement(By.id("id_fname")).getAttribute("value");
		
		//Pattern pattern = Pattern.compile("^[a-zA-Z,.'-]{3,30}$");
		//Matcher matcher = pattern.matcher(fname_actual);
		
		if(fname_actual.matches("^[a-zA-Z,.'-]{3,30}$")){
			System.out.println("Test Case ID: \t\t" + test_case_id_25
					+ " - PASSED");
			System.out.println("First Name is correct: "
					+ fname_actual);
			System.out.println("==============================================================================================");
		} else {
			System.out.println("Test Case ID: \t\t" + test_case_id_25
					+ " - FAILED");
			System.out.println("First Name is incorrect:"
					+ fname_actual);
			System.out.println("==============================================================================================");
		}	
		
		// TC-001.26 Last name validation using regex
		
				driver.findElement(By.id("id_lname")).clear();
				driver.findElement(By.id("id_lname")).sendKeys("Abdullaeva-Bobokalonova");
				
				String lname_actual = driver.findElement(By.id("id_lname")).getAttribute("value");
				
				//Pattern pattern = Pattern.compile("^[a-zA-Z,.'-]{3,30}$");
				//Matcher matcher = pattern.matcher(lname_actual);
				
				if(lname_actual.matches("^[a-zA-Z,.'-]{3,30}$")){
					System.out.println("Test Case ID: \t\t" + test_case_id_26
							+ " - PASSED");
					System.out.println("First Name is correct:  "
							+ lname_actual);
					System.out.println("==============================================================================================");
				} else {
					System.out.println("Test Case ID: \t\t" + test_case_id_26
							+ " - FAILED");
					System.out.println("First Name is incorrect:"
							+ lname_actual);
				System.out.println("==============================================================================================");
				}	
				
			// TC-001.27 Current location validation
				
				
				//driver.get(url_pub_ip);
				//String pub_ip = driver.findElement(By.id("up_finished")).getText();
								
				
				DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
				DocumentBuilder b = f.newDocumentBuilder();
				Document doc = b.parse(url_pars);
				
				XPath xpath = XPathFactory.newInstance().newXPath();
				String current_loc_actual = xpath.compile(xpath_loc).evaluate(doc);
                
				driver.get(url0);
				
				driver.findElement(By.id("id_current_location")).isDisplayed();
				String current_loc_expected = driver.findElement(By.id("id_current_location")).getText();
				
				if(current_loc_expected.equals(current_loc_actual)){
					System.out.println("Test Case ID: \t\t" + test_case_id_27
							+ " - PASSED");
					System.out.println("Location Expected/Actual:"
							+ current_loc_expected + "/" + current_loc_actual);
					System.out.println("==============================================================================================");
				} else {
					System.out.println("Test Case ID: \t\t" + test_case_id_27
							+ " - FAILED");
					System.out.println("Location Expected/Actual:"
							+ current_loc_expected + "/" + current_loc_actual);
					System.out.println("==============================================================================================");	
				}
			
			// TC-001.28  Weather icon presence validation
												
				String weather_actual = xpath.compile("//icon_url").evaluate(doc);				
				String weather_expected = driver.findElement(By.xpath("//td[1]/img")).getTagName();
				if(weather_expected.equals(weather_actual)){
					System.out.println("Test Case ID: \t\t" + test_case_id_28
							+ " - PASSED");
					System.out.println("Weather Expected/Actual:"
							+ weather_expected + "/" + weather_actual);
					System.out.println("==============================================================================================");
				} else {
					System.out.println("Test Case ID: \t\t" + test_case_id_28
							+ " - FAILED");			
					System.out.println("Weather Expected/Actual:"
							+ weather_expected + "/" + weather_actual);
					System.out.println("==============================================================================================");
				
				};
				
			// TC-001.29 Temperature validation
				
				String temp_actual = xpath.compile("//temp_f").evaluate(doc) + " ℉";				
				String temp_expected = driver.findElement(By.id("id_temperature")).getText();
				if(temp_expected.equals(temp_actual)){
					System.out.println("Test Case ID: \t\t" + test_case_id_29
							+ " - PASSED");
					System.out.println("Weather Expected/Actual:"
							+ temp_expected + "/" + temp_actual);
					System.out.println("==============================================================================================");
				} else {
					System.out.println("Test Case ID: \t\t" + test_case_id_29
							+ " - FAILED");			
					System.out.println("Weather Expected/Actual:"
							+ temp_expected + "/" + temp_actual);
					System.out.println("==============================================================================================");
				}	
driver.quit();
	}
}
