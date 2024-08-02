package StepDefinitions;

import Task.MenuPrincipalTask;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MenuPrincipalSD {
    @And("Seleccionamos el menu")
    public void Seleccionar_menuPrincipal() throws InterruptedException{
        MenuPrincipalTask test=new MenuPrincipalTask();
        test.SeleccionaTest();
    }
}
