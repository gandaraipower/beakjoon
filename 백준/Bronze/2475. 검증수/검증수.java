import java.util.*;


public class Main {
    //고유번호 6자리
    //처음 5자리 00000~99999
    //6번째 자리 검증수
    //검증수는 5자리 합%10
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String a=sc.nextLine();
        String[] arr=a.split(" ");

      List<Integer> list=new ArrayList<>();
        int sum=0;
      for(int i=0;i<5;i++){
          sum+=(Integer.parseInt(arr[i])*Integer.parseInt(arr[i]));
      }
      int six=sum%10;

      System.out.println(six);



    }
}

