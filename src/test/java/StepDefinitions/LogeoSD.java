package StepDefinitions;

import Task.LogeoTask;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LogeoSD {
    @Then("Seleccionamos Generate token")
    public void Logeo() throws InterruptedException{
        LogeoTask test = new LogeoTask();
        test.Logeotest();
    }
}
