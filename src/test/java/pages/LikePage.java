package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class LikePage {
    public LikePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(className = "product-item ")
    public List<WebElement> likedItemList;

    @FindBy(id = "StickActionHeader-SelectAll")
    public WebElement chooseLiked;

    @FindBy(id = "StickActionHeader-AddToCartSelected")
    public WebElement addToChart;

}
