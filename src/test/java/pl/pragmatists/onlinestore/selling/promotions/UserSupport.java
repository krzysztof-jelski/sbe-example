package pl.pragmatists.onlinestore.selling.promotions;

public class UserSupport {

    private PrincipalContext principalContext;
    private UserService userService;

    public UserSupport(PrincipalContext principalContext, UserService userService) {
        this.principalContext = principalContext;
        this.userService = userService;
    }

    public void loginAsPromotionAdmin() {
        principalContext.login(promotionAdmin());
    }

    private User promotionAdmin() {
        return userService.createUser("login", "pass", Role.PROMOTION_ADMIN);
    }

}
