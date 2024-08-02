package Task;

import UserInterface.IdiomaUI;
import Util.Config;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class IdiomaTask extends Config {
    private static final Logger log = LoggerFactory.getLogger(IdiomaTask.class);

    public void Idiomatest(String idiom) throws InterruptedException {

       if(Objects.equals(idiom, "MXM")) {
            IdiomaUI seleccionar = new IdiomaUI();
            seleccionar.Idioma_boton.click();
            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.DOWN).build().perform();
            Thread.sleep(7_000);
            actions.sendKeys(Keys.ENTER).build().perform();
            Thread.sleep(9_000);
           System.out.println("Default lenguage: " + idiom);
        } else {
           System.out.println("Default lenguage: " + idiom);
       }
    }
}
