class Solution {
    //n 다음 숫자:N = n보다 큰 자연수
    //n다음 숫자,n은 2진수로 변환했을 때 1의 개수가 같다
    //n 다음 숫자는 위의 조건 중 가장 작은 수
    public int solution(int n) {

        int nOneCount=0;
        String nBinaryNum=Integer.toBinaryString(n);
            for(int i=0;i<nBinaryNum.length();i++){
                char a=nBinaryNum.charAt(i);
                if(a=='1'){
                    nOneCount++;
                }
            }
        
        while(true){
            n++;
            int oneCount=0;
            String binaryNum=Integer.toBinaryString(n);
            for(int i=0;i<binaryNum.length();i++){
                char a=binaryNum.charAt(i);
                if(a=='1'){
                    oneCount++;
                }
            }
            if(nOneCount==oneCount){
                return n;
            }
        }
    }
}