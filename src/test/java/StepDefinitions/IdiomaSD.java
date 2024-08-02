package StepDefinitions;

import Task.IdiomaTask;
import Task.LogeoTask;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class IdiomaSD {
    @And("Seleccionamos idioma {}")
    public void Idioma(String idioma) throws InterruptedException{
        IdiomaTask test = new IdiomaTask();
        test.Idiomatest(idioma);
    }
}
