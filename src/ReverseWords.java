import java.io.*;
public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		//BufferedReader br = new BufferedReader(new FileReader("C:/Users/Santosh/Desktop/B-small-practice.in"));
		BufferedReader br = new BufferedReader(new FileReader("C:/Users/Santosh/Desktop/B-large-practice.in"));
		
	    String[] strNums;
	    int i = Integer.parseInt(br.readLine());
	    int Count = 1;
	    while (i > 0) {
	    	strNums = br.readLine().split("\\s");
	    	String[] Result = new String[strNums.length+strNums.length-1];
	    	/*for (int k=0,l=0; k<Result.length;k++) {
	    		if((k%2)==0){
	    			Result[k]=strNums[l];
	    			l++;
	    		}
	    		else {
	    			Result[k]=" ";
	    		}
	    	}*/
	    	System.out.print("Case #"+Count+":");
	    	for(int j=0; j<strNums.length; j++) {
	    		System.out.print(" ");
	    		//List[j] = Integer.parseInt(strNums[j]);
	    		System.out.print(strNums[strNums.length-j-1]);
	    		
	        }
	    	System.out.println();
	    	i--;
	    	Count++;
	    }
		}
		catch (Exception e) {
	        System.out.println(e);
	    }
	}

}
