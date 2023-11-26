package magento.paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
    private final By linkRadiantTee = By.xpath("//a[@title='Radiant Tee']");

    public By getLinkRadiantTee() {
        return linkRadiantTee;
    }

}
