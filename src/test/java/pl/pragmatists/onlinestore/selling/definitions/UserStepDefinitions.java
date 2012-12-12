package pl.pragmatists.onlinestore.selling.definitions;

import pl.pragmatists.onlinestore.selling.promotions.PrincipalContext;
import pl.pragmatists.onlinestore.selling.promotions.UserService;
import pl.pragmatists.onlinestore.selling.promotions.UserSupport;
import cucumber.api.java.en.Given;

public class UserStepDefinitions {

    public UserSupport userSupport = new UserSupport(new PrincipalContext(), new UserService());

    public UserStepDefinitions(UserSupport userSupport) {
        this.userSupport = userSupport;
    }

    @Given("^¿e jestem uprawniony do administracji promocjami$")
    public void ¿e_jestem_uprawniony_do_administracji_promocjami() throws Throwable {
        userSupport.loginAsPromotionAdmin();
    }

}