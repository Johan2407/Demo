package StepDefinitions;

import Task.CleanFiltroTask;
import io.cucumber.java.en.Then;

public class CleanFiltroSD {
    @Then("Seleccionamos limpiar filtro")
    public void limpiarFiltro() throws InterruptedException{
        CleanFiltroTask test=new CleanFiltroTask();
        test.CleanFiltroTask();
    }
}
