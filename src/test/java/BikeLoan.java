import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
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

    @Test(groups = "Smoke", dataProvider = "getData")
    public void users(String userName, String pwd) {
        System.out.println("Users from bike loan");

        System.out.print("Username : "+userName);
        System.out.println("\tPassword : "+pwd);

    }

    @Parameters("URL")
    @Test
    public void parameterised(String url) {
        System.out.println("URL parameter : "+url);

    }

    @Test
    public void testListner() {
         Assert.assertTrue(false);
    }


    @DataProvider
    public Object[][] getData() {
        //A multidimentional array with 3 rows and 2 columns
        Object[][] users = new Object[3][2];

        //Each row contains one username and pwd
        users[0][0]="Rekhin";users[0][1]="Rekhin_pwd";
        users[1][0]="Ragesh";users[1][1]="Ragesh_pwd";
        users[2][0]="Nayana";users[2][1]="Nayana_pwd";

        return users;
    }
}
