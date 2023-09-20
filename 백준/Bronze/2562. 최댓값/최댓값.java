import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    	Scanner scanner=new Scanner(System.in);
    	
    	
    	int[] number=new int[9];

    	for(int i=0;i<9;i++) {
    		number[i]=scanner.nextInt();
    	}
    	int best=-1;
    	int result=0;
    	for(int i=0;i<9;i++) {
    		if(best<number[i])
    		{
    			best=number[i];
    			result=i+1;
    		}
    	}
    	
    	System.out.printf("%d\n%d",best,result);
}
}