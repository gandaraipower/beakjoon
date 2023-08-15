import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
 Scanner scanner=new Scanner(System.in);
 int num1=scanner.nextInt();
 int num2=scanner.nextInt();
 int sum=0;
 sum=num1+num2;
 while(num1+num2!=0){
	 System.out.println(sum);
	 num1=scanner.nextInt();
	 num2=scanner.nextInt();
	 sum=num1+num2;
 }
if(sum==0)
	 System.exit(0);
}
}
