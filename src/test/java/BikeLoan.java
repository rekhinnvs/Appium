import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BikeLoan {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Bike loan class");

    }
    @Test
    public void login() {
        System.out.println("Login from Bike loan");
    }

    @Test(groups = "Smoke")
    public void users() {
        System.out.println("Users from bike loan");
    }

    @Parameters("URL")
    @Test
    public void parameterised(String url) {
        System.out.println("URL parameter : "+url);

    }
}
