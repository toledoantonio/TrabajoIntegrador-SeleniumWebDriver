package magento;

import magento.servicios.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PruebasMagento {

    @BeforeMethod
    public void setup() {
        DriverManager.create("chrome");
        DriverManager.getDriver().get("https://magento.softwaretestingboard.com/");
    }

    @Test
    public void comprarRadiantTee(){
        Home_Service homeService = new Home_Service(DriverManager.getDriver());
        //2
        homeService.elegirRemeraRadiantTee();

        RadiantTee_Service radiantTeeService = new RadiantTee_Service();
        //3
        radiantTeeService.configurarRemera(2);

        //4
        radiantTeeService.agregarCarrito();

        //5
        radiantTeeService.verCarrito();

        Checkout_Service checkoutService = new Checkout_Service();
        //6
        checkoutService.continuarCompra();

        Shipping_Service shippingService = new Shipping_Service();
        //7 y 8
        shippingService.completarFormulario("prueba123@gmail.com","Antonio","Toledo","Concordia","Av siempre Viva 123","Miami","Florida",4587,"US",123456789);

        //9
        shippingService.irUltimo();

        Payment_Service paymentService = new Payment_Service();
        //10
        paymentService.confirmarCompra();

        //Validaciones:
        ThankYou_Service thankYouService = new ThankYou_Service();

        Assert.assertTrue(thankYouService.isEnableContinueShopping());

        Assert.assertTrue(thankYouService.isVisibleCreateAccount());

    }
}
