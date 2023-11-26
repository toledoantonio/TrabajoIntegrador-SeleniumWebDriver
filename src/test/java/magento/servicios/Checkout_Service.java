package magento.servicios;

import magento.DriverActions;
import magento.paginas.Checkout;

public class Checkout_Service {

    private Checkout checkoutPage;

    public Checkout_Service(){
        this.checkoutPage = new Checkout();
    }

    public void continuarCompra(){
        DriverActions.click(this.checkoutPage.getBtnGoCheckout());
    }
}

