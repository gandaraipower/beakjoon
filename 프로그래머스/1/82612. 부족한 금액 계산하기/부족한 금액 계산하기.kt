class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = -1
        var p=price.toLong()
        var sum:Long= 0
        var price2:Long=0
    
        for(i in 1 .. count){
            sum+=(p*i) //100 
            p=price.toLong()
        }
        if(money-sum>=0)
        {
            return 0
        }
        else
            return sum-money
    }
}