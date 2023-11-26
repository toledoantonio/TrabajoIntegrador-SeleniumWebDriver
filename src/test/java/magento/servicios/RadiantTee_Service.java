package magento.servicios;

import magento.DriverActions;
import magento.paginas.RadiantTee;

public class RadiantTee_Service {
    private RadiantTee radiantTeePage;

    public RadiantTee_Service(){
        this.radiantTeePage=new RadiantTee();
    }

    public void configurarRemera(int cantidad){
        DriverActions.click(this.radiantTeePage.getTalleL());
        DriverActions.click(this.radiantTeePage.getColorBlue());
        DriverActions.insertText(this.radiantTeePage.getTxtQty(), cantidad+"");
    }

    public void agregarCarrito(){
        DriverActions.click(this.radiantTeePage.getBtnAddToCart());
    }

    public void verCarrito(){
        DriverActions.click(this.radiantTeePage.getLinkShoppingCart());
    }
}

