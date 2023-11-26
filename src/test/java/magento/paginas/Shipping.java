package magento.paginas;

import org.openqa.selenium.By;

public class Shipping {
    private final By txtEmail = By.xpath("//div[@class='control _with-tooltip']//input[@id='customer-email']");
    private final By txtFName = By.name("firstname");
    private final By txtLName = By.name("lastname");
    private final By txtCompany = By.name("company");
    private final By txtStreetAddress = By.name("street[0]");
    private final By txtCity = By.name("city");
    private final By selectState = By.name("region_id");
    private final By txtCP = By.name("postcode");
    private final By selectCountry = By.name("country_id");
    private final By txtPhone = By.name("telephone");
    private final By rbShippingMethod = By.xpath("//input[@name='ko_unique_1']");
    private final By btnNext = By.xpath("//span[normalize-space()='Next']");

    public By getTxtEmail() {
        return txtEmail;
    }

    public By getTxtFName() {
        return txtFName;
    }

    public By getTxtLName() {
        return txtLName;
    }

    public By getTxtCompany() {
        return txtCompany;
    }

    public By getTxtStreetAddress() {
        return txtStreetAddress;
    }

    public By getTxtCity() {
        return txtCity;
    }

    public By getSelectState() {
        return selectState;
    }

    public By getTxtCP() {
        return txtCP;
    }

    public By getSelectCountry() {
        return selectCountry;
    }

    public By getTxtPhone() {
        return txtPhone;
    }

    public By getRbShippingMethod() {
        return rbShippingMethod;
    }

    public By getBtnNext() {
        return btnNext;
    }
}

