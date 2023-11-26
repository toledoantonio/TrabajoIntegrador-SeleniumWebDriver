package magento.paginas;

import org.openqa.selenium.By;

public class ThankYou {
    private final By titulo = By.className("base");
    private final By btnContinueShopping = By.xpath("//span[normalize-space()='Continue Shopping']");
    private final By btnCreateAccount = By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']");
    private final By nroOrden = By.cssSelector("div[class='checkout-success'] p span");

    public By getTitulo() {
        return titulo;
    }

    public By getBtnContinueShopping() {
        return btnContinueShopping;
    }

    public By getBtnCreateAccount() {
        return btnCreateAccount;
    }

    public By getNroOrden() {
        return nroOrden;
    }
}
