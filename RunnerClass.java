package runnerPackage;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions
(
		features="featureFile/start.feature",
		glue="org.selenium.com.MavenProject",
		plugin={"pretty:STDOUT","html:target/HTMLCucumberReport","json:target/Cucumber.json"},
		tags={"@Login"}

)
public class RunnerClass extends AbstractTestNGCucumberTests
{
	@Test
	public void runwithTestNG()
	{
		System.out.println("Run with testNG tools");
	}

}
