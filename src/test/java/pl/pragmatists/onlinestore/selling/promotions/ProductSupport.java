package pl.pragmatists.onlinestore.selling.promotions;

import static org.fest.assertions.Assertions.*;

public class ProductSupport {

    private static final int PRICE = 1;
    private ProductService productService = new ProductService();
    private Product product;
    private PromotionService promotionService;

    // private WebProductSupport webProductSupport = new WebProductSupport();;

    public void definePromotionPrice() {
        product = productService.createProduct();
        product.setPromotionPrice(PRICE);
        productService.save(product);
    }

    public void assertProductHasPromotionPrice() {
        assertThat(product.getPrice()).isEqualTo(PRICE);
    }

    public Product getProductUnderTest() {
        return product;
    }

    public void defineLinkedPromotion(int threshold, String baseProductName, String bonusProductName) {
        Product baseProduct = productService.createProduct(baseProductName);
        Product bonusProduct = productService.createProduct(bonusProductName);
        productService.createProduct(bonusProductName);
        promotionService = new PromotionService();
        promotionService.createLinkedPromotion(threshold, baseProduct, bonusProduct);

    }

    public Product getProductByName(String baseProduct) {
        return productService.getProductByName(baseProduct);
    }

}
