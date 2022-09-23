package bdd.microservices.customerservice;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import org.junit.platform.suite.api.*;

@Suite
@SuiteDisplayName("BDD Integration Tests")
@IncludeEngines("cucumber")
@SelectClasspathResource("bdd/demo/ecommerce")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "bdd.demo.ecommerce")
public class RunCucumberTest {
}
