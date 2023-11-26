package magento.servicios;

import magento.DriverActions;
import magento.paginas.ThankYou;
import org.openqa.selenium.By;

public class ThankYou_Service {
    private ThankYou thankYouPage;

    public ThankYou_Service() {
        this.thankYouPage = new ThankYou();
    }

    public String getTitleText(){
        return DriverActions.getText(this.thankYouPage.getTitulo());
    }

    public Boolean isVisibleCreateAccount(){
        return DriverActions.isVisible(this.thankYouPage.getBtnCreateAccount());
    }

    public Boolean isEnableContinueShopping(){
        return DriverActions.isEnabled(this.thankYouPage.getBtnContinueShopping());
    }

    public Boolean orderNumberIsANumber(){
        return validarNumero(extraerNumOrden(this.thankYouPage.getNroOrden()));
    }

    public String extraerNumOrden(By element){
        String elemento = DriverActions.getText(element);
        String[] palabras = elemento.split("\\s+");
        String numeroOrden = null;
        for (String palabra:palabras) {
            if(palabra.matches("\\d+\\.?")){
                numeroOrden=palabra;
                break;
            }
        }
        return numeroOrden;
    }

    public Boolean validarNumero(String cadena){
        try{
            Double.parseDouble(cadena);
            return true;
        } catch(NumberFormatException nfe){
            return false;
        }
    }
}
