package pl.pragmatists.onlinestore.selling.definitions;

import pl.pragmatists.onlinestore.selling.promotions.ProductSupport;
import pl.pragmatists.onlinestore.selling.promotions.WebProductSupport;
import cucumber.api.java.en.Given;

public class PromotionsStepDefinitions {

    public ProductSupport productSupport = new ProductSupport();
    private WebProductSupport webProductSupport = new WebProductSupport();

    public PromotionsStepDefinitions() {
    }

    @Given("^wprowadzam cen� promocyjn� dla produktu$")
    public void wprowadzam_cen�_promocyjn�() throws Throwable {
        productSupport.definePromotionPrice();
    }

    @Given("^produkt ma now� cen�$")
    public void produkt_ma_now�_cen�() throws Throwable {
        productSupport.assertProductHasPromotionPrice();
    }

    @Given("^produkt oznaczony jest wizualnie jako promocyjny$")
    public void produkt_oznaczony_jest_wizualnie_jako_promocyjny() throws Throwable {
        webProductSupport.assertProductHasPromotionIconOnWeb(productSupport.getProductUnderTest());
    }

    @Given("^definiuj� promocj� wi�zan�: (\\d+) x \"([^\"]*)\", \"([^\"]*)\" gratis$")
    public void definiuj�_promocj�_wi�zan�_x_gratis(int pr�g, String produktBazowy, String produktGratis) throws Throwable {
        productSupport.defineLinkedPromotion(pr�g, produktBazowy, produktGratis);
    }

    @Given("^produkt \"([^\"]*)\" jest oznaczony wizualnie jako promocyjny$")
    public void produkt_jest_oznaczony_wizualnie_jako_promocyjny(String baseProduct) throws Throwable {
        webProductSupport.assertProductHasPromotionIconOnWeb(productSupport.getProductByName(baseProduct));
    }

    @Given("^przy produkcie \"([^\"]*)\" wy�wietlane jest odniesienie do produktu \"([^\"]*)\"$")
    public void przy_produkcie_wy�wietlane_jest_odniesienie_do_produktu(String baseProduct, String bonusProduct) throws Throwable {
        webProductSupport.assertBaseProductLinksToBonusProduct(baseProduct, bonusProduct);
    }
}