package StepDefinitions;

import Task.MenuPrincipalTask;
import Task.SubMenuTask;
import io.cucumber.java.en.And;

public class SubMenuSD {
    @And("Seleccionamos submenu {}")
    public void Seleccionar_subMenu(String submenu) throws InterruptedException{
        SubMenuTask test=new SubMenuTask();
        test.SeleccionaSubmenuTest(submenu);
    }
}
