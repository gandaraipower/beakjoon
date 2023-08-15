import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
 Scanner scanner=new Scanner(System.in); 
 int num=scanner.nextInt(); //배열 크기를 정하기 위한 숫자 입력
 scanner.nextLine(); //개행 문자 처리(다시 초기화 시키는 느낌)
 
 String inputLine=scanner.nextLine();	 //숫자를 입력받을 string 생성
 String[] numbers=inputLine.split(" ");  //공백으로 숫자 구분,배열이 문자열 형태로 저장
 int[] numberss=new int[num]; //문자열 형태로 저장된 배열을 정수로 변환하여 저장하기 위해 int 배열 생성
 
 for(int i=0;i<num;i++) { 
	 numberss[i]=Integer.parseInt(numbers[i]); //정수로 변환하여 저장
 }
 
 int count=0;
 int num2=scanner.nextInt();
 
 for(int j=0;j<num;j++) {
	 if(numberss[j]==num2) {
		 count++;
	 }
 }
 
 System.out.println(count);
scanner.close();
    }
}
