import java.util.*;

public class Main{

    //가장 짧은 거리에 있는 방
    //W개 방이 있는 H층 건물
    //방과 방 사이의 거리는 1
    //YYXX or YXX  Y나 YY는 층수 XX는 엘베에서부터 세었을 때의 번호
    //엘베 거리는 신경 X YY는 걷는 거리 포함 하지 않는다
    //다만 걷는 거리가 같으면 YY가 낮을 수록 선호
    //방이 모두 비어있을 때,N번째로 도착한 손님에게 배정될 방 번호 게산 프로그램
    //h:층 w:한층당 방개수 n:몇번째 손님
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        List<Integer> arr1=new ArrayList<>();

        for (int i = 0; i < a; i++) {
            String[] arr=sc.nextLine().split(" ");
                arr1.add(Integer.parseInt(arr[0]));
                arr1.add(Integer.parseInt(arr[1]));
                arr1.add(Integer.parseInt(arr[2]));
            }
      
        for(int j=0;j<a*3;j+=3){ //케이스 실행
        int h=arr1.get(j);
        int w=arr1.get(j+1);
        int n=arr1.get(j+2);
        int count=0;
            StringBuilder sb=new StringBuilder();

        for(int k=1;k<=w;k++){ //XX

            for(int z=1;z<=h;z++){ //YY OR Y 101 201 301 401 501 601 701 801 901

                count++;

                if(count==n){
                        sb.append(z);
                        if(k<10){
                            sb.append(0);
                            sb.append(k);
                        }else{
                            sb.append(k);
                        }

                    }
                }
            }

        System.out.println(sb);

        }



        }
    }
