import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
 Scanner scanner=new Scanner(System.in);
 int num1=scanner.nextInt();
 int num2=scanner.nextInt();
 int sum=0;
        
 sum=num1+num2;
 System.out.println(sum);       
 while(scanner.hasNext()){ // 입력이 더 있을 때까지 반복
	 num1=scanner.nextInt();
	 num2=scanner.nextInt();
	 sum=num1+num2;
     System.out.println(sum);
 }
scanner.close(); //Scanner 리소스 닫기
}
}
