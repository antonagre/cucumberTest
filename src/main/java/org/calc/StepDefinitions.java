package org.calc;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;


public class StepDefinitions {
    Calc c;

    @Given("that the Calculator app is running and in focus")
    public void runCalc() {
        c=new Calc();
    }

    @And("there is no current value in the calculator")
    public void resetCalc() {
        c.reset();
    }

    @When("sum {int} and {int} in the calculator app")
    public void AddTest(int x,int y) {
        c.add(x);
        c.add(y);
    }

    @When("multiply {int} and {int} in the calculator app")
    public void mulTest(int x,int y) {
        c.mul(x);
        c.mul(y);
    }

    @When("subtract {int} and {int} in the calculator app")
    public void subTest(int x,int y) {
        c.sub(x);
        c.sub(y);
    }

    @When("divide {int} by {int} in the calculator app")
    public void divTest(int x,int y) {
        c.div(x);
        c.div(y);
    }

    @Then("the app show {int}")
    public void compareResult2(int x) {
        assertEquals(x,c.getResult());
    }

    @When("you add {int} and {int}")
    public void add(int x,int y) {
        c.add(x);
        c.add(y);
    }

    @Then("the value displayed should be {int}")
    public void compareResult(int x) {
        assertEquals(x, c.getResult());
    }

}