import java.util.Scanner;

public class Main{

    //1부터 N까지 한 줄에 하나씩 출력
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String a=sc.nextLine();
        int b=Integer.parseInt(a);

        for(int i=1;i<=b;i++){
            System.out.println(i);
        }



    }
}

