package magento;

import magento.servicios.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PruebasMagento {

    @BeforeMethod
    public void entorno() {
        DriverManager.create("chrome");
        DriverManager.getDriver().get("https://magento.softwaretestingboard.com/");
    }

    @Test
    public void comprarRadiantTee(){
        Home_Service homeService = new Home_Service(DriverManager.getDriver());

        homeService.elegirRemeraRadiantTee();

        RadiantTee_Service radiantTeeService = new RadiantTee_Service();

        radiantTeeService.configurarRemera(2);

        radiantTeeService.agregarCarrito();

        radiantTeeService.verCarrito();

        Checkout_Service checkoutService = new Checkout_Service();

        checkoutService.continuarCompra();

        Shipping_Service shippingService = new Shipping_Service();

        shippingService.completarFormulario("prueba123@gmail.com","Antonio","Toledo","Concordia","Av siempre Viva 123","Miami","Florida",4587,"US",123456789);

        shippingService.irUltimo();

        Payment_Service paymentService = new Payment_Service();

        paymentService.realizarCompraOK();

        //Extras:
        ThankYou_Service thankYouService = new ThankYou_Service();

        Assert.assertTrue(thankYouService.isEnableContinueShopping());

        Assert.assertTrue(thankYouService.isVisibleCreateAccount());

        Assert.assertEquals(thankYouService.getTitleText(), "Thank you for your purchase!", "Texto Incorrecto");

        Assert.assertTrue(thankYouService.validacionNroOrden(), "Numero de Orden Invalido");
    }
}
