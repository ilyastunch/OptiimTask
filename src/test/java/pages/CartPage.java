package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class CartPage {

    public CartPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(className = "product_name_3Lh3t")
    public List<WebElement> cartItemList;

    @FindBy(className = "delete_product_3DFC0")
    public WebElement deleteIcon;




}
