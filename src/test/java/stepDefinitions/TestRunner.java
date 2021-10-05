package stepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/googleSearch.feature", glue = {"stepDefinitions"},
        monochrome = true,
        //generate reports such as html, json
        //    ex: plugin = {"pretty","html:target/HtmlReports"}
        //        plugin = {"pretty", "json:target/JSONReports"}
        plugin = {"pretty", "junit:target/JUnitReports.xml","json:target/JSONReports","html:target/HTMLReports"}
//        tags = "@smoketest"
)
public class TestRunner {
}
