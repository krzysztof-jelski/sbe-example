package pl.pragmatists.onlinestore.runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format = { "pretty", "html:target/cucumber-html-report" }, glue = "pl.pragmatists.onlinestore.selling.definitions", features = "features", monochrome = true)
public class RunCukesTest {

}
