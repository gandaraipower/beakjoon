import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    	Scanner scanner=new Scanner(System.in);
    	int num=scanner.nextInt();
    	scanner.nextLine();
    	
    	String numbers=scanner.nextLine();
    	String[] numberss=numbers.split(" ");
    	int[] numbersss=new int[num];
    	
    	for(int i=0;i<num;i++) {
    		numbersss[i]=Integer.parseInt(numberss[i]);
    	}
    	int best=0;
    	int worst=0;
    	best=numbersss[0];
		worst=numbersss[0];
    	for(int j=1;j<num;j++) {
    		if(best>numbersss[j])
    			;
    		else 
    			best=numbersss[j];
    		
    		if(worst<numbersss[j])
    			;
    		else
    			worst=numbersss[j];
    	}
    	System.out.printf("%d %d",worst,best);
}
}