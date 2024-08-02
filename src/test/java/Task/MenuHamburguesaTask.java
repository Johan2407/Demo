package Task;

import StepDefinitions.MenuHamburguesaSD;
import UserInterface.MenuHamburguesaUI;
import Util.Config;

public class MenuHamburguesaTask extends Config {
    public void MenuHamburguesaTask() throws InterruptedException{
        MenuHamburguesaUI test = new MenuHamburguesaUI();
            test.hamburguesa.click();
            Thread.sleep(5_000);
    }
}
