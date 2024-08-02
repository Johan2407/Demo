package Task;

import UserInterface.SubMenuUI;
import Util.Config;

public class SubMenuTask extends Config {
    public void SeleccionaSubmenuTest( String submenu) throws InterruptedException {
        SubMenuUI test = new SubMenuUI();
        switch (submenu) {
            case "Internal Use":
                test.SubMenu1.click();
                Thread.sleep(4_000);
                System.out.println("Colocar el modulo seleccionado " + submenu);
                return;
            case "M&V Billing":
                test.SubMenu2.click();
                Thread.sleep(5_000);
                System.out.println("Colocar el modulo seleccionado " + submenu);
                return;
            case "M&V Interchange":
                test.SubMenu3.click();
                Thread.sleep(4_000);
                System.out.println("Colocar el modulo seleccionado " + submenu);
                return;

        }
    }
}
