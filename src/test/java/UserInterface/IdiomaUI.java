package UserInterface;

import Util.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IdiomaUI extends Config {
    public WebElement Idioma_boton = driver.findElement(By.xpath("//*[@id=\"ej2_dropdownlist_0\"]/span"));
}
