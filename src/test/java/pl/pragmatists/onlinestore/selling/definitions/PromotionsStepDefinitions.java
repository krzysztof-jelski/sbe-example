package pl.pragmatists.onlinestore.selling.definitions;

import pl.pragmatists.onlinestore.selling.promotions.ProductSupport;
import pl.pragmatists.onlinestore.selling.promotions.WebProductSupport;
import cucumber.api.java.en.Given;

public class PromotionsStepDefinitions {

    public ProductSupport productSupport = new ProductSupport();
    private WebProductSupport webProductSupport = new WebProductSupport();

    public PromotionsStepDefinitions() {
    }

    @Given("^wprowadzam cenê promocyjn¹ dla produktu$")
    public void wprowadzam_cenê_promocyjn¹() throws Throwable {
        productSupport.definePromotionPrice();
    }

    @Given("^produkt ma now¹ cenê$")
    public void produkt_ma_now¹_cenê() throws Throwable {
        productSupport.assertProductHasPromotionPrice();
    }

    @Given("^produkt oznaczony jest wizualnie jako promocyjny$")
    public void produkt_oznaczony_jest_wizualnie_jako_promocyjny() throws Throwable {
        webProductSupport.assertProductHasPromotionIconOnWeb(productSupport.getProductUnderTest());
    }

    @Given("^definiujê promocjê wi¹zan¹: (\\d+) x \"([^\"]*)\", \"([^\"]*)\" gratis$")
    public void definiujê_promocjê_wi¹zan¹_x_gratis(int próg, String produktBazowy, String produktGratis) throws Throwable {
        productSupport.defineLinkedPromotion(próg, produktBazowy, produktGratis);
    }

    @Given("^produkt \"([^\"]*)\" jest oznaczony wizualnie jako promocyjny$")
    public void produkt_jest_oznaczony_wizualnie_jako_promocyjny(String baseProduct) throws Throwable {
        webProductSupport.assertProductHasPromotionIconOnWeb(productSupport.getProductByName(baseProduct));
    }

    @Given("^przy produkcie \"([^\"]*)\" wyœwietlane jest odniesienie do produktu \"([^\"]*)\"$")
    public void przy_produkcie_wyœwietlane_jest_odniesienie_do_produktu(String baseProduct, String bonusProduct) throws Throwable {
        webProductSupport.assertBaseProductLinksToBonusProduct(baseProduct, bonusProduct);
    }
}