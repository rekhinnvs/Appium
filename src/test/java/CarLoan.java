
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CarLoan {

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before test casese");
    }

    @BeforeMethod(enabled = false)
    public void beforeMethod() {
        System.out.println("Before every method");
    }

    @Test
    public void login() {
        System.out.println("Login from car loan");
    }

    @Test(dependsOnMethods = "login")
    public void carMaruthi() {
        System.out.println("maruthi loan");
    }

    @Test
    public void carHyundai() {
        System.out.println("Hyundai Loan");
    }

    @Test(dependsOnMethods = "login")
    public void carTata() {
        System.out.println("Tata loan");
    }

    @Test
    public void carVolvo() {
        System.out.println("Volvo loan");
    }

    @Test(groups = "Smoke")
    public void users() {
        System.out.println("Users from Car loan");
    }

    @Test
    public void volkswagon() {
        System.out.println("Volkswagon Loan");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After the test case execution");
    }
}
