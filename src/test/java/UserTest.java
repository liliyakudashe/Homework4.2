import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void testUserConstructor() {
        final String LOGIN = "login";
        final String EMAIL = "email";

        User user = new User(LOGIN, EMAIL);

        String userLogin = user.getLogin();
        String userEmail = user.getEmail();

        Assertions Assert = null;
        Assert.assertEquals(LOGIN, userLogin);
        Assert.assertEquals(EMAIL, userEmail);
    }
}
