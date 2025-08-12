import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


//첫번째 줄 듣도 못한 사람 수 N, 보도 못한 사람의 수 M이 주어진다.
//둘째 줄 부터 N개의 줄에 걸쳐 듣도 못한 사람의 이름과, N+2째 줄부터 보도 못한 사람의 이름이 순서대로 주어진다.
//중복되는 사람은 X
//사전 순으로 출력

public class Main{
        public static void main(String[] args) throws IOException {
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st=new StringTokenizer(br.readLine(),(" "));
            int n=Integer.parseInt(st.nextToken());
            int m=Integer.parseInt(st.nextToken());

            Set<String> hashSet=new HashSet<>();
            for(int i=0;i<n;i++){
                hashSet.add(br.readLine());
            }
            List<String> list=new ArrayList<>();

            for(int j=0;j<m;j++){
                String a=br.readLine();
                if(hashSet.contains(a)){
                    list.add(a);
                }
            }

            System.out.println(list.size());
            Collections.sort(list);
                for(String l:list){
                System.out.println(l);
            }

        }
    }
