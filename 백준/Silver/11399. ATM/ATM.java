import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


//N명의 사람 줄을 서있다
//1~N까지 번호
//i번 사람이 돈을 인출하는데 Pi분
//결국 Pi가 짧은 사람이 맨앞으로 와야한다 정렬 이것도 맵문제인가? 셋?
//그냥 1차원 배열이나 리스트도 가능할거같은데? 몇번째 사람인지 중요하지 않은듯?
//Collections.sort(list);
//1 2 3 4 5
public class Main{
        public static void main(String[] args) throws IOException {
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            int N=Integer.parseInt(br.readLine());
            List<Integer> list=new ArrayList<>();
            StringTokenizer st=new StringTokenizer(br.readLine(),(" "));

            for(int i=0;i<N;i++){
                list.add(Integer.parseInt(st.nextToken()));
//                System.out.print(list.get(i));
            }

            Collections.sort(list);
            int sum=0;
            int sum2=0;
            int sum3=0;
            for(int j=0;j<N;j++){
                sum=sum2+list.get(j);
                sum2=sum;
                sum3+=sum2;
            }
            //

            System.out.println(sum3);
        }
     }
