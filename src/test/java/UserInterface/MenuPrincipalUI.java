package UserInterface;

import Util.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MenuPrincipalUI extends Config {
    public WebElement menu = driver.findElement(By.xpath("//*[@id=\"btn-menu\"]"));
}

