package Task;

import UserInterface.ModuloUI;
import UserInterface.SubMenuUI;
import Util.Config;

public class ModuloTask extends Config {
    public void SeleccionaModuloTest(String modulo) throws InterruptedException {
        ModuloUI test = new ModuloUI();
        switch (modulo){
            case "Fee Summary":
                test.modulo1.click();
                Thread.sleep(5_000);
                System.out.println("Seleccionar el modulo " + modulo);
                return;
            case "Brand Files":
                test.modulo2.click();
                Thread.sleep(20_000);
                System.out.println("Seleccionar el modulo " + modulo);
                return;
            case "Fee Dashboard":
                test.modulo3.click();
                Thread.sleep(5_000);
                System.out.println("Seleccionar el modulo " + modulo);
                return;
            case "Fee Validation":
                test.modulo4.click();
                Thread.sleep(30_000);
                System.out.println("Seleccionar el modulo " + modulo);
                return;
        }

    }
}
