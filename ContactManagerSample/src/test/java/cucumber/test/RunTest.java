package cucumber.test;

/**
 * Created with IntelliJ IDEA.
 * User: upgundecha
 * Date: 02/05/13
 * Time: 10:46 PM
 * To change this template use File | Settings | File Templates.
 */

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber-html-report", "json-pretty:target/cucumber-report.json"})
public class RunTest {

}
