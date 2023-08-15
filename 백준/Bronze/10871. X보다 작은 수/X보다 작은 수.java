import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    	Scanner scanner=new Scanner(System.in);
    	int num=scanner.nextInt();
    	int num2=scanner.nextInt();
    	scanner.nextLine();
    	
    	String numbers=scanner.nextLine();
    	String[] numberss=numbers.split(" ");
    	int[] numbersss=new int[num];
    	
    	for(int i=0;i<num;i++) {
    		numbersss[i]=Integer.parseInt(numberss[i]);
    	}
    	for(int j=0;j<num;j++) {
    		if(numbersss[j]<num2) {
    			System.out.printf("%d ",numbersss[j]);
    	}
    }
}
}