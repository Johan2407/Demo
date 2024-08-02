package UserInterface;

import Util.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ModuloUI extends Config {
    public WebElement modulo1 = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[4]/ul/li[1]/a/div"));
    public WebElement modulo2 = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[4]/ul/li[3]/a/div"));
    public WebElement modulo3 = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[4]/ul/li[4]/a/div"));
    public WebElement modulo4 = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[4]/ul/li[10]/a/div"));
}
