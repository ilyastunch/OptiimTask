package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductPage {
    public ProductPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = ".Like-3B4x5")
    public WebElement likeButton;

    @FindBy(xpath = "(//*[@class='sf-OldMyAccount-PhY-T'])[1]")
    public WebElement hesabım;

    @FindBy(xpath = "//*[@id='myAccount']/div/div[2]/ul/li[5]/a")
    public WebElement begendiklerim;






}
