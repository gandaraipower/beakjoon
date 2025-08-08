import java.util.*;

public class Main{

    //1부터 N까지 한 줄에 하나씩 출력
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //첫줄 a+b-c 수
        //둘째줄 a+b-c 문자열
        String a=sc.nextLine();
        String b=sc.nextLine();
        String c=sc.nextLine();

        //미리 정수로 바꿔놓기
        int aNum=Integer.parseInt(a);
        int bNum=Integer.parseInt(b);
        int cNum=Integer.parseInt(c);

        //문자열 a+b 해놓기
        String sum=a+b;
        int abSum=Integer.parseInt(sum);
        System.out.println(aNum+bNum-cNum);
        System.out.println(abSum-cNum);
    }
}

