package StepDefinitions;

import Task.ModuloTask;
import Task.SubMenuTask;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ModuloSD {
    @And("Seleccionamos modulo {}")
    public void Seleccionar_modulo(String modulo) throws InterruptedException{
        ModuloTask test=new ModuloTask();
        test.SeleccionaModuloTest(modulo);
    }
}
