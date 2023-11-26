package magento.paginas;

import org.openqa.selenium.By;

public class Payment {
    private final By btnPlaceOrder = By.xpath("//button[@title='Place Order']");

    public By getBtnPlaceOrder() {
        return btnPlaceOrder;
    }
}

