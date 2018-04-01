public class CalSubArray {
public int Cal(int array[] ) {
        
	   int CurMax = 0; //当前子数组最大值    
       int Max = 0;           
       for (int i = 0; i < array.length; i++) {
    	  
    	  
             CurMax+= array[i];    
            if(CurMax>Max)         //如果CurMax大于Max,更新Max
               Max = CurMax; //保证Max值始终为最大值
            if (CurMax < 0)
            
            	CurMax = 0;
    }   
        return Max; 
  }  

}
