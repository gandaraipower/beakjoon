import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[] baskets=new int[N];
        
        for(int i=0;i<N;i++) {
        	baskets[i]=i+1;
        }
        
        for(int a=0;a<M;a++) {
        	int i=sc.nextInt()-1;
        	int j=sc.nextInt()-1;
        	int temp=0;
        	temp=baskets[i];
        	baskets[i]=baskets[j];
        	baskets[j]=temp;
        }
        for(int b=0;b<N;b++) {
        	System.out.print(baskets[b]+" ");
        }
    }
}