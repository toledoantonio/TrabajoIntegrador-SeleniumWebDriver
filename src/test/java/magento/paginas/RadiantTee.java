package magento.paginas;

import org.openqa.selenium.By;
public class RadiantTee {
    private final By talleL = By.xpath("//div[@id='option-label-size-143-item-169']");
    private final By colorBlue = By.xpath("//div[@id='option-label-color-93-item-50']");
    private final By txtQty = By.xpath("//input[@title='Qty']");
    private final By btnAddToCart = By.xpath("//span[normalize-space()='Add to Cart']");
    private final By linkShoppingCart = By.xpath("//a[normalize-space()='shopping cart']");

    public By getTalleL() {
        return talleL;
    }

    public By getColorBlue() {
        return colorBlue;
    }

    public By getTxtQty() {
        return txtQty;
    }

    public By getBtnAddToCart() {
        return btnAddToCart;
    }

    public By getLinkShoppingCart() {
        return linkShoppingCart;
    }

}


