package Task;

import UserInterface.MenuPrincipalUI;
import Util.Config;

public class MenuPrincipalTask extends Config {
    public void SeleccionaTest() throws InterruptedException {
        MenuPrincipalUI test = new MenuPrincipalUI();
            test.menu.click();
            Thread.sleep(10_000);
        }
    }
