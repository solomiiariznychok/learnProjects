import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleCalculateTests {

    @Test(priority = 1)
    public void calculateTest1() {
        int a = 2;
        int b = 2;
        int c = 2 + 2;
        System.out.println("Calculation Test1 is running");
        Assert.assertEquals(c, 4);
    }

    @Test(priority = 2)
    public void calculateTest2() {
        int a = 10;
        int b = 2;
        int c = 10 - 2;
        System.out.println("Calculation Test2 is running");
        Assert.assertEquals(c, 8);
    }

    @Test(priority = 3)
    public void calculateTest3() {
        int a = 10;
        int b = 2;
        int c = 10 + 2;
        System.out.println("Calculation Test3 is running");
        Assert.assertEquals(c, 12);
    }

    @Test(priority = 4)
    public void calculateTest4() {
        int a = 10;
        int b = 2;
        int c = 10 * 2;
        System.out.println("Calculation Test4 is running");
        Assert.assertEquals(c, 20);
    }

    @Test(priority = 5)
    public void calculateTest5() {
        int a = 10;
        int b = 2;
        int c = 10 / 2;
        System.out.println("Calculation Test5 is running");
        Assert.assertEquals(c, 5);
    }
}
