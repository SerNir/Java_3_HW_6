import org.junit.*;

public class MethodTest {
   private static Method method;

   @Before
   public void initTest(){
      method = new Method();
      System.out.println("init ready");
   }

   @AfterClass
   public static void destroy(){
      method = null;
   }

   @Test
   public void testAdd(){
      int[]result = {1,2,3,4,5,6,7,8,9};
      int[]result2 =       method.arr(result);
              Assert.assertEquals(5, result2.length);
   }

   @Test
   public void testAdd2(){
      int[]result = {1,2,3,4,5,6,4,8,9};
      int[]result2 =       method.arr(result);
      Assert.assertEquals(2, result2.length);
   }
   @Test(expected = RuntimeException.class)
   public void testAdd3(){
      int[]result = {1,2,3,5,6,8,9};
      int[]result2 =       method.arr(result);
      Assert.assertEquals(2, result2.length);
   }
   @Test
   public void testAdd4(){
      int[]result = {1,4,3,6,5,6,9,8,9};
      int[]result2 =       method.arr(result);
      Assert.assertEquals(7, result2.length);
   }
}
