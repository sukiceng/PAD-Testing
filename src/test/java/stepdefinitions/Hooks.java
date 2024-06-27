package stepdefinitions;

import org.junit.After;
import org.junit.Before;
import utils.TestContext;

public class Hooks {
    TestContext testContext;

    public Hooks(){
        testContext = new TestContext();
    }
    @Before
    public void setUp(){
        testContext.getDriver();
    }
    @After
    public void tearDown(){
        testContext.closeDriver();
    }
}
