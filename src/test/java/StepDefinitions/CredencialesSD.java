package StepDefinitions;

import Task.CredencialesTask;
import Util.ScreenShot;
import io.cucumber.java.en.And;

import java.io.IOException;

public class CredencialesSD {
    @And("Ingresamos {}, {}")
    public void Inicio_sesison(String usuario, String contrasena) throws InterruptedException, IOException {
        CredencialesTask test = new CredencialesTask();
        test.user(usuario);
        test.password(contrasena);
        ScreenShot tests = new ScreenShot();
        tests.TakeScreenShot();
    }
}
