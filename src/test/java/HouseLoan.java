import org.testng.annotations.Test;

public class HouseLoan {

    @Test
    public void login() {
        System.out.println("Login from housing loan");
    }

    @Test(groups = "Smoke")
    public void users() {
        System.out.println("Users from housing loan");
    }
}
