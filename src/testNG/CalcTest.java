package testNG;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest {
	
   Calc ca=new Calc();
   
   @Test
   public void add01()
   {
	 System.out.println("测试加法01");
	 Assert.assertEquals(ca.add(1, 2), 3,"");
   }

   @Test
   public void add02()
   {
	   System.out.println("测试加法02"); 
	   Assert.assertEquals(ca.add(2, 2), 4,"错误");
   }
}
