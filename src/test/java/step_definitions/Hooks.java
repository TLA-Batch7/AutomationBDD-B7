package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.BrowserUtils;

public class Hooks {

    @Before
    public void setUp(){
        BrowserUtils.getDriver();
    }

    @After
    public void tearDown(){
        BrowserUtils.quitDriver();
    }
}
