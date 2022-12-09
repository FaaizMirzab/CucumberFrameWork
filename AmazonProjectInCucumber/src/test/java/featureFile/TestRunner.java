package featureFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/feature/amazon.feature",glue= {"featureFile"},
monochrome=true,
plugin= {"pretty","html:target/HtmlReport.html"})



public class TestRunner {

}
