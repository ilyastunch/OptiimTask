package step_definitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import pages.*;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import javax.swing.*;

public class AssignmentDefs {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    SearchPage searchPage = new SearchPage();
    ProductPage productPage = new ProductPage();
    LikePage likePage = new LikePage();


    @Given("{string} sitesini açılacak ve anasayfanın açıldığını onaylayacak")
    public void sitesini_açılacak_ve_anasayfanın_açıldığını_onaylayacak(String url) {
        Driver.get().get(url);
    }

    @Given("Login ekranını açıp, bir kullanıcı ile login olacak")
    public void login_ekranını_açıp_bir_kullanıcı_ile_login_olacak() {
        homePage.onGirisYap.click();
        homePage.girisYap.click();
        BrowserUtils.waitFor(3);
        loginPage.emailInput.sendKeys(ConfigurationReader.get("username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.get("password"));
        loginPage.loginButton.click();


    }

    @Given("Ekranın üstündeki Search alanına samsung yazip Ara butonuna tıklayacak")
    public void ekranın_üstündeki_Search_alanına_samsung_yazip_Ara_butonuna_tıklayacak() {
        BrowserUtils.waitFor(2);
        boolean staleElement = true;
        while (staleElement) {
            try {
                homePage.searchBox.sendKeys("samsung");
                homePage.searchButton.click();
                staleElement = false;
            } catch (StaleElementReferenceException e) {
                staleElement = true;
            }
        }

    }


    @Given("Sol menüden Telefon sonrasında Cep Telefonu tıklayacak")
    public void sol_menüden_Telefon_sonrasında_Cep_Telefonu_tıklayacak() {


        boolean staleElement = true;
        while (staleElement) {
            try {
                searchPage.telefon.click();
                searchPage.cepTelefonu.click();
                BrowserUtils.waitFor(2);
                staleElement = false;
            } catch (StaleElementReferenceException e) {
                staleElement = true;
            }
        }


    }

    @Given("Gelen sayfada samsung için sonuç bulunduğunu onaylayacak")
    public void gelen_sayfada_samsung_için_sonuç_bulunduğunu_onaylayacak() {
        boolean staleElement = true;
        while (staleElement) {
            try {
                Assert.assertTrue(searchPage.secondItem.getAttribute("title").contains("Samsung"));
                staleElement = false;
            } catch (StaleElementReferenceException e) {
                staleElement = true;
            }
        }


    }

    @Given("Arama sonuçlarından ikinci sayfaya tıklayacak ve açılan sayfada ikinci sayfanın şu an gösterimde olduğunu onaylayacak")
    public void arama_sonuçlarından_ikinci_sayfaya_tıklayacak_ve_açılan_sayfada_ikinci_sayfanın_şu_an_gösterimde_olduğunu_onaylayacak() {
        searchPage.secondPage.click();
        Assert.assertTrue(Driver.get().getCurrentUrl().contains("sayfa=2"));

    }

    @Given("Üstten beşinci ürünü tıklayacak")
    public void üstten_beşinci_ürünü_tıklayacak() {
        searchPage.pageItemList.get(5).click();

    }

    @Given("Ürün detayında Beğen butonuna tıklayacak")
    public void ürün_detayında_Beğen_butonuna_tıklayacak() {
        productPage.likeButton.click();

    }

    @Given("Ürün listenize eklendi. popup kontrolü yapacak")
    public void ürün_listenize_eklendi_popup_kontrolü_yapacak() {

    }

    @Given("Ekranın en üstündeki hesabım alanında Beğendiklerim tıklayacak")
    public void ekranın_en_üstündeki_hesabım_alanında_Beğendiklerim_tıklayacak() {
        productPage.hesabım.click();
        productPage.begendiklerim.click();
    }

    @Given("Açılan sayfada bir önceki sayfada beğendiklerime alınmış ürünün bulunduğunu onaylayacak")
    public void açılan_sayfada_bir_önceki_sayfada_beğendiklerime_alınmış_ürünün_bulunduğunu_onaylayacak() {







    }

    @Given("Beğendiklerime alınmış ürün bulunup seçilecek ve sepete eklenecek")
    public void beğendiklerime_alınmış_ürün_bulunup_seçilecek_ve_sepete_eklenecek() {
        likePage.chooseLiked.click();
        likePage.addToChart.click();
    }

    @Given("Sepetim sayfasına gidecek")
    public void sepetim_sayfasına_gidecek() {
        homePage.myCart.click();
    }






    @Given("Ürün sepete eklendi popup kontrolü yapacak")
    public void ürün_sepete_eklendi_popup_kontrolü_yapacak() {

    }

    @Given("Sepete eklenen bu ürünün içine girilip Kaldır butonuna basılacak, sepetimden çıkarılacak")
    public void sepete_eklenen_bu_ürünün_içine_girilip_Kaldır_butonuna_basılacak_sepetimden_çıkarılacak() {
        new CartPage().deleteIcon.click();
    }
    @Given("Bu ürünün artik sepette olmadığını onaylayacak")
    public void bu_ürünün_artik_sepette_olmadığını_onaylayacak() {





    }




}
