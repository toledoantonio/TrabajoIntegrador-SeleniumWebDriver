package magento.servicios;

import magento.DriverActions;
import magento.DriverManager;
import magento.paginas.Payment;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Payment_Service {

    private Payment paymentPagina;

    public Payment_Service(){
        this.paymentPagina = new Payment();
    }

    public void realizarCompraOK(){
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.loading-mask")));
        DriverActions.click(this.paymentPagina.getBtnPlaceOrder());
    }
}

