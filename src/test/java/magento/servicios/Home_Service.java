package magento.servicios;

import magento.DriverActions;
import magento.paginas.Home;
import org.openqa.selenium.WebDriver;

public class Home_Service {
    private WebDriver driver;
    private Home homePagina;

    public Home_Service(WebDriver driver){
        this.driver=driver;
        this.homePagina =new Home();
    }

    public void elegirRemeraRadiantTee() {
        DriverActions.click(this.homePagina.getLinkRadiantTee());
    }
}

