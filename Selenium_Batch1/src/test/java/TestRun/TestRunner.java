package TestRun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\java\\Features\\LauchingGoogle.Feature"},
glue = {"StepDefination"},
//tags = {"@Regression"}
//tags = {"@Regression","@Sne"} and condition
//tags = {"@Regression,@Sne"}  or condition
tags = {"@Full"}
)

public class TestRunner {

}
