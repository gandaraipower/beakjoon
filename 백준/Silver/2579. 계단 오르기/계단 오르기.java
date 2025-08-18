import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//계단은 한번에 한 칸 혹은 두칸
//단, 연속된 세 칸을 밟아서는 안됨, 시작점은 포함 X
//점수의 최댓값 구하기
//높은것만 밝아가며 가야함.
//6칸이라면 최대 4칸까지만 밝을 수 있음 연속 세칸은 못밟으니까
//7칸이라면 5칸임
//최대 밟을 칸은 input-2
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int input=Integer.parseInt(br.readLine());
        int[] sum=new int[input + 1 ]; //1부터 시작하기 위해 input +1로 크기 설정
        int[] score=new int[input+1];
        
        for(int i=0;i<input;i++){
            int inputs=Integer.parseInt(br.readLine());
            score[i+1]=inputs;
        }

    int count=0;
    int a=1;
        //첫번째는 무조건 밟는다.
       sum[1]=score[1];

       if(input>=2){  //입력값이 2 이상일때 sum[2] 값 구하기
           sum[2]=score[1]+score[2];
       }
       if(input>=3){ //입력값이 3 이상일 때 sum[3] 값 구하기
           sum[3]=Math.max(score[1],score[2])+score[3];
       }

       //sum[4] 부터 시작
       for(int i=4;i<input+1;i++){
           //sum[i]는 i번 움직였을 때 최댓값
           //그럴러면 sum[i-2] 두칸전에서 score[i]를 더하거나
           //sum[i-3] 3칸전에서 sum[i-1] 1칸전으로 뛰고 score[i]를 더한다.
           sum[i]=Math.max(sum[i-2],sum[i-3]+score[i-1]) + score[i];
       }
            System.out.println(sum[input]);
        }
        //이제 이어서 다음칸을 밟거나
        //한칸 건너뛰고 밟거나 이렇게 두가지 경우

    }