import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[] baskets=new int[N];
        
        for(int i=0;i<M;i++) {
        	int first=sc.nextInt()-1;
        	int last=sc.nextInt()-1;
        	int number=sc.nextInt();
        	
        	for(int j=first;j<=last;j++) {
        		baskets[j]=number;
        	}
         
        }
        for(int z=0;z<N;z++) {
        	System.out.print(baskets[z]+" ");
        }
    }
}