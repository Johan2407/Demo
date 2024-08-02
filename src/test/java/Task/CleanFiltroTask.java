package Task;

import UserInterface.CleanFiltroUI;
import Util.Config;

public class CleanFiltroTask extends Config {
    public void CleanFiltroTask() throws InterruptedException{
        CleanFiltroUI test=new CleanFiltroUI();
        test.borrar.click();
        Thread.sleep(5_000);
    }
}
