package MavenForJenkins.MavenJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoToURL {

	@Test
	public void test() {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","D:\\Java Software\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://reqres.in/");

	}

}


