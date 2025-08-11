import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


//비어있는 공집합 S가 주어졌을 때, 아래 연산을 수행하는 프로그램을 작성하시오.
//add x:S에 x를 추가한다.S에 x가 이미 있는 경우에는 연산을 무시한다.
//remove x
//check x
//togle x
//all  S{1,2,3...,20} 으로바꾼다
//empty 공집합으로 바꾼다
//시간 복잡도는 O(n) 인듯?
public class Main{
        public static void main(String[] args) throws IOException {
//            List<Integer> list=new ArrayList<>();  처음엔 ArrayList로 하려했으나
            Set<Integer> set = new HashSet<>(); //hashset은 중복을 자동으로 제거한다.
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb=new StringBuilder(); //StringBuilder로 모든 출력 결과를 마지막에 한번만 출력한다.
//            int n=br.read();  read()로 하면 자동으로 int형변환이 되는줄알았는데
            // 그게 아니라 26이라면 2의 아스키코드인 50을 반환하게 됨.
            int n=Integer.parseInt(br.readLine());

            for(int i=0;i<n;i++) {
                int num=0;
                StringTokenizer st = new StringTokenizer(br.readLine()," ");
                String act=st.nextToken(); //String 형태로 꺼낸다
                if(st.hasMoreTokens()){
                    num=Integer.parseInt(st.nextToken()); //다음 토큰을꺼내고 int형으로 형변환
                    //all 이나 empty 가 올때 num이 없을 가능성
                }
                switch(act){
                    case "add":{
                        set.add(num);
                        break;
                    }
                    case "remove":{
                        set.remove(num);
                        break;
                    }
                    case "check":{
                        if(set.contains(num)){
                            sb.append("1\n");
//                            System.out.println(1);  System.out.println()을 너무 많이 호출해서 시간 초과됨
                        }else{
                            sb.append("0\n");
//                            System.out.println(0);

                        }
                        break;
                    }
                    case "toggle":{
                        if(set.contains(num)){
                           set.remove(num);
                        }else{
                            set.add(num);
                        }
                        break;
                    }
                    case "all":{
                        set.clear();
                        Collection<Integer> newInt=Arrays.asList(1,2,3,4,5,6,7,8,9,10,
                                11,12,13,14,15,16,17,18,19,20);
                            set.addAll(newInt); //addAll(Collection c) 주어진 컬렉션에 있는 모든 요소를 추가한다.
                    break; // 와 break문 뺴놓고 왜 요소가 없지 생각하고 있었다.
                    }
                    case "empty":{
                        set.clear();
                        break;
                    }
                }
            }

            System.out.println(sb);
        }
    }
