import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Task2Test {
    private static Task2 task;

    @Before
    public void initTest(){
        task = new Task2();
        System.out.println("init ready");
    }

    @AfterClass
    public static void destroy(){
        task = null;
    }

    @Test
    public void testAdd(){

        int [] arr = {1,2,3};
       boolean result = task.oneFour(arr);
       Assert.assertTrue(result);
    }

    @Test
    public void testAdd2(){

        int [] arr = {8,2,3};
        boolean result = task.oneFour(arr);
        Assert.assertFalse(result);
    }

    @Test
    public void testAdd3(){

        int [] arr = {0,2,3,7,8,9};
        boolean result = task.oneFour(arr);
        Assert.assertFalse(result);
    }

    @Test
    public void testAdd4(){

        int [] arr = {0,2,3,7,4,9};
        boolean result = task.oneFour(arr);
        Assert.assertTrue(result);
    }


}
