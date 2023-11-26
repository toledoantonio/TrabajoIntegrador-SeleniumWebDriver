package magento.servicios;

import magento.DriverActions;
import magento.paginas.ThankYou;

public class ThankYou_Service {
    private ThankYou thankYouPage;

    public ThankYou_Service() {
        this.thankYouPage=new ThankYou();
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

    public String getOrderText(){
        return DriverActions.getText(this.thankYouPage.getNroOrden());
    }
}
