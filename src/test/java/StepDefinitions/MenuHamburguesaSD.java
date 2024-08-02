package StepDefinitions;

import Task.MenuHamburguesaTask;
import io.cucumber.java.en.And;

public class MenuHamburguesaSD {
    @And("Seleccionamos el menu hamburguesa")
    public void seleccionar_hamburguesa() throws InterruptedException{
        MenuHamburguesaTask test=new MenuHamburguesaTask();
        test.MenuHamburguesaTask();
    }
}
