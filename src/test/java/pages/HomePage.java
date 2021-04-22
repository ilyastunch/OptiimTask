package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {


    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[@id='login']")
    public WebElement girisYap;

    @FindBy(xpath = "//*[@id='myAccount']/span/span[1]")
    public WebElement onGirisYap;

    @FindBy(xpath = "//*[@id='SearchBoxOld']/div/div/div[1]/div[2]/input")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@id='SearchBoxOld']/div/div/div[2]")
    public WebElement searchButton;

    @FindBy(xpath = "(//div[@class='sf-HeaderButton-rPL-k'])[2]")
    public WebElement myCart;



}
