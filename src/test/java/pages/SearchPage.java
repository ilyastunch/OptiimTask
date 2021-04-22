package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SearchPage {
    public SearchPage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath = "//*[@id='categoryList']/li[1]/label")
    public WebElement telefon;

    @FindBy(xpath = "//*[@id='categoryList']/li[3]/label")
    public WebElement cepTelefonu;

    @FindBy(xpath = "(//h3[@class='product-title title'])[2]")
    public WebElement secondItem;

    @FindBy(xpath = "//a[@class='page-2 ']")
    public WebElement secondPage;

    @FindBy(xpath = "//div[@class='product-detail']")
    public List<WebElement> pageItemList;




}
