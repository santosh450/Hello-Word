import java.io.*;
public class Test {

	/*private static final String FILENAME = "C:\\Users\\Santosh\\Desktop\\A-small-practice.in";*/
	public int setA(int a) {
		int i = a;
	    int Upper;
	    int Lower;
	    int Temp;
	    int res=0;
	    boolean flag = true;
		res = i;
		if (String.valueOf(a).length() == 1){
			return a;
		}
		else {
			while (res> 0){
				int bump = res;
			int len = String.valueOf(res).length();
			while (len >= 2){

				Upper = bump%10;
	    		Temp = bump/10;
	    		Lower = bump%10;
	    		if(Upper >= Lower){
	    			flag = true;
	    			}
	    		else{
	    			flag = false;
	    			break;
	    		}
	    		len--;
	    		bump = bump/10;
			}
			if (flag == true){
				//System.out.println("Case T@:"+res);
				return res;
			}
			//else {
				res--;
				//System.out.println("Case Res%:"+res);
			//}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		

		try {
		   // BufferedReader br = new BufferedReader(new FileReader("C:/Users/Santosh/Desktop/A.txt"));
		    BufferedReader br = new BufferedReader(new FileReader("C:/Users/Santosh/Desktop/B-small-attempt0.in"));
		    //BufferedReader br = new B	ufferedReader(new FileReader("\A-small-practice.in"));
		    
		    
		    int i = Integer.parseInt(br.readLine());
		    int result = 0;
		    int p=0;
		    Test t = new Test();
		    while (i > 0) {
		    	//System.out.println("I value  :"+i);
		    	int Value = Integer.parseInt(br.readLine());
		    	p++;
		    	System.out.println("Test No "+p+": "+Value);
		    	result = t.setA(Value);
		    	System.out.println("Result No "+p+": "+result);   	
		    	   }
		    
		 br.close();   	
		}
		catch (Exception e) {
	        System.out.println(e);
	    } 
		
		
	}

}
