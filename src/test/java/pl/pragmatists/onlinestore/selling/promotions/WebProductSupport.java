package pl.pragmatists.onlinestore.selling.promotions;

import static org.fest.assertions.Assertions.*;

public class WebProductSupport {

    public WebProduct findProduct(Product product) {
        return new WebProduct();
    }

    public void assertProductHasPromotionIconOnWeb(Product productUnderTest) {
        WebProduct webProduct = findProduct(productUnderTest);
        assertThat(webProduct.hasPromotionIcon()).isTrue();
    }

    public void assertBaseProductLinksToBonusProduct(String baseProductName, String bonusProductName) {
        WebProduct baseProduct = findProductByName(baseProductName);
        assertThat(baseProduct.getLinkedProductName()).isEqualTo(bonusProductName);
    }

    private WebProduct findProductByName(String baseProductName) {
        return null;
    }

}
