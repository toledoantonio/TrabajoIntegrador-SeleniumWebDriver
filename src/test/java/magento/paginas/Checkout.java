package magento.paginas;

import org.openqa.selenium.By;

public class Checkout {
    private final By btnGoCheckout = By.xpath("//span[normalize-space()='Proceed to Checkout']");

    public By getBtnGoCheckout() {
        return btnGoCheckout;
    }
}
