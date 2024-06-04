class Solution {
    fun solution(x: Int): Boolean {
    var sum=0
    val digits=x.toString().map { it.toString().toInt() } //문자열로 바꾸고 맵함수를 통해 하나씩 리스트에 저장
    var answer=true
    for(i in digits)
    {
        sum+=i
    }

    if(x%sum==0)
    {
        answer=true
    }
    else
        answer=false
        return answer
    }
}