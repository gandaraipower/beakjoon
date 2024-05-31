class Solution {
    fun solution(s: String): String {
        val result = StringBuilder()
        var capitalizeNext = true //true이면 다음 알파벳을 uppercase함

        for (char in s) { //문자열 순회
            if (char == ' ') { //만약 공백이라면
                result.append(char) //공백추가
                capitalizeNext = true //다음 알파벳을 uppercase
            } else { //공백이 아니라면
                if (capitalizeNext) { //참일 경우 , uppercase나 lowercase는 비문자나 숫자가 올 경우 그대로 나옴
                    result.append(char.uppercaseChar()) //uppercase
                    capitalizeNext = false //false로 바꿈
                } else { //거짓일 경우
                    result.append(char.lowercaseChar()) //lowercase
                }
                if (!char.isLetter()) { //숫자나 다른 비문자일 경우
                    capitalizeNext = false //false로 변경
                }
            }
        }

        return result.toString()
    }
}


/* 이건 실패함 처음이 공백이고 그다음이 알파벳일수도 있음
for(i in inputs.indices) {
    val word=inputs[i]
    if(word.isNotEmpty()){
        var charArray = word.toCharArray() //분리한 문자열을 문자 배열로 전환해 저장
        if(charArray[0] in 'a' .. 'z')
            charArray[0]= charArray[0].uppercaseChar() //uppercaseChar()는 'a'를 'A'로 바꿈
        for (j in 1 until charArray.size) {
            if(charArray[j] in 'A' .. 'Z')
                charArray[j]=charArray[j].lowercaseChar() //lowercaseChar()는 'A'를 'a'로 바꿈
        }

        answer.append(charArray.concatToString()) //append는 StringBuilder()에서 사용가능한 메소드
        //concatToString()은 문자 배열을 문자열로 변환하는 함수, 이를 통해 문자 배열을 문자열로 전환후 추가함

        if(i < inputs.size - 1) //공백을 추가하기 위함, 마지막 배열을 넣은 후에는 공백추가 X
            answer.append(" ")
    }
}

return answer.toString() //함수의 반환타입이 String이므로 toString()으로 String으로 전환
}
}
*/
