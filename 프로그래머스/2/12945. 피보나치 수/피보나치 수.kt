class Solution {
    fun solution(n: Int): Int {
     var a = 0
        var b = 1
        var temp: Int
        for (i in 2..n) {
            temp = (a + b) % 1234567 //중간 결과가 매우 큰 수가 되더라도 그 값을 작게 유지하여 연산을 빠르고 효율적으로 처리하기 위함
            a = b
            b = temp
        }
        return b
    }
}

/*
var a=0
var b=1
var sub=0

for(i in 2 .. n){
    sub=a+b
    a=b //1 
    b=sub //1

}
var answer = b
answer=answer%1234567*/
