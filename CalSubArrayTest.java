import static org.junit.Assert.*;
import org.junit.Test;
public class CalSubArrayTest  {
	

	 @Test
	 public void Cal0(){
		 int a0[]=new int[]{1,3,5,0,5};
        assertEquals(14, new CalSubArray().Cal(a0));
 }
    @Test
    public void Cal1(){
    	int a1[]=new int[]{-1,-9,-2,-1,-5,-1};
        assertEquals(0, new CalSubArray().Cal(a1));
}
    @Test
    public void Cal2(){
    	int a2[]=new int[]{2,-1,-1,4,-1};
        assertEquals(4, new CalSubArray().Cal(a2));}
    @Test
    public void Cal3(){
    	int a3[]=new int[]{-2,11,-4,13,-5,-2};
        assertEquals(20, new CalSubArray().Cal(a3));}
}
