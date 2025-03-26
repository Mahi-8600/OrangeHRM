package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		glue = {"stepDefination"},
		features = {"D:\\Work\\JAVA\\OrangeHRM\\src\\test\\java\\FeatureFiles\\PIM.feature"},
		dryRun = false
)
public class HRM_Runner 
{

}
