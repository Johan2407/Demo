package UserInterface;

import Util.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SubMenuUI extends Config {
    public WebElement SubMenu1 = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[3]/a"));
    public WebElement SubMenu2 = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[4]/a"));
    public WebElement SubMenu3 = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[5]/a"));
}

