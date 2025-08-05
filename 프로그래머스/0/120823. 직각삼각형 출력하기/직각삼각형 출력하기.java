import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //1
        //2
        //3
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<count;j++){
                System.out.print("*");
            }
                count++;
            System.out.println();
        }

    }
}