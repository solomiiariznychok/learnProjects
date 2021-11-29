import org.testng.annotations.Test;

public class SimpleTests {

    @Test(priority = 1)
    public void test_check1(){
        System.out.println("Simple test1 is running");
    }

    @Test(priority = 2)
    public void test_check2(){
        System.out.println("Simple test2 is running");
    }

    @Test(priority = 3)
    public void test_check3(){
        System.out.println("Simple test3 is running");
    }

    @Test(priority = 4)
    public void test_check4(){
        System.out.println("Simple test4 is running");
    }

    @Test(priority = 5)
    public void test_check5(){
        System.out.println("Simple test5 is running");
    }

    @Test(priority = 6)
    public void test_check6(){
        System.out.println("Simple test6 is running");
    }

    @Test(priority = 7)
    public void test_check7(){
        System.out.println("Simple test7 is running");
    }

    @Test(priority = 8)
    public void test_check8(){
        System.out.println("Simple test8 is running");
    }
    
     @Test(priority = 9)
     public void test_check9(){
       Assert.assertEquals(5, 4);   
     }
}
